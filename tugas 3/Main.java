public class Main {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person = new Person("Tahta", 20);

        // Membuat objek Address
        Address address = new Address("Jl.Sadewa", "Semarang", "12345");

        // Menampilkan informasi Person
        System.out.println("Informasi Orang:");
        System.out.println("Nama: " + person.getName());
        System.out.println("Usia: " + person.getAge());

        // Menampilkan informasi Address
        System.out.println("\nInformasi Alamat:");
        System.out.println("Jalan: " + address.getStreet());
        System.out.println("Kota: " + address.getCity());
        System.out.println("Kode Pos: " + address.getZipCode());
    }
}
