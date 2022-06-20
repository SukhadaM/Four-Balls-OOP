import processing.core.PApplet;

public class Shape {
    public int x;
    public int y;
    public int speed;

    public Shape(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void setx(int x){
        this.x = x;
    }

    public void sety(int y){
        this.y = y;
    }

    public void setspeed(int speed){
        this.speed = speed;
    }

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }

    public int getspeed(){
        return speed;
    }

    public void changex(){
        setx(getx() + getspeed());
    }
}

public class Circle extends Shape{
    private int diameter;
    public Circle(int x, int y, int speed, int diameter) {
        super(x, y, speed);
        this.diameter = diameter;
    }

    public int getdiameter() {
        return diameter;
    }
}

public class FourBallsOOP extends PApplet {
    final int Width = 640;
    final int Height = 480;
    final int Diameter = 10;

    public static void main(String[] args) {
        PApplet.main("FourBallsOOP", args);
    }

    Circle ball1 = new Circle(0, Height / 5, 1 , Diameter);
    Circle ball2 = new Circle(0, 2 * Height / 5, 2 , Diameter);
    Circle ball3 = new Circle(0, 3 * Height / 5, 3 , Diameter);
    Circle ball4 = new Circle(0, 4 * Height / 5, 4 , Diameter);

    public void settings(){
        super.settings();
        size(Width, Height);
    }

    public void draw(){
        drawBall(ball1);
        ball1.changex();

        drawBall(ball2);
        ball2.changex();

        drawBall(ball3);
        ball3.changex();

        drawBall(ball4);
        ball4.changex();
    }

    public void drawBall(Circle circle){
        ellipse(circle.getx(), circle.gety(), circle.getdiameter(), circle.getdiameter());
    }
}
