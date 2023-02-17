package com.george.faith.hero;

import com.george.faith.enemy.Enemy;

public abstract class Hero {

    float level;
    float hp;
    float damage;
    float defence;
    float secrecy; // Скрытность

    abstract float doDamage(Enemy enemy);

    abstract float getDamage(Enemy enemy);

    abstract void regeneration();


}
