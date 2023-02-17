package com.george.faith.enemy;

import com.george.faith.hero.Hero;
import com.george.faith.location.Location;

public class EnemyMiracle extends Enemy {


    public EnemyMiracle(float hp, float damage, float defence, Location location) {
        super(hp, damage, defence, location);
    }

    @Override
    float doDamage(Hero hero) {
        return 0;
    }

    @Override
    float getDamage(Hero hero) {
        return 0;
    }

    @Override
    void regeneration() {

    }
}
