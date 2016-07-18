<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #24: Valid Phone Number</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Kata.java](Kata.java)
* <b>Test Class:</b> [PhoneExampleTests.java](PhoneExampleTests.java)
* <b>Solved:</b> Wednesday, May 11<sup>th</sup>, 2016

<b>Description:</b>

Write a function that accepts a string, and returns true if it is in the form of a phone number.

Assume that any integer from 0-9 in any of the spots will produce a valid phone number.

Only worry about the following format:

(123) 456-7890 (don't forget the space after the close parentheses)

Examples:

<pre><code>validPhoneNumber("(123) 456-7890")  =>  returns true
validPhoneNumber("(1111)555 2345")  => returns false
validPhoneNumber("(098) 123 4567")  => returns false</code></pre>