public class Main {
    public static void main(String[] args) {
        RandomWalk walk = new RandomWalk(10, 10);
        walk.takeStep();
        System.out.println(walk);
    }
}    