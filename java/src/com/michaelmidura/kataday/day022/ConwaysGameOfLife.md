<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #22: Conway's Game of Life - Unlimitied Edition</b>

* <b>Difficulty:</b> 3 kyu
* <b>Solution Class:</b> [ConwayLife.java](ConwayLife.java)
* <b>Solved:</b> Unsolved

<b>Description:</b>

Given a 2D array and a number of generations, compute n timesteps of <a href="http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life">Conway's Game of Life</a>.

The rules of the game are: 1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation. 2. Any live cell with more than three live neighbours dies, as if by overcrowding. 3. Any live cell with two or three live neighbours lives on to the next generation. 4. Any dead cell with exactly three live neighbours becomes a live cell.

Each cell's neighborhood is the 8 cells immediately around it. The universe is infinite in both the x and y dimensions and all cells are initially dead - except for those specified in the arguments. The return value should be a 2d array cropped around all of the living cells. (If there are no living cells, then return <code>[[]]</code>.)

For illustration purposes, 0 and 1 will be represented as ░░ and ▓▓ blocks respectively. You can take advantage of the <code>htmlize</code> function to get a text representation of the universe: eg:

<pre><code>System.out.println(LifeDebug.htmlize(cells));</code></pre>