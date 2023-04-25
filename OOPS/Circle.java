class MyCircle{
    private int radius;

    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        MyCircle C1 = new MyCircle();
        C1.setRadius(5);
        System.out.println("the radius is " + C1.getRadius());

    }
}
