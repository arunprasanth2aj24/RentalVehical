package VehicalRental;

public class Main {
    public static void main(String[] args) {


        CustomerInterface customer = new Customer();
        BikeInterface bk = new Bike();
        CarInterface cr = new Car();

        customer.setVehicalType("Bike");
        customer.setRentalDays(5);

        bk.setVehNo(1224);
        bk.setRent(200);
        bk.book(customer.getRentalDays());
        bk.helmet("Helmet Included");

        CustomerInterface customer2 =new Customer();

        customer2.setVehicalType("Car");
        customer2.setRentalDays(2);

        cr.setVehNo(4422);
        cr.setRent(100);
        cr.book(customer2.getRentalDays());
        cr.driver("Driver Included");

        cr.setVehNo(4422);
        cr.setRent(300);
    }
}