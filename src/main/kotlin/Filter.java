import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {


        System.out.println("Boucle");

        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> output = new ArrayList<>();

        for (Integer number : input) {
            if (number >= 2) {
                output.add(number);
            }
        }

        System.out.println(String.format("%s -> %s", input, output));



        System.out.println("Stream");

        List<Integer> input2 = Arrays.asList(1, 2, 3);

        final List<Integer> output2 = input2.stream()
                .filter(number -> number >= 2)
                .collect(Collectors.toList());

        System.out.println(String.format("%s -> %s", input2, output2));

    }

}
