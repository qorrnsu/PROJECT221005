public class Game {

    private final Bear bear;
    private final Fish fish;

    Game() {
        bear = new Bear(0, 0, 2);
        fish = new Fish(6, 6, 1);
    }

    public void run() {

        while(true) {
            System.out.println();
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 20; j++) {
                    if (bear.getX() == i && bear.getY() == j)
                        System.out.print(bear.getShape());
                    else if (fish.getX() == i && fish.getY() == j)
                        System.out.print(fish.getShape());
                    else
                        System.out.print("-");
                }
                System.out.println("");
            }

            bear.move();
            fish.move();

            if (bear.collide(fish)) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (bear.getX() == i && bear.getY() == j)
                            System.out.print(bear.getShape());
                        else
                            System.out.print("-");
                    }
                    System.out.println();
                }

                finish();
            }
        }
    }

    public void finish() {

        System.out.println("Bear Wins!!");
        System.exit(0);
    }

    public static void main(String[] args) {

        Game game = new Game();
        System.out.println("**Bear의 Fish 먹기 게임을 시작합니다.**");
        game.run();
    }
}
