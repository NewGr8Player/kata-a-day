<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #18: Catching Car Mileage Numbers</b>

* <b>Difficulty:</b> 4 kyu
* <b>Solution Class:</b> [CarMileage.java](CarMileage.java)
* <b>Test Class:</b> [CarMileageTest.java](CarMileageTest.java)
* <b>Solved:</b> Saturday, May 7<sup>th</sup>, 2016

<b>Description:</b>

<blockquote>""<i>7777...8?!??!</i>"", exclaimed Bob, "I missed it again! Argh!" Every time there's an interesting number coming up, he notices and then promptly forgets. Who <i>doesn't</i> like catching those one-off interesting mileage numbers?</blockquote>

Let's make it so Bob <b>never</b> misses another interesting number. We've hacked into his car's computer, and we have a box hooked up that reads mileage numbers. We've got a box glued to his dash that lights up yellow or green depending on whether it receives a <code>1</code> or a <code>2</code> (respectively).

It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number input, and returns a <code>2</code> if the number is "interesting" (see below), a <code>1</code> if an interesting number occurs within the next two miles, or a <code>0</code> if the number is not interesting.

<b>Note:</b> In Haskell, we use <code>No</code>, <code>Almost</code> and <code>Yes</code> instead of <code>0</code>, <code>1</code> and <code>2</code>.

<b>"Interesting" Numbers</b>

Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:

* Any digit followed by all zeros: <code>100</code>, <code>90000</code>
* Every digit is the same number: <code>1111</code>
* The digits are sequential, incementing†: <code>1234</code>
* The digits are sequential, decrementing‡: <code>4321</code>
* The digits are a palindrome: <code>1221</code> or <code>73837</code>
* The digits match one of the values in the <code>awesomePhrases</code> array

> <sup>†</sup>For incrementing sequences, <code>0</code> should come after <code>9</code>, and not before <code>1</code>, as in <code>7890</code>.

> <sup>‡</sup>For decrementing sequences, <code>0</code> should come after <code>1</code>, and not before <code>9</code>, as in <code>3210</code>.

So, you should expect these inputs and outputs:

<pre><code>// "boring" numbers
CarMileage.isInteresting(3, new int[]{1337, 256});    // 0
CarMileage.isInteresting(3236, new int[]{1337, 256}); // 0

// progress as we near an "interesting" number
CarMileage.isInteresting(11207, new int[]{}); // 0
CarMileage.isInteresting(11208, new int[]{}); // 0
CarMileage.isInteresting(11209, new int[]{}); // 1
CarMileage.isInteresting(11210, new int[]{}); // 1
CarMileage.isInteresting(11211, new int[]{}); // 2

// nearing a provided "awesome phrase"
CarMileage.isInteresting(1335, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1336, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1337, new int[]{1337, 256}); // 2</code></pre>

<b>Error Checking</b>

* A number is only interesting if it is greater than <code>99</code>!
* Input will always be an integer greater than <code>0</code>, and less than <code>1,000,000,000</code>.
* The <code>awesomePhrases</code> array will always be provided, and will always be an array, but may be empty. (Not everyone thinks numbers spell funny words...)
* You should only ever output <code>0</code>, <code>1</code>, or <code>2</code>.
