package baseball;

public class Application {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        BaseBall baseBall = new BaseBall();

        Facade facade = new Facade(computer, baseBall, player);
        facade.start();
    }
}
