<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #39: Pizza pieces</b>

* <b>Difficulty:</b> 6 kyu
* <b>Solution Class:</b> [Pizza.java](Pizza.java)
* <b>Test Class:</b> [PizzaTest.java](PizzaTest.java)
* <b>Solved:</b> Sunday, May 29<sup>th</sup>, 2016

<b>Description:</b>

In her trip to Italy, Elizabeth Gilbert made it her duty to eat perfect pizza. One day, she ordered one for dinner. And then some Italian friends appeared at her room.

The problem is that there were many people who ask for a piece of pizza at that moment. And she had a knife that only cuts straight.

Given a number <code>K</code> (K<=45000), help her get the maximum of pieces possible (not necessarily of equal size) with <code>K</code> cuts. If <code>K</code> is a negative number, the result must be <code>-1</code> (or <code>Nothing</code> in Haskell).

<b>Examples</b>

<pre><code>Pizza.maxPizza(0) == 1
Pizza.maxPizza(1) == 2
Pizza.maxPizza(3) == 7</code></pre>