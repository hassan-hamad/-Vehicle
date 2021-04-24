interface Vehicle {
 void changeGear(int a);
 void speedUp(int a);
 void applyBrakes(int a);

}
class Car implements Vehicle{
 int speed;
 int gear;
 @Override
 public void changeGear(int newGear){
 gear = newGear;
 }
 
 @Override
 public void speedUp(int increment){
 speed = speed + increment;
 }

 @Override
 public void applyBrakes(int decrement){
 speed = speed - decrement;
 }
 public void printStates() {
 System.out.println("speed: " + speed + " gear: " + gear);
 }
}
class Test {
 public static void main (String[] args) {
 Car car = new Car();
 car.changeGear(2);
 car.speedUp(3);
 car.applyBrakes(1);
 System.out.println("car present state :");
 car.printStates();
 }
}