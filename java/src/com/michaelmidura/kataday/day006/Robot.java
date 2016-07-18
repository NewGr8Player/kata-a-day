package com.michaelmidura.kataday.day006;

public final class Robot {

    private final String name;
    private final int health, speed;
    private final String[] tactics;

    public Robot(String name, int health, int speed, String[] tactics) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.tactics = tactics;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public String[] getTactics() {
        return tactics;
    }

}
