void main() {
    ArrayList<Animal> zoo = new ArrayList<>();
    zoo.add(new Cat());
    zoo.add(new Dog());
    zoo.add(new Parrot());

    for (Animal animal : zoo) {
        System.out.println(animal.animalName);
        System.out.println("Является животным: " + animal.isAnimal);
        animal.printUnique();
        animal.makeSound();
        System.out.println("");
    }
}

