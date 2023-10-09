import java.util.Arrays;
import java.util.List;


    public class GrassPokemon extends Pokemon {

        private static final String type = "Grass";

        private static final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

        public GrassPokemon(String name, int level, int hp, String food, String sound) {
            super(name, type, level, hp, food, sound);
        }

        public void leafStorm (Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + "attacks" + enemy.getName() + "with leafStorm");

            switch (enemy.getType()) {
                case "Grass": {
                    System.out.println(enemy.getName() + "loses 3hp");
                    enemy.setHp(enemy.getHp() - 3);
                }
                case "Fire": {
                    System.out.println(enemy.getName() + "loses 10hp");
                    enemy.setHp(enemy.getHp() - 10);
                }
                case "Electric": {
                    System.out.println(enemy.getName() + "loses 15");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "Water": {
                    System.out.println(enemy.getName() + "loses 5hp");
                    enemy.setHp(enemy.getHp() - 5);
                }

            }
            System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

        }

        public void solarBeam(Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + "attacks" + enemy.getName() + "solarBeam");

            switch (enemy.getType()) {
                case "Grass": {
                    System.out.println(enemy.getName() + "loses 3hp");
                    enemy.setHp(enemy.getHp() - 3);
                }
                case "Fire": {
                    System.out.println(enemy.getName() + "loses 10hp");
                    enemy.setHp(enemy.getHp() - 10);
                }
                case "Electric": {
                    System.out.println(enemy.getName() + "loses 15");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "Water": {
                    System.out.println(enemy.getName() + "loses 5hp");
                    enemy.setHp(enemy.getHp() - 5);
                }

            }
            System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

        }

        public void leechSeed (Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + "attacks" + enemy.getName() + "with leechSeed");

            switch (enemy.getType()) {
                case "Grass": {
                    System.out.println(enemy.getName() + "loses 3hp");
                    enemy.setHp(enemy.getHp() - 3);
                }
                case "Fire": {
                    System.out.println(enemy.getName() + "loses 10hp");
                    enemy.setHp(enemy.getHp() - 10);
                }
                case "Electric": {
                    System.out.println(enemy.getName() + "loses 15");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "Water": {
                    System.out.println(enemy.getName() + "loses 5hp");
                    enemy.setHp(enemy.getHp() - 5);
                }

            }
            System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

        }


        public void leaveBlade (Pokemon name, Pokemon enemy) {
            System.out.println(name.getName() + "attacks" + enemy.getName() + "with leaveBlade");

            switch (enemy.getType()) {
                case "Grass": {
                    System.out.println(enemy.getName() + "loses 3hp");
                    enemy.setHp(enemy.getHp() - 3);
                }
                case "Fire": {
                    System.out.println(enemy.getName() + "loses 10hp");
                    enemy.setHp(enemy.getHp() - 10);
                }
                case "Electric": {
                    System.out.println(enemy.getName() + "loses 15");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "Water": {
                    System.out.println(enemy.getName() + "loses 15hp");
                    enemy.setHp(enemy.getHp() - 5);
                }

            }
            System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

        }

        public static List<String> getAttacks() {
            return attacks;
        }
    }
