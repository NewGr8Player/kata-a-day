<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #49: Who won the election?</b>

* <b>Difficulty:</b> Beta
* <b>Solution Class:</b> [SG1.java](SG1.java)
* <b>Test Class:</b> [SG1Test.java](SG1Test.java)
* <b>Solved:</b> Sunday, June 5<sup>th</sup>, 2016

<blockquote><i>I don't even know what they look like.
<br>Furling. Sounds cute and fuzzy to me.</i>
<br><br>- Jonas Quinn and Jack O'Neill, "Paradise Lost".</blockquote>

<b>Previously on Stargate SG-1</b>

Arriving on P4F-976, SG-1 finally come into contact with the <i>Furlings</i>, one of the four great races within the Milky Way. After several days of deliberation with the Furling Directorate, the Tauri finally have access to the knowledge they have been searching for.

The Furlings, having provided assistance with the Ancient's expansion into the Milky Way, have extensive knowledge of the Stargate Network and it's components. One such component, the Dial Home Device, has caused many disasters at Stargate Command through it's absence. Thankfully, the Furlings have all the necessary blueprints for it's construction, and have handed copies over to the Tauri. After beginning mass production of the control crystals necessary for it's function, Stargate Command has hit a snag. The Ancients had designed the control crystals to function if their inner pathways are as efficient as possible - essentially, the pathways must choose the shortest path between two nodes. Stargate Command has turned to you - a software engineer - to fix their problems.

<b>Your Mission</b>

Given a string containing the current state of the control crystals inner pathways (labeled as 'X') and its gaps (labeled as '.'), generate the shortest path from the start node (labeled as 'S') to the goal node (labeled as 'G') and return the new pathway (labeled with 'P's). If no solution is possible, return the string "Oh for crying out loud..." in frustration.

<b>The Rules</b>

- Nodes labeled as 'X' are not traversable.
- Nodes labeled as '.' are traversable.
- A pathway can be grown in 8 directions (up, down, left, right, up-left, up-right, down-left, down-right).
- A pathway can be grown between a diagonal gap.
 - For example, given the case:
<pre><code>
 SX.
 X..
 ..G
 </code></pre>
 - A valid solution is possible:
<pre><code>
 SX.
 XP.
 ..G
 </code></pre>
 - As a path can be grown in the gap between the pathways
 - However, in the following case:
<pre><code>
 SX.
 .X.
 .XG
 </code></pre>
 - A valid solution is not possible.
- Nodes labeled 'S' and 'G' are not to be replaced with 'P' in the case of a solution.
- The shortest solution is the one containing the least nodes labeled 'P'.

<b>Example #1: Valid solution</b>

<pre><code>
SG1.wireDHD() =>

".S... \n
 XXX.. \n
 .X.XX \n
 ..X.. \n
 G...X"

return =>

".SP.. \n
 XXXP. \n
 .XPXX \n
 .PX.. \n
 G...X"
</code></pre>

<b>Example #2: No solution</b>

<pre><code>
SG1.wireDHD() =>

"S.... \n
 XX... \n
 ...XX \n
 .XXX. \n
 XX..G"

return =>

"Oh for crying out loud..."
</code></pre>