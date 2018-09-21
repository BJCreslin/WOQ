package Objects;

public class PERSON {
    private WOQRase rase;
    private WOQgender gender;
    private WOQClas clas;
    private WOQLevel level;
    private WOQStatistic statistic;
    private WOQCoord coord;


    public PERSON() {
        rase=selectRase();
        gender=selectGender();
        clas=selectClass();
        level=setStartLevel();
        statistic =new WOQStatistic();
        coord =new WOQCoord();
        coord=coord.startCoord();
    }

    private WOQLevel setStartLevel() {
        return new WOQLevel();
    }

    private WOQClas selectClass() {
        return WOQClas.warrior;
    }

    private WOQgender selectGender() {
        return WOQgender.male;
    }

    private WOQRase selectRase() {
        return WOQRase.elf;
    }


}
