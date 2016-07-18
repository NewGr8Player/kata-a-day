<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #48: Weight for weight</b>

* <b>Difficulty:</b> 5 kyu
* <b>Solution Class:</b> [WeightSort.java](WeightSort.java)
* <b>Test Class:</b> [WeightSortTest.java](WeightSortTest.java)
* <b>Solved:</b> Monday, June 1<sup>st</sup>, 2016

<b>Description:</b>

My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the weights of members is published and each month he is the last on the list which means he is the heaviest.

I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

For example <code>99</code> will have "weight" <code>18</code>, <code>100</code> will have "weight" <code>1</code> so in the list <code>100</code> will come before <code>99</code>. Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?

<b>Example:</b>

<code>a = "56 65 74 100 99 68 86 180 90"</code> ordered by numbers weights becomes: <code>"100 180 90 56 65 74 68 86 99"</code>

When two numbers have the same "weight", let us class them as if they were strings and not numbers: <code>100</code> is before <code>180</code> because its "weight" (1) is less than the one of <code>180</code> (9) and <code>180</code> is before <code>90</code> since, having the same "weight" (9) it comes before as a string.

All numbers in the list are positive numbers and the list can be empty.