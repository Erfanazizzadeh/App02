package pack;
//#Practice
//Write a program that displays the second and third power of numbers 1 to 10.
//So that the second and third powers of each number are printed in one line, and the second and third powers of the next number are printed in the next line.
public class Test {
    int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void misson() {
     try {
         for (int i = 0; i <= number.length; i++) {
             int numResult = (int) Math.pow(number[i], 2);
             int numResult2 = (int) Math.pow(number[i], 3);
             System.out.println("x :" + number[i] +" => x^2 : " + numResult + "  ,  x^3 : " + numResult2);
         }
     }catch(Exception ex){}
    }






}
