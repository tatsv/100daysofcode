import java.util.scanner;
public class Main {
    public static void main (String[]args){
        Scanner scanner= new scanner(System.in);
        int start,end;
        while(true){
            System.out.println("Enter the start number:");
            start= scanner.nextInt();
            System.out.println("Enter the end number:");
            end= scanner.nextInt();
            if(start<end){
                break;
            } else{
                System.out.println("Invalid Number");

            }
        
        } 
        int count = countNumbers(start,end);
        int sum = sumNumbers(start, end);
        long factorial = calculateFactorial(sum);
        
        System.out.println("Count:" + count);
        System.out.println("Sum:" + sum);
        System.out.println("Factorial of sum:" + factorial);
    }
    public static int countNumbers(int start, int end){
        return end - start+1;
    
    }
    public static int sumNumbers(int start, int end){
        int sum = 0;
        for (int i = start; i<=end; i++){
            sum+=i;
        } 
        return sum;
    }
    public static long calculateFactorial(int number){
        long factorial =1;
        for (int i=1; i<=number; i++){
            factorial *=i;
        }
        return factorial;
        }

    }

    
    

