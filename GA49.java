import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GA49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] toCharArr = s.toCharArray();
            Arrays.sort(toCharArr);
            String s2 = new String(toCharArr);

            map.putIfAbsent(s2, new ArrayList<>());
            map.get(s2).add(s);
        }

        return new ArrayList<>(map.values());
    }
}