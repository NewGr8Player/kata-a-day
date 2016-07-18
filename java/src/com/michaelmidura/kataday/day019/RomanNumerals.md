<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #19: Roman Numerals Encoder</b>

* <b>Difficulty:</b> 4 kyu
* <b>Solution Class:</b> [Conversion.java](Conversion.java)
* <b>Test Class:</b> [ConversionTest.java](ConversionTest.java)
* <b>Solved:</b> Friday, May 6<sup>th</sup>, 2016

<b>Description:</b>

Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Example:

<pre><code>conversion.solution(1000); //should return "M"</code></pre>

Help:

<pre><code>Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000</code></pre>

Remember that there can't be more than 3 identical symbols in a row.

More about roman numerals - http://en.wikipedia.org/wiki/Roman_numerals