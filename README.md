diagonal-traversal-matrix
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

The traversal implemented in the code is an left-to-right and up-to-down
diagonal starting in the point (maximum row, minimum column) and finishing in
the point (minimum row, maximum column).

The input matrix might be a square of a rectangle. (the number of rows does
not have to be the same as the number of columns)

Tests
-----

The test is included inside of the Matrix class within the main function.

I have included two different matrixes:

<pre><code>
<ul>
<li>    0     1     2
<li>0 [ A ] [ B ] [ C ]</li>
<li>1 [ D ] [ E ] [ F ]</li>
<li>2 [ G ] [ H ] [ I ]</li>
</ul>

<b>Output would be: <i>[G] [D] [H] [A] [E] [I] [B] [F] [C]</i></b>

<ul>
<li>    0     1     2    3
<li>0 [ A ] [ B ] [ C ] [ D ]</li>
<li>1 [ E ] [ F ] [ G ] [ H ]</li>
<li>2 [ I ] [ J ] [ K ] [ L ]</li>
</ul>

<b>Output would be: <i>[I] [E] [J] [A] [F] [K] [B] [G] [R] [C] [H] [D]</i></b>

</code></pre>


