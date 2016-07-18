<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #47: Two cube sums</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Kata.java](Kata.java)
* <b>Test Class:</b> [Tests.java](Tests.java)
* <b>Solved:</b> Monday, June 1<sup>st</sup>, 2016

<b>Description:</b>

Create a function

<pre><code>boolean hasTwoCubeSums(int n)</code></pre>

which checks if a given number <code>n</code> can be written as the sum of two cubes in two different ways: <code>n = a³+b³ = c³+d³</code>. All the numbers <code>a</code>, <code>b</code>, <code>c</code> and <code>d</code> should be different and greater than <code>0</code>.

E.g. 1729 = 9³+10³ = 1³+12³.

<pre><code>hasTwoCubeSums(1729); // true
hasTwoCubeSums(42);   // false</code></pre>