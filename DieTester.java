public class DieTester {
  public static void main(String[] args) {
    Die d1 = new Die(6);
    Die d2 = new Die(6);

    d1.roll();
    d2.roll();

    System.out.println(d1.toString());
    System.out.println(d2.toString());

    
  }
}
