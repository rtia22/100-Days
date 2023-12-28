
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Day81 {

    public static void main(String[] args) {
        Integer[] data = {23, 17, 8, 20, 30, 56, 78, 6, 32, 3, 2, 63, 10};
        System.out.print("BEFORE SORTING : ");
        System.out.println(Arrays.toString(data));

        //Sorting ascending
        Arrays.sort(data);
        System.out.print("AFTER SORTING ASC : ");
        System.out.println(Arrays.toString(data));

        //sortng descending
        Arrays.sort(data, Collections.reverseOrder());
        System.out.print("AFTER SORTING DESC : ");
        System.out.println(Arrays.toString(data));
    }
}
