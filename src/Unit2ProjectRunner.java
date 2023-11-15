import java.util.Scanner;


public class Unit2ProjectRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("");
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        System.out.println("");


        Unit2Project coords = new Unit2Project(coord1, coord2);
        System.out.println("The two coords are: " + coords.getCoord1() + " and " + coords.getCoord2());
        coords.parse(coord1, coord2);
        System.out.println(coords.linearEquation());
        System.out.println(coords.getSlope());
        System.out.println(coords.getYInt());
        System.out.println("The distance between these two points is: " + coords.distance());
        System.out.println();
        System.out.print("Enter an x coordinate: ");
        double xcoord = scan.nextDouble();
        System.out.println(coords.point(xcoord));
    }
}
