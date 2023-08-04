public class Main {
    public static void main(String[] args) {
        
         Car car = new Car("Toyota", 2023, 4);
		 
		
        car.setBrand("Honda Civic");
        car.setYear(2022);
        car.setNumberOfDoors(4);


        
        String carBrand = car.getBrand();
        int carYear = car.getYear();
        int doors = car.getNumberOfDoors();

        
        System.out.println("Brand: " + carBrand);
        System.out.println("Year: " + carYear);
        System.out.println("Number of doors: " + doors);
    }
}






