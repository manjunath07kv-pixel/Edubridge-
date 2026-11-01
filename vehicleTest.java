 class vehicle {
    String brand;

    vehicle(String brand){
        this.brand = brand;
    }
    void display(){
        System.out.println("Vehicle Brand: "+brand);
    }
}
class car extends vehicle{
    String brand;
    car(String parentBrand , String carBrand){
        super(parentBrand);
        this.brand = carBrand;
    }
    void display(){
        super.display();
        System.out.println("Car Brand :" +brand);
    }
}
public class vehicleTest{
    public static void main(String[] args){
        car c1 = new car("Toyota","BMW");
        System.out.println("vehicle and car Details:");
        c1.display();
    }
}
