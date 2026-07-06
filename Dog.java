public class Dog extends Animal {
    public Dog() {
        animal_name = "Собака";
    }

    @Override
    void makeSound() {
        System.out.println("Гав!");
    }
}
