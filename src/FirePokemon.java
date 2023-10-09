import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "Fire";

    private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon (String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void fireLash (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with fireLash");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Fire":{System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);}
            case "Electric":{System.out.println(enemy.getName() + "loses 5");
                enemy.setHp(enemy.getHp() -5);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() -10);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public void flameThrower (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "flameThrower");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Fire":{System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);}
            case "Electric":{System.out.println(enemy.getName() + "loses 5");
                enemy.setHp(enemy.getHp() -5);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() -10);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public void pyroBall (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with pyroBall");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Fire":{System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);}
            case "Electric":{System.out.println(enemy.getName() + "loses 5");
                enemy.setHp(enemy.getHp() -5);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() -10);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }


    public void inferno (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with inferno");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);}
            case "Fire":{System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() -3);}
            case "Electric":{System.out.println(enemy.getName() + "loses 5");
                enemy.setHp(enemy.getHp() -5);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() -10);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public static List<String> getAttacks() {
        return attacks;
    }
}

