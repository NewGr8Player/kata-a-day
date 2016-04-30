<b>Day #11: Double Cola</b>

* <b>Difficulty:</b> 5 kyu
* <b>Solution Class:</b> [Line.java](Line.java)
* <b>Test Class:</b> [ListTests.java](ListTests.java)
* <b>Solved:</b> Saturday, April 30<sup>th</sup>, 2016

<b>Description:</b>

Sheldon, Leonard, Penny, Rajesh and Howard are in the queue for a "Double Cola" drink vending machine; there are no other people in the queue. The first one in the queue (Sheldon) buys a can, drinks it and doubles! The resulting two Sheldons go to the end of the queue. Then the next in the queue (Leonard) buys a can, drinks it and gets to the end of the queue as two Leonards, and so on.

For example, Penny drinks the third can of cola and the queue will look like this:

<pre><code>Rajesh, Howard, Sheldon, Sheldon, Leonard, Leonard, Penny, Penny</code></pre>

Write a program that will return the name of a man who will drink the n-th cola.

Note that in the very beginning the queue looks like that:

<pre><code>Sheldon, Leonard, Penny, Rajesh, Howard</code></pre>

<b>Input</b>

The input data consist of an array which contains five names, and single integer n.

<pre><code>(1 ≤ n ≤ 1000000000).</code></pre>

<b>Output / Examples</b>

Return the single line — the name of the person who drinks the n-th can of cola. The cans are numbered starting from 1. Please note that you should spell the names like this: "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" (without the quotes). In that order precisely the friends are in the queue initially.