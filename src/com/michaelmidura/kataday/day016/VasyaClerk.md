<b>Day #16: Vasya - Clerk</b>

* <b>Difficulty:</b> 7 kyu
* <b>Solution Class:</b> [Line.java](Line.java)
* <b>Test Class:</b> [LineTests.java](LineTests.java)
* <b>Solved:</b> Wednesday, May 4<sup>th</sup>, 2016

<b>Description:</b>

The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single <code>100</code>, <code>50</code> or <code>25</code> dollars bill. A "Avengers" ticket costs <code>25 dollars</code>.

Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

Can Vasya sell a ticket to each person and give the change if he initially has no money and sells the tickets strictly in the order people follow in the line?

Return <code>YES</code>, if Vasya can sell a ticket to each person and give the change. Otherwise return <code>NO</code>.

<b>Examples:</b>

<pre><code>// *** Java ***

Line.Tickets(new int[] {25, 25, 50}) // => YES
Line.Tickets(new int []{25, 100})
    // => NO. Vasya will not have enough money to give change to 100 dollars</code></pre>