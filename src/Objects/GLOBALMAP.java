package Objects;

public class GLOBALMAP {
    /**
     * Class for global map.
     *
     */

    private int minX;
    private int minY;
    private int maxX;
    private int maxY;
    private TerritorialCell [][] territorialCells;

    public GLOBALMAP() {
        int minX=0;
        int minY=0;
        int maxX=9;
        int maxY=9;
        territorialCells = new TerritorialCell[maxY+1][maxX+1];
    }
}
