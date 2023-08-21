public class Main {
    public static void main(String[] args) {
        // Membuat objek Address
        Address address1 = new Address("Jl Sadewa", "Semarang", "2345");
        Address address2 = new Address("Jl Sadewa 1", "Semarang", "2346");

        // Membuat objek Employee
        Employee employee = new Employee("Tahta", 20, address1, 001);
        
        // Membuat objek Customer
        Customer customer = new Customer("Maul", 19, address2, "Customer01");

        // Menampilkan informasi Employee
        System.out.println("Informasi Employee:");
        System.out.println("Nama: " + employee.getName());
        System.out.println("Usia: " + employee.getAge());
        System.out.println("ID Karyawan: " + employee.getEmployeeId());
        System.out.println("Alamat: " + employee.getAddress().getStreet() + ", " + employee.getAddress().getCity());

        // Menampilkan informasi Customer
        System.out.println("\nInformasi Customer:");
        System.out.println("Nama: " + customer.getName());
        System.out.println("Usia: " + customer.getAge());
        System.out.println("ID Pelanggan: " + customer.getCustomerId());
        System.out.println("Alamat: " + customer.getAddress().getStreet() + ", " + customer.getAddress().getCity());
    }
}
