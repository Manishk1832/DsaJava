package bank;

import java.util.Scanner;

public class pattern {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int rows = scanner.nextInt();
            int col = scanner.nextInt();


            for (int i = col; i >= 1; i--) {

                for (int j = rows; j <= i; j++) {

                    System.out.print(j);
                }
                System.out.println();
            }

        }

}
