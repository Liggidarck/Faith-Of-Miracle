package com.george.faith.enemy;

import com.george.faith.hero.Hero;
import com.george.faith.location.Location;

public abstract class Enemy {

    float hp;
    float damage;
    float defence;
    Location location;

    public Enemy(float hp, float damage, float defence, Location location) {
        this.hp = hp;
        this.damage = damage;
        this.defence = defence;
        this.location = location;
    }

    abstract float doDamage(Hero hero);

    abstract float getDamage(Hero hero);

    abstract void regeneration();

}
