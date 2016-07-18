<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #33: Rectangle into Squares</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [SqInRect.java](SqInRect.java)
* <b>Test Class:</b> [SqInRectTest.java](SqInRectTest.java)
* <b>Solved:</b> Friday, May 20<sup>th</sup>, 2016

<b>Description:</b>

The drawing below gives an idea of how to cut a given "true" rectangle into squares ("true" rectangle meaning that the two dimensions are different).

<img src="http://i.imgur.com/lk5vJ7sm.jpg">

Can you translate this drawing into an algorithm?

You will be given two dimensions

1. a positive integer length (parameter named <code>lng</code>)
2. a positive integer width (parameter named <code>wdth</code>)

You will return an array with the size of each of the squares.

</b>Examples<b>

<pre><code>     sqInRect(5, 3) should return a List<Integer> {3, 2, 1, 1}
        sqInRect(3, 5) should return a List<Integer> {3, 2, 1, 1}</code></pre>

<b>Note:</b> lng == wdth as a starting case would be an entirely different problem and the drawing is planned to be interpreted with lng != wdth. See kata also my other kata, <a href="http://www.codewars.com/kata/54eb33e5bc1a25440d000891">Square into Squares. Protect trees!</a>.

When the initial parameters are so that <code>lng</code> == <code>wdth</code>, the solution <code>[lng]</code> would be the most obvious but not in the spirit of this kata so, in that case, return <code>None</code>/<code>nil</code>/<code>null</code>/<code>Nothing</code>.

<b>Examples:</b>

<pre><code>     sqInRect(5, 5) should return null</code></pre>