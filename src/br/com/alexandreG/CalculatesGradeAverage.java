/**
 * @Author: alexandre.gaia
 */

package br.com.alexandreG;

public class CalculatesGradeAverage {

    public static void main (String[] args){
        float grade1 = 5;
        float grade2 = 5.8F;
        float grade3 = 4.1F;
        float grade4 = 10;

        float CalculateAverage = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.println("The student's average is: " + CalculateAverage);

        if(CalculateAverage >= 6){
            System.out.print("The student is approved!");
        }else{
            System.out.print("The student has been flunked!");
        }
    }
}
