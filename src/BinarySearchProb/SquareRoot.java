package BinarySearchProb;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        System.out.println(findSqrt(number));
    }

    static int findSqrt(int number) {
        if(number<2){
            return number;
        }
        int left=0;
        int right=number;
        while(left<=right){
            int mid=left+(right-left)/2;
            long midSquared = (long) mid * mid;
            if(number==mid*mid){
                return mid;
            }
            else if(midSquared>number){ // ex:8/2=4--->4*4=16>8
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return right; //this gives the highest possible integer whose square does not exceeds number.
        //This value is the floored square root of num since square of left may exceed the number but square of right
        // will never exceed at the end of loop since it decrements

    }

}
