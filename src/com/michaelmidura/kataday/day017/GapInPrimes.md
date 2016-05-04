<b>Day #17: Gap in Primes</b>

* <b>Difficulty:</b> 5 kyu
* <b>Solution Class:</b> [GapInPrimes.java](GapInPrimes.java)
* <b>Test Class:</b> [GapInPrimesTest.java](GapInPrimesTest.java)
* <b>Solved:</b> Wednesday, May 4<sup>th</sup>, 2016

<b>Description:</b>

The prime numbers are not regularly spaced. For example from <code>2</code> to <code>3</code> the gap is <code>1</code>. From <code>3</code> to <code>5</code> the gap is <code>2</code>. From <code>7</code> to <code>11</code> it is <code>4</code>. Between 2 and 50 we have the following pairs of 2-gaps primes: <code>3-5, 5-7, 11-13, 17-19, 29-31, 41-43</code>

A prime gap of length n is a run of n-1 consecutive composite numbers between two <b>successive</b> primes (see: http://mathworld.wolfram.com/PrimeGaps.html).

We will write a function gap with parameters:

<code>g</code> (integer >= 2) which indicates the gap we are looking for

<code>m</code> (integer >= 2) which gives the start of the search (m inclusive)

<code>n</code> (integer >= m) which gives the end of the search (n inclusive)

In the example above <code>gap(2, 2, 50)</code> will return <code>[3, 5]</code> which is the first pair between 2 and 50 with a 2-gap.

So this function should return the first pair of two prime numbers spaced with a gap of <code>g</code> between the limits <code>m</code>, <code>n</code> if these numbers exist otherwise <code>nil or null or None or Nothing (depending on the language).

<b>Examples:</b>

<code>gap(2, 5, 7) --> [5, 7]</code>

<code>gap(2, 5, 5) --> nil</code>

<code>gap(4, 130, 200) --> [163, 167]</code>

([193, 197] is also such a 4-gap primes between 130 and 200 but it's not the first pair)

<code>gap(6,100,110) --> nil</code> : between 100 and 110 we have <code>101, 103, 107, 109</code> but <code>101-107</code> is not a 6-gap because there is <code>103</code> in between and <code>103-109</code> is not a 6-gap because there is <code>107</code> in between.

<b>Ref</b>

https://en.wikipedia.org/wiki/Prime_gap