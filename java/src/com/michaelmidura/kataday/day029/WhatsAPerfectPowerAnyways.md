<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #29: What's a Perfect Power anyway?</b>

* <b>Difficulty:</b> 5 kyu
* <b>Solution Class:</b> [PerfectPower.java](PerfectPower.java)
* <b>Test Class:</b> [PerfectPowerTest.java](PerfectPowerTest.java)
* <b>Solved:</b> Monday, May 16<sup>th</sup>, 2016

<b>Description:</b>

A <a href="https://en.wikipedia.org/wiki/Perfect_power">perfect power</a> is a classification of positive integers:

<blockquote>In mathematics, a <b>perfect power</b> is a positive integer that can be expressed as an integer power of another positive integer. More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that m<sup>k</sup> = n.</blockquote>

Your task is to check wheter a given integer is a perfect power. If it is a perfect power, return a pair <code>m</code> and <code>k</code> with m<sup>k</sup> = n as a proof. Otherwise return Nothing, Nil, null, None or your language's equivalent.

Note: For a perfect power, there might be several pairs. For example <code>81 = 3^4 = 9^2</code>, so <code>(3,4)</code> and <code>(9,2)</code> are valid solutions. However, the tests take care of this, so if a number is a perfect power, return any pair that proves it.

<b>Examples</b>

<pre><code>isPerfectPower(4) => new int[]{2,2}
isPerfectPower(5) => null
isPerfectPower(8) => new int[]{2,3}
isPerfectPower(9) => new int[]{3,2}</code></pre>