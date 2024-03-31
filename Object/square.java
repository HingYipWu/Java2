package Object;

public class square {

    private double accUD = -10.0;
    private double accLR = 0;
    private double vUD = 0;
    private double vLR = 0;
    private double positionX;
    private double positionY;

    public square(int x , int y){
        positionX = x;
        positionY = y;
    }

    public void updateSquare(){
        positionY = vUD + ((1/2)*accUD);
        positionX = vLR + ((1/2)*accLR);
        vUD = vUD + accUD;
        vLR = vLR + accLR;
    }

}
