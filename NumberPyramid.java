import java.util.Scanner
public class NumberPyramid {
    public static void main (String[]args){
        Scanner scanner = new scanner(System.in);
        
        System.out.print("Specify the height:");
        int height = Scanner.nextInt();

        for (int i=1; i<=height; i++){

            for (int j = height; j>i; j--){
                System.out.print("");
            } 
            for (int k=1; k<= (2*i-1); k++){
                System.out.print(i);
            }  
            System.out.println();
        } 
    }
    
}
