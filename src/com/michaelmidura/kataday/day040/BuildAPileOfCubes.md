<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #40: Build a pile of Cubes</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [ASum.java](ASum.java)
* <b>Test Class:</b> [ASumTest.java](ASumTest.java)
* <b>Solved:</b> Sunday, May 29<sup>th</sup>, 2016

<b>Description:</b>

Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.

You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?

The parameter of the function findNb <code>(find_nb, find-nb)</code> will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.

<b>Examples:</b>

<pre><code>findNb(1071225) --> 45
findNb(91716553919377) --> -1</code></pre>

<b>Suggestion:</b>

Try to optimize your function.