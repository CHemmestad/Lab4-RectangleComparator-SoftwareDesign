import java.util.*;

public class ComparatorTest implements Comparator<Rectangle2DDouble> {
    private int direction; 

    //Sets the direction of the comparator for how to sort
    public ComparatorTest(int direction_) {
        direction = direction_;
    }

    //Compares two objects (used for the Collections.sort() I think))
    public int compare(Rectangle2DDouble object1, Rectangle2DDouble object2) {
        return direction*object1.compareTo(object2);
    }
}
