public class CarClient {
  public static void main(String [] args) {

    Car car1 = new Car("VW", "Jetta", 50, 14.5);
    Car car2 = new Car("Ferrari", "f40", 16, 30);
    Car car3 = new Car("Conrad", "Concept", 500, 1);

    System.out.println();

    car1.drive(750);
    car2.drive(150);
    car3.drive(300);

    car1.fillTank();

    car2.addGasAmt(5);
    car3.addGasAmt(.1);

    car1.canGo();
    car2.canGo();
    car3.canGo();

  }
}
