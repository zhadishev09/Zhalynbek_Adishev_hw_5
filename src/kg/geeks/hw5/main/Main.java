package kg.geeks.hw5.main;

import kg.geeks.hw5.templates.Hero;
import kg.geeks.hw5.templates.Boss;

public class Main {
    public static void main(String[] args) {

        Boss bigBoss = new Boss();
        bigBoss.setHealth(250);
        bigBoss.setDamage(50);
        bigBoss.setProtectionType("block");

        System.out.println("Boss INFO: " + "\n" +
                "Health: " + bigBoss.getHealth() + "\n" +
                "Damage: " + bigBoss.getDamage() + "\n" +
                "ProtectionType: " + bigBoss.getProtectionType());

        System.out.println("-----------------------------------------------------------");
        Hero[] heroes = createHeroes();
        System.out.println("Heroes info:  ");

        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + "\n" +
                    "Damage: " + hero.getDamage() + "\n" +
                    "Superpower: " + hero.getSuperpower());
            System.out.println("---------------------------------");

        }

    }

    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];

        heroes[0] = new Hero(250, 20, "Invisibility");
        heroes[1] = new Hero(180, 30);
        heroes[2] = new Hero(220, 25, "Flying");


        return heroes;
    }
}

