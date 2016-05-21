<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #32: Greatest Common Divisor Bitcount</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [BinaryGCD.java](BinaryGCD.java)
* <b>Test Class:</b> [BinaryGCDtest.java](BinaryGCDtest.java)
* <b>Solved:</b> Friday, May 20<sup>th</sup>, 2016

<b>Description:</b>

The objective is to write a method that takes two integer parameters and returns a single integer equal to the number of 1s in the binary representation of the greatest common divisor of the parameters.

Taken from Wikipedia: "In mathematics, the greatest common divisor (gcd) of two or more integers, when at least one of them is not zero, is the largest positive integer that divides the numbers without a remainder. For example, the GCD of 8 and 12 is 4."

For example: the greatest common divisor of 300 and 45 is 15. The binary representation of 15 is 1111, so the correct output would be 4.

If both parameters are 0, the method should return 0. The function must be able to handle negative input.