public class Rectangle2DDouble implements Comparable<Rectangle2DDouble> {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle2DDouble(double x_, double y_, double width_, double height_){
        x = noNegative(x_);
        y = noNegative(y_);
        width = noNegative(width_);
        height = noNegative(height_);
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void print() {
        System.out.print(x);
        System.out.print(" , ");
        System.out.print(y);
        System.out.print(" , ");
        System.out.print(width);
        System.out.print(" , ");
        System.out.print(height);
        System.out.println();
    }

    public int compareTo(Rectangle2DDouble object) {
        if(getX() > object.getX()) {
            return 1;
        } else if(getX() < object.getX()) {
            return -1;
        } else {
            return compareY(object);
        }
    }

    private int compareY(Rectangle2DDouble object) {
        if(getY() > object.getY()) {
            return 1;
        } else if(getY() < object.getY()) {
            return -1;
        } else {
            return compareWidth(object);
        }
    }

    private int compareWidth(Rectangle2DDouble object) {
        if(getWidth() > object.getWidth()) {
            return 1;
        } else if(getWidth() < object.getWidth()) {
            return -1;
        } else {
            return compareHeight(object);
        }
    }

    private int compareHeight(Rectangle2DDouble object) {
        if(getHeight() > object.getHeight()) {
            return 1;
        } else if(getHeight() < object.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }

    private double noNegative(double number) {
        if(number < 0) {
            return number*(-1);
        } else {
            return number;
        }
    }
}
