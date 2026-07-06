public class Parrot extends Animal {
    public Parrot() {
        animal_name = "Попугай";
    }

    @Override
    void makeSound() {
        System.out.println("Я умею говорить!");
    }
}
