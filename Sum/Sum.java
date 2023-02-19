import java.util.Scanner;  
public class Sum {  
    public static void main(String[] args) {  
      System.out.println("Enter the Two numbers for addtion: ");  
      Scanner readInput = new Scanner(System.in);  
      int a = readInput.nextInt();  
        int b = readInput.nextInt();  
        readInput.close();  
        // It will return the sum of a and b.  
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));  
    }  
}  