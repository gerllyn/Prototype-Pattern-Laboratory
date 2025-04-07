public class Sheep extends Animal {
    public Sheep(String name, String sound, String food, int legs) {
        super(name, sound, food, legs);
    }

    @Override
    public Animal clone() {
        return new Sheep(getName(), getSound(), getFood(), getLegs());
    }
}
