diagonal-traversing-matrix
==========================

Traversing a NxM matrix using diagonals.

Class that receiving a char matrix like the following:

<pre><code>
<ul>
<li>    0     1     2
<li>0 [ A ] [ B ] [ C ]</li>
<li>1 [ D ] [ E ] [ F ]</li>
<li>2 [ G ] [ H ] [ I ]</li>
</ul>
</code></pre>

Print the matrix member in the next order:
 
<pre><code>[ G ] [ D] [ H ] [ A ] [ E ] [ I ] [ B ] [ F ] [ C ]</code></pre>

The traversing implemented in the code is an left-to-right and up-to-down
diagonal starting in the point (maximum row, minimum column) and finishing in
the point (minimum row, maximum column).

The input matrix might be a square of a rectangle. (the number of rows does
not have to be the same as the number of columns)
