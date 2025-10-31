package TwoSum;
import java.util.HashMap;
import java.util.Map;

public class TwosumOC {
    public int[] twosum2(int[] num, int target) {
        Map<Integer, Integer> nummap = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int currentnum = num[i];
            int pair = target - currentnum;//target=pair+currentnum

            if (nummap.containsKey(pair)) {
                int pairindex = nummap.get(pair);
                return new int[]{pairindex, i};
            }
            nummap.put(currentnum, i);
        }
        return new int[0];
    }
}
