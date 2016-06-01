<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #45: Rainfall</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Rainfall.java](Rainfall.java)
* <b>Test Class:</b> [RainfallTest.java](RainfallTest.java)
* <b>Solved:</b> Tuesday, May 31<sup>st</sup>, 2016

<b>Description:</b>

<code>data</code> and <code>data1</code> are two strings with rainfall records of a few cities for months from January to December. The records of towns are separated by <code>\n</code>. The name of each town is followed by <code>:</code>.

<code>data</code>, <code>data1</code> and <code>towns</code> can be seen in "Your Test Cases:".

<b>Task:</b>

<pre><code>- function: mean(town, strng) should return the average of rainfall for the city `town` and the `strng` `data` or `data1`.
- function: variance(town, strng) should return the variance of rainfall for the city `town` and the `strng` `data` or `data1`.<code></pre>

<b>Examples:</b>

<pre><code>mean("London", data), 51.19(9999999999996)
variance("London", data), 57.42(833333333374)<code></pre>

<b>Notes:</b>

<pre><code>- if functions `mean`or `variance` have as parameter `town` a city which has no records return `-1`
- Don't truncate or round: the tests will pass if `abs(your_result - test_result) <= 1e-2`.
- <http://www.mathsisfun.com/data/standard-deviation.html>
- `data` and `data1` are adapted from <http://www.worldclimate.com></code></pre>