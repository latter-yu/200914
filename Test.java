import java.util.*;

public class Main {
    public static void main1(String[] args) {
        List<Character> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String strs  = in.next();
            char[] chars = strs.toCharArray();
            String str = strs.toLowerCase();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length - 2; i++) {
                if (ch[i] != 'c' || ch[i + 1] != 'o' || ch[i + 2] != 'c') {
                    list.add(chars[i]);
                } else {
                    i += 2;
                }
            }
            if (ch[ch.length - 3] != 'c' || ch[ch.length - 2] != 'o' || ch[ch.length - 1] != 'c') {
                list.add(ch[ch.length - 2]);
                list.add(ch[ch.length - 1]);
            }
        }
        for (char l : list) {
            System.out.print(l);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Map<String, Integer> mapText = new HashMap<>();
            Map<String, Integer> mapInput = new HashMap<>();
            String strs  = in.nextLine();
            String[] strText = strs.split(" ");
            String str = in.nextLine();
            String[] strInput = str.split(" ");
            for (int i = 0; i < strText.length; i++) {
                if (!mapText.containsKey(strText[i])) {
                    mapText.put(strText[i], 1);
                } else {
                    mapText.put(strText[i], mapText.get(strText[i]) + 1);
                }
            }
            for (int j = 0; j < strInput.length; j++) {
                if (!mapInput.containsKey(strInput[j])) {
                    mapInput.put(strInput[j], 1);
                } else {
                    mapInput.put(strInput[j], mapInput.get(strInput[j]) + 1);
                }
            }
            List<String> list = new ArrayList<>();
            for (Map.Entry m : mapText.entrySet()) {
                if ((int)m.getValue() == 1 && !mapInput.containsKey(m.getKey())) {
                    list.add("\"" + (String) m.getKey());
                }
            }
            for (Map.Entry m : mapInput.entrySet()) {
                if ((int)m.getValue() == 1 && !mapText.containsKey(m.getKey())) {
                    list.add("\"" + (String) m.getKey());
                }
            }
            System.out.println(list.toString());
        }
    }
}
