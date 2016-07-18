<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #21: Valid Braces</b>

* <b>Difficulty:</b> 4 kyu
* <b>Solution Class:</b> [BraceChecker.java](BraceChecker.java)
* <b>Test Class:</b> [BraceCheckerTests.java](BraceCheckerTests.java)
* <b>Solved:</b> Saturday, May 7<sup>th</sup>, 2016

<b>Description:</b>

Description:

Write a function called <code>validBraces</code> that takes a string of braces, and determines if the order of the braces is valid. <code>validBraces</code> should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces four new characters. Open and closed brackets, and open and closed curly braces. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of open parentheses '(' , closed parentheses ')', open brackets '[', closed brackets ']', open curly braces '{' and closed curly braces '}'.

<b>What is considered Valid?</b> A string of braces is considered valid if all braces are matched with the correct brace.

For example:
'(){}[]' and '([{}])' would be considered valid, while '(}', '[(])', and '[({})](]' would be considered invalid.

<b>Examples:</b>

<code>validBraces( "(){}[]" )</code> => returns true

<code>validBraces( "(}" )</code> => returns false

<code>validBraces( "[(])" )</code> => returns false

<code>validBraces( "([{}])" )</code> => returns true
