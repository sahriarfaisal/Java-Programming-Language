
package java_array;

import java.util.Scanner;

/**
 *
 * @author S.M Sahriar Faisal.
 */
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] number = new double[3];
        double sum = 0;
        System.out.print("Please Enter 3 Numbers : ");
        for(int i = 0; i<number.length; i++){
            number[i] = input.nextDouble();
        }
//        number[0] = input.nextDouble();
//        number[1] = input.nextDouble();
//        number[2] = input.nextDouble();
        for(int i = 0; i<number.length; i++)
        {
            sum = sum + number[i];
        }
//        sum = number[0] + number[1] + number[2] ;
        System.out.println(sum);


    }
}
