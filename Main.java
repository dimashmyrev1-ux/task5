abstract class Animal {
    boolean is_animal = true;
    String animal_name = "Животное";

   abstract void makeSound();
}

public class Dog extends Animal {
    public Dog() {
        animal_name = "Собака";
    }

    @Override
    void makeSound() {
        System.out.println("Гав!");
    }
}

public class Cat extends Animal {
    public Cat() {
        animal_name = "Кот";
    }

    @Override
    void makeSound() {
        System.out.println("Мяу!");
    }
}

public class Parrot extends Animal {
    public Parrot() {
        animal_name = "Попугай";
    }

    @Override
    void makeSound() {
        System.out.println("Я умею говорить!");
    }
}
void main() {
ArrayList<Animal> zoo = new ArrayList<>();
zoo.add(new Cat());
zoo.add(new Dog());
zoo.add(new Parrot());

    for (Animal animal : zoo) {
        System.out.println(animal.animal_name);
        System.out.println("Является животным: " + animal.is_animal);
        animal.makeSound();
        System.out.println("");
    }
}

