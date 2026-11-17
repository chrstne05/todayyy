/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding4;
import java.util.Scanner;
/**
 *
 * @author ROBILLOS_CPE113
 */
public class LiveCoding4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers? ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Number must be positive.");
        } else {
            int[] values = new int[size];

            //elements of the array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter value " + (i + 1) + ": ");
                values[i] = input.nextInt(); 
            }
            
        int total = 0;
        for (int i = 0; i < size; i++){
            total += values [i];
        }
        System.out.println("Average: " + computeAverage (total, size));
        
        //System.out.println();
        //int c = input.nextInt();
        //System.out.println(factorial (c));
    
    
    }
    
    }
    static double computeAverage(int total, int count){
        if (count <= 0) {
            return 0.0;
        }
        return (double) total/count;
    
/* 
1. Why does the method need the word double (or cast) in the return?
    Because it can give decimal answers, not just whole numbers.

2. What would go wrong without the count <= 0 guard?
    The program might divide by zero, which will result to an error.
*/
    }
    static int countPassing(int[] grades, int passingMark){
        int
}
    static int factorial(int n) {
        if (n == 0) { 
            return 1;
        } 
        return n * factorial(n - 1);
        
/*
1. Why did one wrong return make every result wrong?
    One wrong return made every result wrong because the method stopped at the 
    wrong value. Instead of returning 1, it returned 0. Since multiplication by 
    zero always gives zero, all the factorial answers became zero.

2. Stretch: What happens for factorial(-2) with your corrected code, and why?
    For factorial(-2), the program will keep calling the method again and again.
    This happens because the base case only checks if n is equal to 0. Since -2
    never reaches 0 when subtracting 1, the program will eventually cause a 
    stack overflow error.        
*/
    }
}
