import java.util.Scanner;

public class Bear extends GameObject {

    public Bear(int startX, int startY, int distance) {

        super(startX, startY, distance);
    }

    public char getShape() {

        return 'B';
    }

    public void move() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
        char option = scanner.next().charAt(0);


        switch (option) {
            case 'a':
                if (this.y >= distance)
                    this.y -= this.distance;
                break;
            case 's':
                if (this.x < 10 - this.distance)
                    this.x += this.distance;
                break;
            case 'd':
                if (this.x >= this.distance)
                    this.x -= this.distance;
                break;
            case 'f':
                if (this.y < 20 - this.distance)
                    this.y += this.distance;
                break;
        }
    }
}


