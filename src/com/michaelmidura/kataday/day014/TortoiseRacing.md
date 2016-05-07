<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #14: Tortoise racing</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Tortoise.java](Tortoise.java)
* <b>Test Class:</b> [TortoiseTest.java](TortoiseTest.java)
* <b>Solved:</b> Monday, May 2<sup>nd</sup>, 2016

<b>Description:</b>

Two tortoises named A and B must run a race. A starts with an average speed of <code>720 feet per hour</code>. Young B knows she runs faster than A and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a <code>70 feet lead</code> but B speed is <code>850 feet per hour</code>. How long will it take B to catch A?

More generally: given two speeds v1 (A speed, integer > 0) and v2 (B speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array <code>[h, mn, s]</code> where h, mn, s is the time needed in hours, minutes and seconds (don't worry for fractions of second). If v1 >= v2 then return nil, nothing, null or None.

Examples:

<pre><code>race(720, 850, 70) => [0, 32, 18]
race(80, 91, 37) => [3, 21, 49]</code></pre>