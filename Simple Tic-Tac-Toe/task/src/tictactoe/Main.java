package tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String aaa = sc.nextLine();
        //String aaa = "O_OXXO_XX";
        String[] x1 = aaa.split("");

        System.out.println("---------");
        System.out.println("| " + x1[0] + " " + x1[1] + " " + x1[2] + " |");
        System.out.println("| " + x1[3] + " " + x1[4] + " " + x1[5] + " |");
        System.out.println("| " + x1[6] + " " + x1[7] + " " + x1[8] + " |");
        System.out.println("---------");
    }
}
