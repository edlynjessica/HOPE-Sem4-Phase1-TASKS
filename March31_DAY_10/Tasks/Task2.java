class CarProperties {
    private String brand;
    private int speed;
    // getter method 
    public String getBrand() {
        return brand;
    }
    public int getSpeed() {
        return speed;
    }
    //setter  method
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSpeed(int speed) {
        if(speed > 0) this.speed = speed;
        else System.out.println("Speed must be positive");
    }
}
public class Task2{
    public static void main(String[] args) {
        CarProperties myCar = new CarProperties();
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Speed: " + myCar.getSpeed());
    }
}
