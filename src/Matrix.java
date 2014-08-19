/**
 * 
 * Class that receiving a char matrix like the following:
 * 
 * ----0-----1-----2--
 * 
 * 0 [ A ] [ B ] [ C ]
 * 
 * 1 [ D ] [ E ] [ F ]
 * 
 * 2 [ G ] [ H ] [ I ]
 * 
 * Print the matrix member in the next order:
 * 
 * [ G ] [ D] [ H ] [ A ] [ E ] [ I ] [ B ] [ F ] [ C ]
 * 
 * The traversing implemented in the code is an left-to-right and up-to-down
 * diagonal starting in the point (maximum row, minimum column) and finishing in
 * the point (minimum row, maximum column).
 * 
 * The input matrix might be a square of a rectangle. (the number of rows does
 * not have to be the same as the number of columns)
 * 
 * @author Ivan Poza
 *
 */
public class Matrix {

    private final int MIN_ROW = 0;
    private final int MIN_COLUMN = 0;
    private int MAX_ROW = 0;
    private int MAX_COLUMN = 0;

    private char[][] myArray = null;
    private int currentRow;
    private int currentColumn;

    public static void main(String[] args) throws Exception {
	// { { 'A', 'B', 'C' }, { 'D', 'E', 'F'}, { 'G', 'H', 'I' } };
	char[][] myCharArray = { { 'A', 'B', 'C', 'D' },
		{ 'E', 'F', 'G', 'H' }, { 'I', 'J', 'K', 'R' } };
	Matrix myMatrix = new Matrix(myCharArray);
	myMatrix.printMatrixDiagonalDownRight();
    }

    public Matrix(char[][] myCharArray) throws Exception {
	if ((myCharArray == null) || (myCharArray.length == 0)) {
	    throw new Exception("Null or zero length are not allowed");
	}
	myArray = myCharArray;
	// Number of rows = 3 (0,1,2)
	MAX_ROW = myCharArray.length - 1;
	// Number of columns = 3 (0,1,2)
	MAX_COLUMN = myCharArray[0].length - 1;
    }

    public void printMatrixDiagonalDownRight() {
	moveToStartingCell();
	while (!isEndingCell()) {
	    printCurrentCell();
	    moveDiagonalDownRight();
	}
	printCurrentCell();
    }

    private void moveDiagonalDownRight() {
	if (canMoveDiagonalDownRight()) {
	    currentRow++;
	    currentColumn++;
	} else if (isMaxRow()) {
	    int diagonal = getUpperLeftDiagonalLenthFromCurrentPoint();
	    currentRow = (currentRow - diagonal);
	    currentColumn = (currentColumn - (diagonal - 1));
	    pushColumnToRighSideIfNecessary();
	} else if (isMaxColumn()) {
	    int diagonal = getUpperLeftDiagonalLenthFromCurrentPoint();
	    currentRow = (currentRow - (diagonal - 1));
	    currentColumn = (currentColumn - (diagonal - 2));
	    pushColumnToRighSideIfNecessary();
	}
    }

    private void pushColumnToRighSideIfNecessary() {
	// When the diagonal of the rectangle/square is maximun it could happen
	// that the currentRow become negative (concretely -1). That means that
	// the currentRow will be placed at the MINIMUN_ROW and the
	// currentColumn will be pushed to the Right 1 cell
	if (currentRow < 0) {
	    currentRow = MIN_ROW;
	    currentColumn++;
	}
    }

    private int getUpperLeftDiagonalLenthFromCurrentPoint() {
	return Math.min(currentRow, currentColumn) + 1;
    }

    private boolean canMoveDiagonalDownRight() {
	return ((currentRow + 1 <= MAX_ROW) && (currentColumn + 1 <= MAX_COLUMN));
    }

    private boolean isEndingCell() {
	return (isMinRow() && isMaxColumn());
    }

    private void moveToStartingCell() {
	currentRow = MAX_ROW;
	currentColumn = MIN_COLUMN;
    }

    private void printCurrentCell() {
	System.out.print("[" + myArray[currentRow][currentColumn] + "] ");
    }

    private boolean isMaxRow() {
	return currentRow == MAX_ROW;
    }

    private boolean isMinRow() {
	return currentRow == MIN_ROW;
    }

    private boolean isMinColumn() {
	return currentColumn == MIN_COLUMN;
    }

    private boolean isMaxColumn() {
	return currentColumn == MAX_COLUMN;
    }

}
