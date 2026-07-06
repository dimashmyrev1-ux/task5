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

