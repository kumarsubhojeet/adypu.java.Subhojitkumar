import java.util.Scanner;
class SumArray1{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[2];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<2; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}