class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, String habitat, double wingSpan) {
        super(name, habitat);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        System.out.println("kraaa....");
    }

    @Override
    public void move() {
        System.out.println("Terbang");
    }
}
