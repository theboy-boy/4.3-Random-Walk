import java.util.Scanner;
public class DrunkenWalk {
    public static void main(String[] args) {
        int drunksFallen = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number of drunks: ");
        int num = scan.nextInt();
        System.out.print("enter nuber of steps of each drunk: ");
        int maxSteps = scan.nextInt();
        System.out.print("edge of the square: ");
        int edge = scan.nextInt();
        scan.close();
        for (int i=0; i < num; i++){
            RandomWalk drunk = new RandomWalk(maxSteps, edge);
            drunk.walk();
            if (!drunk.inBounds()){
            drunksFallen++;
            }
        }
        System.out.println(drunksFallen+"drunks fallen");
    }
    
}
