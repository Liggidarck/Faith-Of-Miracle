package com.george.faith;

import com.george.faith.enemy.Enemy;
import com.george.faith.location.Location;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int enemyCount = getRandomNumber(1, 4);
        List<Enemy> enemies = generateEnemies(enemyCount);

    }

    private static List<Enemy> generateEnemies(int enemyCount) {
        enemyCount = 4;
        List<Enemy> enemies = new ArrayList<>();
//      for i in range(1, 10)
        for (int i = 0; i < enemyCount; i++) {
            Enemy currentEnemy; // Какой-то противник
            Location currentLocation = getCurrentLocation(); // Локация текущая
            int enemyId = getRandomNumber(1, 10); //Выбираем случайного противника
            currentEnemy = createEnemy(enemyId, currentLocation); // Создаем его

            enemies.add(currentEnemy);
        }


        return enemies;
    }

    private static Enemy createEnemy(int enemyId, Location location) {
        return null;
    }

    private static Location getCurrentLocation() {
        return null;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}