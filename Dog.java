public class Dog extends Animal

{
    String breed = "Овчарка";
    public Dog() {
        animalName = "Собака";
    }

    @Override
    void makeSound() {
        System.out.println("Гав!");
    }

    @Override
    void printUnique() {
        System.out.println("Порода: " + breed);
    }
}
