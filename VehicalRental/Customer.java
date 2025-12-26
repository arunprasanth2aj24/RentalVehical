package VehicalRental;

public class Customer extends BaseFunctionalities implements CustomerInterface {

    private String vehicalType;
    private int rentalDays;



    public String getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(String vehicalType) {
        this.vehicalType = vehicalType;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
}
