package com.company;

    class Hero {
    String heroName;
    int  heroHealth;
    int  heroDamage;
    int  superDamage;

    public Hero(int heroHealth, int heroDamage, int superDamage, String heroName) {
        this.heroName = heroName;
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superDamage = superDamage;
    }

        public Hero() {
        }
    }
