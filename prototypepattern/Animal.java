public abstract class Animal {
    private String name;
    private String sound;
    private String food;
    private int legs;

    public Animal(String name, String sound, String food, int legs) {
        this.name = name;
        this.sound = sound;
        this.food = food;
        this.legs = legs;
    }

    public abstract Animal clone();

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public int getLegs() {
        return legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
