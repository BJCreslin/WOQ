package Objects;

public class WOQLevel implements WOQMAXLVL {
    private int LVLint;
    private long LVLexp;

    public WOQLevel() {
        LVLint = intialLVL();
        LVLexp = initialEXP();
    }

    /**
     * функция инициирования exp
     *
     * @return 0
     */
    private long initialEXP() {
        return 0;
    }

    /**
     * функция инициирования 1-го уровня
     *
     * @return 1
     */
    private int intialLVL() {
        return 1;
    }

}
