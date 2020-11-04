package practice.program.calc;
import java.util.*;

class MainCalculator
{
   public static void main(String[] args)
   {
       Scanner scn = new Scanner(System.in);

       System.out.println("Enter the Size: ");
       double [] arr = new double[scn.nextInt()];

       int size = arr.length;

       System.out.println("Enter the numbers for calculation: \n ");

       for(int i=0; i<size; i++)
       {
           arr[i] = scn.nextDouble();
       }

       Calculation calc = new Calculation();

       System.out.println("Enter the calculating operator: ");
       char opr = scn.next().charAt(0);

       if(size > 2)
       {
           if(opr == '+')
               calc.addition(arr,size); //overloading
           if(opr == '*')
               calc.multiplication(arr,size);
           if(opr == '-' || opr == '/')
               System.out.println("Invalid Operator");
       }
       else {
           if(opr == '+')
               calc.addition(arr); //overloading
           if(opr == '*')
               calc.multiplication(arr);
           if(opr == '-')
               calc.subtraction(arr);
           if(opr == '/')
               calc.division(arr);
       }
  }
}
