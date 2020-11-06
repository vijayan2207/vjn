package calc;

class Calculation implements Operator
{
    private double sum = 0; //@Encapsulation
    private double multi = 1; //@Encapsulation
    double diff = 0;
    double div = 1;

    public void addition(double[] a) //@Overriding - Runtime Polymorphism
    {
        sum = a[0]+a[1];
        System.out.println("Addition with two numbers: "+sum);
    }
    public void addition(double[] a, int size) //@Overloading - same method differs with arguments
    {
        for(int i=0; i<size; i++){
            sum = sum+a[i];
        }
        System.out.println("Summation: "+sum);
    }
    public void multiplication(double[] a) //@Overriding - Runtime Polymorphism
    {
        multi = a[0]*a[1];
        System.out.println("Multiplied with two numbers: "+multi);
    }
    public void multiplication(double[] a, int size) //@Overloading - same method differs with arguments
    {
        for(int i=0; i<size; i++){
            multi = multi*a[i];
        }
        System.out.println("Multiplied Value: "+multi);
    }
    public void subtraction(double[] a) //@Overriding
    {
        diff = a[0]-a[1];
        System.out.println("Difference : "+diff);
    }
    public void division(double[] a) //@Overriding
    {
        div = a[0]/a[1];
        System.out.println("Divided Value: "+div);
    }

}

