<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #34: Sum of Digits / Digital Root</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [DRoot.java](DRoot.java)
* <b>Test Class:</b> [DRootExampleTest.java](DRootExampleTest.java)
* <b>Solved:</b> Saturday, May 21<sup>st</sup>, 2016

<b>Description:</b>

In this kata, you must create a <code>digital root</code> function.

A digital root is the <i>recursive sum of all the digits in a number</i>. Given <i>n</i>, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

Here's how it works (Ruby example given):

<pre><code>digital_root(16)
=> 1 + 6
=> 7

digital_root(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6

digital_root(132189)
=> 1 + 3 + 2 + 1 + 8 + 9
=> 24 ...
=> 2 + 4
=> 6

digital_root(493193)
=> 4 + 9 + 3 + 1 + 9 + 3
=> 29 ...
=> 2 + 9
=> 11 ...
=> 1 + 1
=> 2</code></pre>