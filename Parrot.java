public class Parrot extends Animal

{
    String type = "Какаду";
    public Parrot() {
        animalName = "Попугай";
    }

    @Override
    void makeSound() {
        System.out.println("Я умею говорить!");
    }

    @Override
    void printUnique() {
        System.out.println("Вид: " + type);
    }
}
