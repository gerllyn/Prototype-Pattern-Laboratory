import java.util.HashMap;
import java.util.Map;
public class AnimalRegistry {
    private Map<String, Animal> animals = new HashMap<>();

    public void addAnimal(String key, Animal animal) {
        animals.put(key, animal);
    }

    public Animal getAnimal(String key) {
        return animals.get(key).clone();
    }
}
