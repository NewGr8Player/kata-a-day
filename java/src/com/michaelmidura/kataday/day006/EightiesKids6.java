package com.michaelmidura.kataday.day006;

import java.util.Map;

public class EightiesKids6 {

    public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {
        int fightIndex = 1, robot1Tactic = -1, robot2Tactic = -1, robot1Health = robot1.getHealth(), robot2Health = robot2.getHealth();
        boolean fightOn = true;

        if (robot2.getSpeed() > robot1.getSpeed())
            fightIndex = 2;

        while (fightOn) {
            if (fightIndex % 2 == 0 && ++robot2Tactic < robot2.getTactics().length)
                robot1Health -= tactics.get(robot2.getTactics()[robot2Tactic]);
            else if (++robot1Tactic < robot1.getTactics().length)
                robot2Health -= tactics.get(robot1.getTactics()[robot1Tactic]);

            if ((robot1Tactic >= robot1.getTactics().length && robot2Tactic >= robot2.getTactics().length) || robot1Health <= 0 || robot2Health <= 0)
                fightOn = false;

            fightIndex++;
        }

        if (robot1Health < robot2Health)
            return robot2.getName() + " has won the fight.";
        else if (robot2Health < robot1Health)
            return robot1.getName() + " has won the fight.";
        else
            return "The fight was a draw.";
    }
}
