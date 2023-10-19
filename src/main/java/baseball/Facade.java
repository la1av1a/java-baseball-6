package baseball;

import java.util.List;

public class Facade {

    private final Computer computer;
    private final BaseBall baseBall;
    private final Player player;

    public Facade(Computer computer, BaseBall baseBall, Player player) {
        this.computer = computer;
        this.baseBall = baseBall;
        this.player = player;
    }

    public void start() {
        List<Integer> numbers = init();
    }

    private List<Integer> init() {
        return computer.pickUniqueNumbersInRange(0, 9, 3);
    }
}
