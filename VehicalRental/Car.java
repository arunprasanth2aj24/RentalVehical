package VehicalRental;

public class Car extends Vehical implements CarInterface {


    public void driver(String driv){
        System.out.println(driv);

    }
    @Override
    public void cancel(){
        System.out.println("Your Booking couldn't be cancelled ");

        System.out.println(this.getRent());
    }


}
