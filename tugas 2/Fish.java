class Fish extends Animal {
    private String waterType;

    public Fish(String name, String habitat, String waterType) {
        super(name, habitat);
        this.waterType = waterType;
    }

    @Override
    public void makeSound() {
        System.out.println("Tidak memiliki suara ");
    }

    @Override
    public void move() {
        System.out.println("Berenang");
    }
}