/*
* @author Vivek Sharma
* @version 1.0
 */
package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        double speed, distance;
        double gravity = 9.8 ;
        double time = S.nextDouble();
        speed = time * gravity ;
        distance = (0.5 * gravity * time * time);
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the release is " + distance);
    }
}

