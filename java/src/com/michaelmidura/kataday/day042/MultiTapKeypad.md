<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #42: Multi-tap Keypad Text Entry on an Old Mobile Phone</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Keypad.java](Keypad.java)
* <b>Test Class:</b> [KeypadTest.java](KeypadTest.java)
* <b>Solved:</b> Sunday, May 29<sup>th</sup>, 2016

<b>Description:</b>

Prior to having fancy iPhones, teenagers would wear out their thumbs sending SMS messages on candybar-shaped feature phones with 3x4 numeric keypads.

<pre><code>------- ------- -------
|     | | ABC | | DEF |
|  1  | |  2  | |  3  |
------- ------- -------
------- ------- -------
| GHI | | JKL | | MNO |
|  4  | |  5  | |  6  |
------- ------- -------
------- ------- -------
|PQRS | | TUV | | WXYZ|
|  7  | |  8  | |  9  |
------- ------- -------
------- ------- -------
|     | |space| |     |
|  *  | |  0  | |  #  |
------- ------- -------</code></pre>

Prior to the development of T9 (predictive text entry) systems, the method to type words was called "multi-tap" and involved pressing a button repeatedly to cycle through the possible values.

For example, to type a letter <code>"R"</code> you would press the <code>7</code> key three times (as the screen display for the current character cycles through <code>P->Q->R->S->7</code>). A character is "locked in" once the user presses a different key or pauses for a short period of time (thus, no extra button presses are required beyond what is needed for each letter individually). The zero key handles spaces, with one press of the key producing a space and two presses producing a zero.

In order to send the message <code>"WHERE DO U WANT 2 MEET L8R"</code> a teen would have to actually do 47 button presses. No wonder they abbreviated.

For this assignment, write a module that can calculate the amount of button presses required for any phrase. Punctuation can be ignored for this exercise. Likewise, you can assume the phone doesn't distinguish between upper/lowercase characters (but you should allow your module to accept input in either for convenience).

Hint: While it wouldn't take too long to hard code the amount of keypresses for all 26 letters by hand, try to avoid doing so! (Imagine you work at a phone manufacturer who might be testing out different keyboard layouts, and you want to be able to test new ones rapidly.)