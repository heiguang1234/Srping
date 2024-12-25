package com.hspedu.spring.bean;

/**
 * Author:Black Sunshine
 * Date:2024/12/23 12:56
 */
public class Monster {
    private String name;
    private String skill;
    private int monsterID;

    public Monster(String name, String skill, int monsterID) {
        this.name = name;
        this.skill = skill;
        this.monsterID = monsterID;
    }

    public Monster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", monsterID=" + monsterID +
                '}';
    }
}
