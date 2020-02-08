package keywords;

public class StaticKey {
 static int count=0;
private static void showData() {
  System.out.println("Inside non-static method");
}
  public static void main(String[] args)   {
   System.out.println(count);
   System.out.println("Inside static method");
}
}