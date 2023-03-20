import java.util.*;

public class ComparatorTest implements Comparator<Rectangle2DDouble> {
    private int direction; 

    public ComparatorTest(int direction_) {
        direction = direction_;
    }

    public int compare(Rectangle2DDouble object1, Rectangle2DDouble object2) {
        return direction*object1.compareTo(object2);
    }
}
