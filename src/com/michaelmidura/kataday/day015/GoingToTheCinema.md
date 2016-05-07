<a href=https://github.com/michaelwm/KataDay>Back to README<a>

<b>Day #15: Going to the cinema</b>

* <b>Difficulty:</b> 7 kyu
* <b>Solution Class:</b> [Movie.java](Movie.java)
* <b>Test Class:</b> [MovieTest.java](MovieTest.java)
* <b>Solved:</b> Unsolved

<b>Description:</b>

My friend John likes to go to the cinema. He can choose between system A and system B.

<pre><code>System A : buy a ticket (15 dollars) every time
System B : buy a card (500 dollars) and every time
    buy a ticket the price of which is 0.90 times the price he paid for the previous one.</code></pre>

<b>Example:</b>

If John goes to the cinema 3 times:

<pre><code>System A : 15 * 3 = 45
System B : 500 + 15 * 0.90 + (15 * 0.90) * 0.90 + (15 * 0.90 * 0.90) * 0.90</code></pre>

John wants to know how many times he must go to the cinema so that the final result of System B, when rounded up to the next dollar, will be cheaper than System A.

The function <code>movie</code> has 3 parameters: <code>card</code> (price of the card), <code>ticket</code> (normal price of a ticket), <code>perc</code> (fraction of what he paid for the previous ticket) and returns the first <code>n</code> such that

<pre><code>ceil(price of System B) < price of System A.</code></pre>

More examples:

<pre><code>movie(500, 15, 0.9) should return 43
    (with card the total price is 634, with tickets 645)
movie(100, 10, 0.95) should return 24
    (with card the total price is 235, with tickets 240)</code></pre>