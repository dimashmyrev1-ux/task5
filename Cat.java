public class Cat extends Animal {
    public Cat() {
        animal_name = "Кот";
    }

    @Override
    void makeSound() {
        System.out.println("Мяу!");
    }
}
