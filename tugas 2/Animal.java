abstract class Animal {
    private String name;
    private String habitat;

    public Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public abstract void makeSound();
    public abstract void move();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Habitat: " + habitat);
    }
}
