import java.util.Random;
public class RandomWalk {
    private int xCoord;
    private int yCoord;
    private int maxSteps;
    private int stepsTaken;
    private int edge;

    public RandomWalk(int max, int edge){
        this.edge = edge;
        this.maxSteps = max;
        this.xCoord = 0;
        this.yCoord = 0;
        this.stepsTaken = 0;
    }


    public RandomWalk (int max, int edge, int startX, int startY){
    this.xCoord = startX;
    this.yCoord = startY;
    this.edge = edge;
    this.maxSteps = max;
    }
    boolean moreSteps(){
        if (this.stepsTaken<this.maxSteps){
            return true;
        }else
        return false;
    }

    boolean inBounds(){
        if (this.xCoord < this.edge && this.yCoord < this.edge){
            return true;
        }else
        return false;
    }

    public void takeStep(){
        this.stepsTaken ++;
        Random ran = new Random();
        this.xCoord+=ran.nextInt()%5;
        Random rand = new Random();
        this.yCoord+=rand.nextInt()%5;
    }
    public void walk(){
        while (moreSteps() && inBounds()){
            takeStep();
        }

    }
    public String toString() { 
        return "x and y "+xCoord+yCoord;
    }

}
