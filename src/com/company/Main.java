package com.company;

public class Main {

    public static void main(String[] args){

        Hero hero = new Hero ();
        hero.heroName = "Dastan";
        hero.heroHealth = 250;
        hero.heroDamage = 50;
        hero.superDamage = 150;

        System.out.println(hero.heroName + " " + hero.heroHealth + " " + hero.heroDamage + " " + hero.superDamage);

        Boss boss = new Boss ();
        boss.bossName = "Boss";
        boss.setBossHealth(750);
        boss.setBossDamage(70);
        boss.setBossDefence(30);

        System.out.println  (boss.bossName + " " + boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossDefence());
    }
}
