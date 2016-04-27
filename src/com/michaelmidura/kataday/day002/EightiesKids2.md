<b>Day #2: 80's Kids #2: Help ALF Find His Spaceship</b>

* <b>Difficulty:</b> 7 kyu
* <b>Solution Class:</b> [EightiesKids2.java](EightiesKids2.java)
* <b>Test Class:</b> [EightiesKids2Test.java](EightiesKids2Test.java)
* <b>Solved:</b> Thursday, April 21<sup>st</sup>, 2016

<b>Description:</b>

Late last night in the Tanner household, ALF was repairing his spaceship so he might get back to Melmac. Unfortunately for him, he forgot to put on the parking brake, and the spaceship took off during repair. Now it's hovering in space.

ALF has the technology to bring the spaceship home if he can lock on to it's location.

Given a map:

<pre><code>..........
..........
..........
.......X..
..........
..........</code></pre>

The map will be given in the form of a string with \n separating new lines. The bottom left of the map is [0, 0]. X is ALF's spaceship.

In this example:

<pre><code>findSpaceship(map) => "[7, 2]"</code></pre>

If you cannot find the spaceship, the result should be

<pre><code>"Spaceship lost forever."</pre></code>

Can you help ALF?