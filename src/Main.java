//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] animal = new Animal[]{
                new Mammal("Dog", "Max", 1 , 5),
                new Bird("White", "Owl", 2, 3),
                new Fish("Bony", "Ra", 1, 1),
                new Dog("Small", "Dog", "Bim", 5, 7),
                new Pigeon("Domestic", "Brown", "Pippin", 5, 1),
                new Blowfish("Toxic", "Pufferfish", "Fugu", 8)
        };

        AnimalBehavior[]  animalBehavior = new AnimalBehavior[]{
                new Dog("Small", "Dog", "Bim", 5, 7),
                new Pigeon("Domestic", "Brown", "Pippin", 5, 1),
                new Blowfish("Toxic", "Pufferfish", "Fugu", 8)
        };

        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();

        System.out.println();

        for (Animal value : animal) {
            value.move();
        }

    }
}