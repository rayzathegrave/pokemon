public abstract class Pokemon {
   private final String food;
   private final String type;

   private final String name;

   private final String sound;

   private final int level;

   private int hp;


    public Pokemon(String name,String type, int level, int hp, String food, String sound) {
        this.food = food;
        this.type = type;
        this.name = name;
        this.sound = sound;
        this.level = level;
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}

