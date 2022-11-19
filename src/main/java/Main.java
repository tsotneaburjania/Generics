import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        fromArrayToList ფუნქცია მუშაობს ნებისმიერ ტიპზე
        Integer[] integers = new Integer[]{1,3,4,5,6,7};
        List<Integer> integerList = fromArrayToList(integers);
        for (Integer integer :
                integerList) {
            System.out.println(integer);
        }

        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(12, 12),
                new Rectangle(14, 15),
                new Rectangle(12, 10),
        };
        List<Rectangle> rectangleList = fromArrayToList(rectangles);

//        განზოგადებული ტიპის პარამეტრი უნდა ემთხვეოდეს ტოლობის ორივე მხარეს
        List<Figure> figures = new ArrayList<Figure>();
        figures.add(new Rectangle(12, 12)); // შვილობილის დამატება შეიძლება

        Rectangle rect1 = new Rectangle(13, 13);
        String str = "I AM STRIQONI";
//        custom მონაცემთა სტრუქტურა - წყვილი (Tuple)
        Tuple<Rectangle, String> tuple = createTuple(rect1, str);
        System.out.println(tuple.getElementOne());
    }

    public static <T> List<T> fromArrayToList(T[] a){
        return Arrays.asList(a);
    }

//    fromArrayToList ფუნქციის შეზღუდული ვარიანტი, სადაც
//    T უნდა იყოს Figure-ს შვილობილი აუცილებლად და არა
//    რამე სრულიად ნებისმიერი
    public static <T extends Figure> List<T> fromArrayToList(T[] a){
        return Arrays.asList(a);
    }

    public static <E,T> Tuple<E,T> createTuple(E elementOne, T elementTwo){
        return new Tuple<>(elementOne, elementTwo);
    }
}
