<a href=https://github.com/michaelwm/KataDay><b>Back to README</b><a>

<b>Day #6: 80's Kids #6: Rock 'Em, Sock 'Em Robots</b>

* <b>Difficulty:</b> Beta
* <b>Solution Class:</b> [EightiesKids6.java](EightiesKids6.java)
* <b>Test Class:</b> [EightiesKids6Test.java](EightiesKids6Test.java)
* <b>Extra Classes:</b>  [Robot.java](Robot.java)
* <b>Solved:</b> Monday, April 25<sup>th</sup>, 2016

<b>Description:</b>

You and your friends have been battling it out with your Rock 'Em, Sock 'Em robots, but things have gotten a little boring. You've each decided to add some amazing new features to your robot and automate them to battle to the death.

Each robot will be represented by an object. You will be given two robot objects, and an object of battle tactics and how much damage they produce. Each robot will have a name, hit points, speed, and then a list of battle tacitcs they are to perform in order. Whichever robot has the best speed, will attack first with one battle tactic.

Your job is to decide who wins.

Example:

<pre><code>robot1.getName() => "Rocky"
robot1.getHealth() => 100
robot1.getSpeed() => 20
robot1.getTactics() => ["punch", "punch", "laser", "missle"]

robot2.getName() => "Missile Bob"
robot2.getHealth() => 100
robot2.getSpeed() => 21
robot2.getTactics() => ["missle", "missle", "missle", "missle"]

tactics = {
    "punch" => 20,
    "laser" => 30,
    "missile" => 35
}

fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) -> "Missile Bob has won the fight."</code></pre>

robot2 uses the first tactic, "missile" because he has the most speed. This reduces robot1's health by 35. Now robot1 uses a punch, and so on.

<b>Rules</b>

- A robot with the most speed attacks first. If they are tied, the first robot passed in attacks first.
- Robots alternate turns attacking. Tactics are used in order.
- A fight is over when a robot has 0 or less health or both robots have run out of tactics.
- A robot who has no tactics left does no more damage, but the other robot may use the rest of his tactics.
- If both robots run out of tactics, whoever has the most health wins. Return the message "{Name} has won the fight."
- If both robots run out of tactics and are tied for health, the fight is a draw. Return "The fight was a draw."

<b>To Java warriors</b>

Robot class is immutable.