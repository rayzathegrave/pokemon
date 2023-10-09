import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "Water";

    private static final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon (String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void surf (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with surf");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Fire":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Electric":{System.out.println(enemy.getName() + "loses 10");
                enemy.setHp(enemy.getHp() -10);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public void hydroPump (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "hydroPump");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Fire":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Electric":{System.out.println(enemy.getName() + "loses 10");
                enemy.setHp(enemy.getHp() -10);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public void hydroCanon (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with hydroCanon");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Fire":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Electric":{System.out.println(enemy.getName() + "loses 10");
                enemy.setHp(enemy.getHp() -10);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }


    public void rainDance (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with rainDance");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Fire":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Electric":{System.out.println(enemy.getName() + "loses 10");
                enemy.setHp(enemy.getHp() -10);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public static List<String> getAttacks() {
        return attacks;
    }
}
