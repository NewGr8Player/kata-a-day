<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #23: Backwards Read Primes</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [BackWardsPrime.java](BackWardsPrime.java)
* <b>Test Class:</b> [BackWardsPrimeTest.java](BackWardsPrimeTest.java)
* <b>Solved:</b> Tuesday, May 10<sup>th</sup>, 2016

<b>Description:</b>

Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime. (This rules out primes which are palindromes.)

<pre><code>Examples:
13 17 31 37 71 73 are Backwards Read Primes</code></pre>

13 is such because it's prime and read from right to left writes 31 which is prime too. Same for the others.

<b>Task</b>

Find all Backwards Read Primes between two positive given numbers (both inclusive), the second one being greater than the first one. The resulting array or the resulting string will be ordered following the natural order of the prime numbers.

<pre><code>backwardsPrime(2, 100) => "13 17 31 37 71 73 79 97"
backwardsPrime(9900, 10000) => "9923 9931 9941 9967"</code></pre>
