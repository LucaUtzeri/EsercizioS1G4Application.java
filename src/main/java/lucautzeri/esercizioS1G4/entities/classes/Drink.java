package lucautzeri.esercizioS1G4.entities.classes;

import lombok.Getter;
import lombok.Setter;
import lucautzeri.esercizioS1G4.entities.misc.Item;

@Getter
@Setter
public class Drink extends Item {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
