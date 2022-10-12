class Point_3 {
    private int x, y;

    public Point_3(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint_3 extends Point_3 {
    private String color;
    private ColorPoint_3(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y) {
        move(x, y);
    }
    private void setColors(String color) {
        this.color = color;
    }
    public String toString() {
        return (color+"색의 ("+getX()+","+getY()+")의 점");
    }

    public static void main(String[] args) {
        ColorPoint_3 cp = new ColorPoint_3(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColors("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}




