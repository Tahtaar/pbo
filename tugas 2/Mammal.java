class Mammal extends Animal {
    private String furType;

    public Mammal(String name, String habitat, String furType) {
        super(name, habitat);
        this.furType = furType;
    }

    @Override
    public void makeSound() {
        System.out.println("Aum Aum...");
    }

    @Override
    public void move() {
        System.out.println("Berlari/Berjalan");
    }
}
