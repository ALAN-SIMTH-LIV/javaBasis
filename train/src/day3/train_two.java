package day3;

import java.util.*;

public class train_two {
    public static void main(String[] args) {
        // 字符频率统计器
        String str = "PprogrammingPP";  // programming  programmingPP PprogrammingPP

        Map<Character, Integer> strMap = getCharCountMap(str);

//        System.out.println(strMap);

        ArrayList<Map.Entry<Character, Integer>> listNum = compareCount(strMap);

        System.out.println(listNum);

    }

    private static ArrayList<Map.Entry<Character, Integer>> compareCount(Map<Character, Integer> strMap) {
        ArrayList<Map.Entry<Character, Integer>> listNum =new ArrayList<>(strMap.entrySet());

        // 使用匿名内部类（赋值给变量）
        Comparator<Map.Entry<Character, Integer>> comparator = new Comparator<>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };

        Collections.sort(listNum,comparator);

        // 使用匿名内部类
//        Collections.sort(listNum, new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });
        // 使用匿名函数
        // Collections.sort(listNum,(e1,e2)-> e2.getValue().compareTo(e1.getValue()));
        return listNum;
    }


    private static Map<Character, Integer> getCharCountMap(String str) {
        Map<Character,Integer> strMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            int count = 1;
            if (strMap.containsKey(str.charAt(i))){
//                System.out.println("出现多次的字符: "+str.charAt(i));
                count += 1;
            }
            strMap.put(str.charAt(i),count);
        }
        return strMap;
    }
}
