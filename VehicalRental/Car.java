package VehicalRental;

public class Car extends Vehical implements CarInterface {

    public void book(int days) {
        int rent = this.getRent() * days;
        this.setRent(rent);
        System.out.println("Booking Sucessful");
        System.out.println("Days");
        System.out.println(days);
        System.out.println(this.getRent());

    }
    public void driver(String driv){
        System.out.println(driv);

    }

    public void cancel() {
        System.out.println("your Booking cancelled");
        int rent = this.getRent() - this.getRent();
        this.setRent(rent);
    }

}
