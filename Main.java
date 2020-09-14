import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String strs = sc.next();
            char[] chars = strs.toCharArray();
            int max = 0;
            int val = 0;
            for (int i = 0; i < chars.length - 1; i++) {
                Map<Character, Integer> map = new HashMap<>();
                map.put(chars[i], 1);
                int count = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (!map.containsKey(chars[j])) {
                        map.put(chars[j], count);
                        count++;
                    } else {
                        if (max < count) {
                            max = count;
                        }
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String num = sc.next();
            String[] arr = num.split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
            int len = arr.length / 2;
            int max = 0;
            for (Map.Entry m : map.entrySet()) {
                int val = (int)m.getValue();
                if (val > max) {
                    max = val;
                }
            }
            if (max < len) {
                System.out.println(-1);
            }
            for (Map.Entry m : map.entrySet()) {
                int val = (int)m.getValue();
                System.out.println(val);
                if (val == max) {
                    System.out.println(m.getKey());
                    break;
                }
            }
        }
    }
}