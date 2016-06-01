<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #44: Bingo Card</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [BingoCard.java](BingoCard.java)
* <b>Test Class:</b> [BingoCardTests.java](BingoCardTests.java)
* <b>Solved:</b> Monday, May 30<sup>th</sup>, 2016

<b>Description:</b>

After yet another dispute on their game the Bingo Association decides to change course and automize the game.

Can you help the association by writing a method to create a random bingo card?

<b>Task:</b>

* Finish method:

<pre><code>BingoCard.getCard()</code></pre>

* A bingo card contains 24 unique and random numbers according to this scheme:
    * 5 numbers from the B column in the range 1 to 15
    * 5 numbers from the I column in the range 16 to 30
    * 4 numbers from the N column in the range 31 to 45
    * 5 numbers from the G column in the range 46 to 60
    * 5 numbers from the O column in the range 61 to 75

* The card must be returned as an array of bingo style numbers:

<pre><code>{"B14", "B12", "B5", "B6", "B3", "I28", "I27", ... }</code></pre>

* The numbers must be in the order of their column: B, I, N, G, O. Within the columns the order of the numbers is random.

<img src="http://myfreebingocards.com/numbers/1-75/printable-bingo-card-generator/link_img.png">