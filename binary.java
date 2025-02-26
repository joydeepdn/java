
import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        binary obj = new binary();
        System.out.println("Enter any number:");
        int num = scan.nextInt();
        obj.convertBinary(num);
    }
    public void convertBinary(int number){
        int[] binary = new int[8];
        for(int i=0; i<binary.length; i++){
            binary[i] = number % 2;
            number = number/2;

        }
        for(int j = binary.length-1 ; j>=0; j--){
            System.out.println(binary[j]);
        }
        System.out.println("");
    }
}
