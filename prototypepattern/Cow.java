public class Cow extends Animal {
    public Cow(String name, String sound, String food, int legs) {

        super(name, sound, food, legs);
    }

    @Override
    public Animal clone() {

        return new Cow(getName(), getSound(), getFood(), getLegs());
    }
}
