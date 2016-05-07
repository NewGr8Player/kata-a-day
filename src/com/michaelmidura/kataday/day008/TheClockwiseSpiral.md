<a href=https://github.com/michaelwm/KataDay>Back to README<a>

<b>Day #8: The Clockwise Spiral</b>

* <b>Difficulty:</b> 5 kyu
* <b>Solution Class:</b> [TheClockwiseSpiral.java](TheClockwiseSpiral.java)
* <b>Test Class:</b> [TheClockwiseSpiralTest.java](TheClockwiseSpiralTest.java)
* <b>Solved:</b> Wednesday, April 27<sup>th</sup>, 2016

<b>Description:</b>

<b>Do you know how to make a spiral? Let's test it!</b>

<hr>

<i>Classic definition: A spiral is a curve which emanates from a central point, getting progressively farther away as it revolves around the point.</i>

<hr>

Your objective is to complete a function <code>createSpiral(N)</code> that receives an integer <code>N</code> and returns two-dimensional array where numbers from <code>1</code> to <code>N</code> should be represented as clockwise spiral.

Return an empty array if <code>N < 1</code>

Examples:

<code>N = 3</code> <code>Output: [[1,2,3],[8,9,4],[7,6,5]]</code>

<pre><code>1    2    3
8    9    4
7    6    5</code></pre>

<code>N = 4</code> <code>Output: [[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]]</code>

<pre><code>1   2   3   4
12  13  14  5
11  16  15  6
10  9   8   7</code></pre>

<code>N = 5</code> <code>Output: [[1,2,3,4,5],[16,17,18,19,6],[15,24,25,20,7],[14,23,22,21,8],[13,12,11,10,9]]</code>

<pre><code>1   2   3   4   5
16  17  18  19  6
15  24  25  20  7
14  23  22  21  8
13  12  11  10  9</code></pre>
