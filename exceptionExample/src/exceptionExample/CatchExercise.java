package exceptionExample;

public class CatchExercise {
    public static void main(String[] args) {
    	
        try {
            int[] a = new int[5];
             a[5] = 30 / 5;
             
        } 
        catch (ArithmeticException e)
        {
            System.out.println(" Can't Division by zero ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds.");
        }
        
    }
}
