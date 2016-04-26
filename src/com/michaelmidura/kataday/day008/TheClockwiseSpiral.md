<b>The Clockwise Spiral</b>

<b>Description:</b>

<b>Do you know how to make a spiral? Let's test it!</b>

<hr>

<i>Classic definition: A spiral is a curve which emanates from a central point, getting progressively farther away as it revolves around the point.</i>

<hr>

Your objective is to complete a function <pre><code>createSpiral(N)</code></pre> that receives an integer <pre><code>N</code></pre> and returns two-dimensional array where numbers from <pre><code>1</code></pre> to <pre><code>N</code></pre> should be represented as clockwise spiral.

Return an empty array if <pre><code>N < 1</code></pre>

Examples:

<pre><code>N = 3</code></pre> <pre><code>Output: [[1,2,3],[8,9,4],[7,6,5]]</code></pre>

<pre><code>1    2    3
8    9    4
7    6    5</code></pre>

<pre><code>N = 4</code></pre> <pre><code>Output: [[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]]</code></pre>

<pre><code>1   2   3   4
12  13  14  5
11  16  15  6
10  9   8   7</code></pre>

<pre><code>N = 5</code></pre> <pre><code>Output: [[1,2,3,4,5],[16,17,18,19,6],[15,24,25,20,7],[14,23,22,21,8],[13,12,11,10,9]]</code></pre>

<pre><code>1   2   3   4   5
16  17  18  19  6
15  24  25  20  7
14  23  22  21  8
13  12  11  10  9</code></pre>
