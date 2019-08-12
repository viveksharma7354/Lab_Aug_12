/*
* @author Vivek Sharma
* @version 1.0
 */
package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        if(n % 4 == 0 || n % 400 == 0){
            System.out.println("Inputted Year Is a Leap Year.");
        }
        else System.out.println("Inputted Year Is Not a Leap Year.");
        }
}

