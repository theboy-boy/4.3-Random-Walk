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
    public void takeStep(){
        this.stepsTaken ++;
        this.xCoord+=Math.round(Math.random()*4);
        this.yCoord+=Math.round(Math.random()*4);
    }


}
