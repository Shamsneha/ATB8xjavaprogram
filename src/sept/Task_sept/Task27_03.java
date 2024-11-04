package sept.Task_sept;
import java.util.Scanner;
public class Task27_03 {
    public static void main(String[] args) {
        //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
        Scanner sc=new Scanner(System.in);
        int num =100;
        int a=1;
        int sum=0;
        while(a <= num)
        {
            sum += a;
            a++;
        }
        System.out.println("The sum of numbers is "+sum);
    }



        }



