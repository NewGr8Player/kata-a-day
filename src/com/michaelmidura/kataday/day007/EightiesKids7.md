<a href=https://github.com/michaelwm/KataDay>Back to README<a>

<b>Day #7: 80's Kids #7: She's a Small Wonder</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Robot.java](Robot.java)
* <b>Test Class:</b> [RobotTest.java](RobotTest.java)
* <b>Solved:</b> Tuesday, April 26<sup>th</sup>, 2016

<b>Description:</b>

Vicky is quite the small wonder. Most people don't even realize she's not a real girl, but a robot living amongst us. Sure, if you stick around her home for a while you might see her creator open up her back and make a few tweaks and even see her recharge in the closet instead of sleeping in a bed.

In this kata, we're going to help Vicky keep track of the words she's learning.

Write a function, learnWord(word) which is a method of the Robot object. The function should report back whether the word is now stored, or if she already knew the word.

Example:

<pre><code>Robot vicky = new Robot();
vicky.learnWord("hello") -> "Thank you for teaching me hello"
vicky.learnWord("abc") -> "Thank you for teaching me abc"
vicky.learnWord("hello") -> "I already know the word hello"
vicky.learnWord("wow!") -> "I do not understand the input"</code></pre>

Case shouldn't matter. Only alpha characters are valid. There's also a little trick here. Enjoy!