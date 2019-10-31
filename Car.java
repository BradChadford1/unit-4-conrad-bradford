public class Car {
  private String make;
  private String model;
  private double mileage;
  private int tankCapacity;
  private double fuelAmt;
  private double distP;
  public Car(String newMake, String newModel, double newMileage, int newTankCap, double distP) {
    make = newMake;
    model = newModel;
    mileage = newMileage;
    tankCapacity = newTankCap;
    fuelAmt = tankCapacity;
    distP = fuelAmt * mileage;
  }

  public double fillTank() {
    fuelAmt = tankCapacity;
  }

  public double addGasAmt(double newFuelAmt) {
    if (fuelAmt < TankCapacity) {
      fuelAmt = fuelAmt + newFuelAmt;
      System.out.println("Tank is now full.");
    }
    else {
      System.out.println("Tank is already full.");
    }
  }

  public double setdistP(int newDistP) {
    distP = newDistP;
  }

  public void drive(double distance) {
    if (distP <= distance) {
      System.out.println("You drove " + distP + " miles before you ran out of gas.");
      fuelAmt = 0;
      distP = 0;
      System.out.println("Fuel Left: " + fuelAmt + " gallons.");
    }
    else {
      System.out.println("You drove " + distance + " miles.");
      fuelAmt = fuelAmt - (distance / mileage);
      distP = fuelAmt * mileage;
      System.out.println("Fuel Left: " + fuelAmt + " gallons.");
    }
  }

}
