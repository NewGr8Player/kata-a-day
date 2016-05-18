<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #31: The Millionth Fibonacci Kata</b>

* <b>Difficulty:</b> 3 kyu
* <b>Solution Class:</b> [Fibonacci.java](Fibonacci.java)
* <b>Test Class:</b> [FibonacciTest.java](FibonacciTest.java)
* <b>Solved:</b> Wednesday, May 18<sup>th</sup>, 2016

<b>Description:</b>

The year is 1214. One night, Pope Innocent III awakens to find the the archangel Gabriel floating before him. Gabriel thunders to the pope:

<blockquote>Gather all of the learned men in Pisa, especially Leonardo Fibonacci. In order for the crusades in the holy lands to be successful, these men must calculate the <i>millionth</i> number in Fibonacci's recurrence. Fail to do this, and your armies will never reclaim the holy land. It is His will.</blockquote>

The angel then vanishes in an explosion of white light.

Pope Innocent III sits in his bed in awe. <i>How much is a million?</i> he thinks to himself. He never was very good at math.

He tries writing the number down, but because everyone in Europe is still using Roman numerals at this moment in history, he cannot represent this number. If he only knew about the invention of zero, it might make this sort of thing easier.

He decides to go back to bed. He consoles himself, <i>The Lord would never challenge me thus; this must have been some deceit by the devil. A pretty horrendous nightmare, to be sure.</i>

Pope Innocent III's armies would go on to conquer Constantinople (now Istanbul), but they would never reclaim the holy land as he desired.

<hr>

In this kata you will have to calculate <code>fib(n)</code> where:

<pre><code>fib(0) := 0
fib(1) := 1
fin(n + 2) := fib(n + 1) + fib(n)
Write an algorithm that can handle <i>n</i> where 1000000 ≤ <i>n</i> ≤ 1500000.</code></pre>

Your algorithm must output the exact integer answer, to full precision. Also, it must correctly handle negative numbers as input.

<b>HINT I:</b> Can you rearrange the equation <code>fib(n + 2) = fib(n + 1) + fib(n)</code> to find <code>fib(n)</code> if you already know <code>fin(n + 1)</code> and <code>fib(n + 2)</code>? Use this to reason what value <code>fib</code> has to have for negative values.

<b>HINT II:</b> See http://mitpress.mit.edu/sicp/chapter1/node15.html