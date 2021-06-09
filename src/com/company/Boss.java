package com.company;

class Boss {
    String bossName;;
    int  bossHealth;
    int  bossDamage;
    int  bossDefence;

    public Boss(String bossName, int bossHealth, int bossDamage, int bossDefence) {
        this.bossDamage = bossDamage;
        this.bossDefence = bossDefence;
        this.bossHealth = bossHealth;
        this.bossName = bossName;
    }

    public Boss() {
    }
}