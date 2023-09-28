package GroupWorks2;
/*
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck.
The Truck class has a field as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if weight>2000
then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
 if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
public class Car {
    int carPrice;
    String color;

    public Car(int carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    double length;
    public Sedan(int carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    public double calculateSalePrice() {
        if(length>20){
            return carPrice*0.95;
        }else {
            return carPrice*0.90;
        }
    }
}

class Truck extends Car{
    double weight;
    public Truck(int carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    public double calculateSalePrice() {
        if(weight>2000){
            return carPrice*0.90;
        }else {
            return carPrice*0.80;
        }
    }
}
class CarTester{
    public static void main(String[] args) {
        Sedan s=new Sedan(30000, "Black", 17);
        Truck t=new Truck(50000,"white",2001);
        System.out.println("Sedan sale price is "+s.calculateSalePrice());
        System.out.println("Truck sale price is "+t.calculateSalePrice());
    }
}
