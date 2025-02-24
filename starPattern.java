public class starPattern {
    public static void main(String[] agrs){
        for(int i = 0; i<=5; i++){
            for(int j=0; j<=i; j++){
               System.out.print("* ");
            }
            System.out.println("");
        }
        for(int k = 4; k>=0; k = k-1 ){
            for(int l=0; l<=k; l++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}