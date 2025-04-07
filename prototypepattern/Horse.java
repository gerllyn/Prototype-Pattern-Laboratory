public class Horse extends Animal {
    public Horse(String name, String sound, String food, int legs) {
        super(name, sound, food, legs);
    }

    @Override
    public Animal clone() {
        return new Horse(getName(), getSound(), getFood(), getLegs());
    }
}
