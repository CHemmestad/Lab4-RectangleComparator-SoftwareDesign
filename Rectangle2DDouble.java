public class Rectangle2DDouble implements Comparable<Rectangle2DDouble> {
    //Adding variables
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle2DDouble(double x_, double y_, double width_, double height_){
        //Constructor and making sure numbers arent negative
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

    //Precondition : Want to print the elements in the objects in the arraylist
    //Postcondition : Prints the elements so it looks nice
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

    //Precondition : Need to compare the variables in the objects to sort
    //Postcondition : Compares the objects and returns 1 or -1 for sorting
    public int compareTo(Rectangle2DDouble object) {
        if(getX() > object.getX()) {
            return 1;
        } else if(getX() < object.getX()) {
            return -1;
        } else {
            return compareY(object); //Compares the next variable if the first is equal
        }
    }

    //Precondition : If first variable was equal then it needs to check the next variable
    //Postcondition : Checks the next variable and returns 1 or -1 for sorting
    private int compareY(Rectangle2DDouble object) {
        if(getY() > object.getY()) {
            return 1;
        } else if(getY() < object.getY()) {
            return -1;
        } else {
            return compareWidth(object); //Compares the next variable if equal
        }
    }

    //Precondition : If last variable was equal then it needs to check the next variable
    //Postcondition : Checks the next variable and returns 1 or -1 for sorting
    private int compareWidth(Rectangle2DDouble object) {
        if(getWidth() > object.getWidth()) {
            return 1;
        } else if(getWidth() < object.getWidth()) {
            return -1;
        } else {
            return compareHeight(object); //Compares the next variable if equal
        }
    }

    //Precondition : If last variable was equal then it needs to check the next variable
    //Postcondition : Checks the next variable and returns 1, -1, or 0 for sorting
    private int compareHeight(Rectangle2DDouble object) {
        if(getHeight() > object.getHeight()) {
            return 1;
        } else if(getHeight() < object.getHeight()) {
            return -1;
        } else {
            return 0; //Last variable in the object so returns 0 if they are all equal
        }
    }

    //Precondition : User could put in a negative number and I dont like that
    //Postcondition : Changes the number to positive if negative is entered
    private double noNegative(double number) {
        if(number < 0) {
            return number*(-1);
        } else {
            return number;
        }
    }
}
