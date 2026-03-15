package CodingRounds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VariableDivisionQueryEvaluator {
    public static void main(String[] args) {
        double[] values = {6.0, 3.0, 2.0, 4.0};
        String[][] queries = {{"a", "b"}, {"c", "a"}, {"d", "x"}};
        System.out.println("Values : " + Arrays.toString(values));
        System.out.println("Queries: " + Arrays.deepToString(queries));
        double[] result = evaluate(values, queries);
        System.out.println("Result : " + Arrays.toString(result));
    }

    public static double[] evaluate(double[] values, String[][] queries) {
        Map<Character, Double> map = new HashMap<>();
        for (int i = 0; i < values.length; i++) {
            char variable = (char) ('a' + i);
            map.put(variable, values[i]);
        }
        double[] result = new double[queries.length];

        for (int i = 0; i < queries.length; i++) {
            char v1 = queries[i][0].charAt(0);
            char v2 = queries[i][1].charAt(0);
            if (map.containsKey(v1) && map.containsKey(v2)) {
                result[i] = map.get(v1) / map.get(v2);
            } else {
                result[i] = -1.0; // Return -1.0 for invalid queries
            }
        }
        return result;
    }
}
