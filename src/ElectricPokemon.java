import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "Electric";

    private static final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "voltTackle", "thunder");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void thunderPunch (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with thunderPunch");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + " loses 10hp");
                enemy.setHp(enemy.getHp() -10);}
            case "Fire":{System.out.println(enemy.getName() + " loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Electric":{System.out.println(enemy.getName() + " loses 3");
                enemy.setHp(enemy.getHp() -3);}
            case "Water":{
                System.out.println(enemy.getName() + " loses 15hp");
               enemy.setHp(enemy.getHp() -15);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public void electroBall (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with electroBall");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() -10);}
            case "Fire":{System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Electric":{System.out.println(enemy.getName() + "loses 3");
                enemy.setHp(enemy.getHp() -3);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public void voltTackle (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with voltTackle");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() -10);}
            case "Fire":{System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Electric":{System.out.println(enemy.getName() + "loses 3");
                enemy.setHp(enemy.getHp() -3);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }


    public void thunder (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + "with thunder");

        switch (enemy.getType()){
            case "Grass":{System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() -10);}
            case "Fire":{System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() -5);}
            case "Electric":{System.out.println(enemy.getName() + "loses 3");
                enemy.setHp(enemy.getHp() -3);}
            case "Water":{
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() -15);
            }

        }
        System.out.println(enemy.getName() + "has" + enemy.getHp() + "hp left");

    }

    public static List<String> getAttacks() {
        return attacks;
    }
}
