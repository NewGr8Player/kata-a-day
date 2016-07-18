<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #26: Highest and Lowest</b>

* <b>Difficulty:</b> 7 kyu
* <b>Solution Class:</b> [Kata.java](Kata.java)
* <b>Test Class:</b> [Tests.java](Tests.java)
* <b>Solved:</b> Friday, May 13<sup>th</sup>, 2016

<b>Description:</b>

In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

<b>Example:</b>

<pre><code>HighAndLow("1 2 3 4 5") // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"</code></pre>

<b>Notes:</b>

* All numbers are valid Int32, no need to validate them.
* There will always be at least one number in the input string.
* Output string must be two numbers separated by a single space, and highest number is first.