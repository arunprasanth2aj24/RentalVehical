package VehicalRental;

public class Bike extends Vehical implements BikeInterface {


    public void book(int days){
      int rent = this.getRent() * days;
      this.setRent(rent);

        System.out.println("Booking Sucessful");
        System.out.println("Days");
        System.out.println(days);
        System.out.println("Rent");
        System.out.println(this.getRent());

    }
    public void helmet(String hel){
        System.out.println(hel);

    }

    public void cancel(){
        System.out.println("Your Booking cancelled");
        int rent =this.getRent() - this.getRent();
        this.setRent(rent);
    }


}
