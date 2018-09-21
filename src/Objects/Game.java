package Objects;

import view.ConsoleView;
import view.VIEW;

public class Game {
    private PERSON person;
    private GLOBALMAP globalmap;
    private VIEW view;

    public Game() {
        person = new PERSON();

        globalmap = new GLOBALMAP();
        view = new ConsoleView();
    }


}
