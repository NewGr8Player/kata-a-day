<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #43: Quick (n choose k) Calculator</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [QuickCalc.java](QuickCalc.java)
* <b>Test Class:</b> [QuickCalcTest.java](QuickCalcTest.java)
* <b>Solved:</b> Sunday, May 29<sup>th</sup>, 2016

<b>Description:</b>

You may be familiar with the concept of combinations: for example, if you take 5 cards from a 52 cards deck as you would playing poker, you can have a certain number (2,598,960, would you say?) of different combinations.

In mathematics the number of k combinations you can have taking from a set of n elements is called the <a href="https://en.wikipedia.org/wiki/Combination">binomial coefficient of n and k</a>, more popularly called n choose k.

The formula to compute it is relatively simple: <code>n choose k</code>==<code>n!/(k!*(n-k)!)</code>, where <code>!</code> of course denotes the factorial operator.

You are now to create a choose function that computes the binomial coefficient, like this:

<pre><code>choose(1,1)==1
choose(5,4)==5
choose(10,5)==252
choose(10,20)==0
choose(52,5)==2598960</code></pre>

Be warned: a certain degree of optimization is expected, both to deal with larger numbers precision (and their rounding errors in languages like JS) and computing time.