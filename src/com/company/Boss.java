package com.company;

class Boss {
    String bossName;;
    private int  bossHealth;
    private int  bossDamage;
    private int  bossDefence;

    public Boss(String bossName, int bossHealth, int bossDamage, int bossDefence) {
        this.bossDamage = bossDamage;
        this.bossDefence = bossDefence;
        this.bossHealth = bossHealth;
        this.bossName = bossName;
    }

    public Boss() {
    }

    public int getBossHealth() {
            return bossHealth;

    }

    public void setBossHealth(int bossHealth) {
        if (bossHealth < 0) ;
        System.out.println("Boss`s HPs don`t be less than 0");

            this.bossHealth = bossHealth;

    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        if (bossDamage < 0) ;
        System.out.println("Boss`s Damages don`t be less than 0");
        this.bossDamage = bossDamage;
    }

    public int getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(int bossDefence) {
        if (bossDefence < 0);
        System.out.println("Boss`s Defences don`t be less than 0");
        this.bossDefence = bossDefence;
    }
}