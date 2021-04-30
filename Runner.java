import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         System.out.println("Input binary number");
         
         int c = 1;
         int total = 0;
         
         int binaryNum = scan.nextInt();
         String numHolder = String.valueOf(binaryNum);
         
            for (int i = numHolder.length(); i > 0; i--) {
                int numB = Integer.parseInt(numHolder.substring(i-1, i));

                numB *= c;
                c *= 2;

                total += numB; 
            }

            System.out.println(total);
            scan.close();
    }

}
