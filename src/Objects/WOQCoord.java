package Objects;

public class WOQCoord {
    long xCoord;

    public long getxCoord() {
        return xCoord;
    }

    public long getyCoord() {
        return yCoord;
    }

    long yCoord;

     WOQCoord startCoord(){
        xCoord=2;
        yCoord=2;
        return this;
    }

}
