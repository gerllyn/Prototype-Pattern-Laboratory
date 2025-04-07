public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Sheep sheepPrototype = new Sheep("Dolly", "Baa", "Grass", 4);
        Cow cowPrototype = new Cow("Bessie", "Moo", "Hay", 4);
        Horse horsePrototype = new Horse("Spirit", "Neigh", "Hay", 4);

        registry.addAnimal("sheep", sheepPrototype);
        registry.addAnimal("cow", cowPrototype);
        registry.addAnimal("horse", horsePrototype);

        Animal sheep1 = registry.getAnimal("sheep");
        Animal cow1 = registry.getAnimal("cow");
        Animal horse1 = registry.getAnimal("horse");

        sheep1.setName("Dolly 2");
        cow1.setSound("Moooo");

        System.out.println("Sheep 1: " + sheep1.getName() + ", Sound: " + sheep1.getSound());
        System.out.println("Cow 1: " + cow1.getName() + ", Sound: " + cow1.getSound());
        System.out.println("Horse 1: " + horse1.getName() + ", Sound: " + horse1.getSound());
    }
}