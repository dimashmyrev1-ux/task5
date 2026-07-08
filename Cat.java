public class Cat extends Animal

{
    String color = "Оранжевый";
    public Cat() {
        animalName = "Кот";
    }

    @Override
    void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    void printUnique() {
        System.out.println("Цвет: " + color);
    }
}
