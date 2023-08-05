public class Main {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", "Grassland", "Short");
        Bird eagle = new Bird("Eagle", "Sky", 2.5);
        Fish shark = new Fish("Shark", "Ocean", "Saltwater");

        lion.displayInfo();
        lion.makeSound();
        lion.move();

        eagle.displayInfo();
        eagle.makeSound();
        eagle.move();

        shark.displayInfo();
        shark.makeSound();
        shark.move();
    }
}