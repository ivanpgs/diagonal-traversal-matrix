diagonal-traversing-matrix
==========================

Traversing a NxM matrix using diagonals.

Class that receiving a char matrix like the following:

0 [ A ] [ B ] [ C ]
1 [ D ] [ E ] [ F ]
2 [ G ] [ H ] [ I ]

Print the matrix member in the next order:

[ G ] [ D] [ H ] [ A ] [ E ] [ I ] [ B ] [ F ] [ C ]

The traversing implemented in the code is an left-to-right and up-to-down
diagonal starting in the point (maximum row, minimum column) and finishing in
the point (minimum row, maximum column).

The input matrix might be a square of a rectangle. (the number of rows does
not have to be the same as the number of columns)
