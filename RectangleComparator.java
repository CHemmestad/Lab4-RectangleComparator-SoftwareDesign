import java.util.*;

public class RectangleComparator {
    public static void main(String[] Args) {
        Comparator<Rectangle2DDouble> compLeastToGreatest = new ComparatorTest(1);
        Comparator<Rectangle2DDouble> compNothing = new ComparatorTest(0);
        Comparator<Rectangle2DDouble> compGreatestToLeast = new ComparatorTest(-1);

        ArrayList<Rectangle2DDouble> list = new ArrayList<>();
        list.add(new Rectangle2DDouble(8, 2, 6, 8));
        list.add(new Rectangle2DDouble(3, 4, 5, 6));
        list.add(new Rectangle2DDouble(4.0001, 4, 4, 4));
        list.add(new Rectangle2DDouble(4, 4, 4, 4));
        list.add(new Rectangle2DDouble(1, 4, 5, 2));
        list.add(new Rectangle2DDouble(8, 3, 6, 8));
        list.add(new Rectangle2DDouble(4.5, 4, 5, 2));
        list.add(new Rectangle2DDouble(4.12, 4, 4, 5));
        list.add(new Rectangle2DDouble(6, 9, 1, 6));
        list.add(new Rectangle2DDouble(2, 2, 6, 8));
        list.add(new Rectangle2DDouble(4.25, 1, 9, 5));
        list.add(new Rectangle2DDouble(8, 8, 1, 2));
        list.add(new Rectangle2DDouble(9, 4, 8, 7));
        list.add(new Rectangle2DDouble(-99, 4, 8, 7));
        list.add(new Rectangle2DDouble(-1.5, 4.0101, -9, 5));

        System.out.println("Nothing");
        Collections.sort(list, compNothing);
        for (Rectangle2DDouble index : list) {
            index.print();
        }
        System.out.println();

        System.out.println("Least to greatest");
        Collections.sort(list, compLeastToGreatest);
        for (Rectangle2DDouble index : list) {
            index.print();
        }
        System.out.println();

        System.out.println("Greatest to least");
        Collections.sort(list, compGreatestToLeast);
        for (Rectangle2DDouble index : list) {
            index.print();
        }
        System.out.println();
    }
}