public class Fish extends GameObject {

    protected int[] fiveMove;
    private int fiveCheck;

    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
        fiveMove = new int[5];
        fiveCheck = 0;
    }

    public char getShape() { return '@'; }

    public void fiveMoving() {
        int check;
        while (true) {
            check = 0;
            for (int i = 0; i < fiveMove.length; i++) {
                fiveMove[i] = (int) (Math.random() * 5);
                if (fiveMove[i] == 4)
                    check++;
            }
            if (check == 3)
                break;
        }
    }

    public void move() {

        if (fiveCheck == 5) {
            fiveCheck = 0;
            fiveMoving();
        } else if (fiveCheck == 0)
            fiveMoving();

        switch (fiveMove[fiveCheck]) {
            case 0:
                if (this.y >= this.distance)
                    this.y -= this.distance;
                break;
            case 1:
                if (this.x >= this.distance)
                    this.x -= this.distance;
                break;
            case 2:
                if (this.x < 10 - this.distance)
                    this.x += this.distance;
            case 3:
                if (this.y < 10 - this.distance)
                    this.y += this.distance;
            case 4:
                break;
        }

        fiveCheck++;
    }
}



