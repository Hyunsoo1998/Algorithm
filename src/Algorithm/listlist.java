package Algorithm;

import java.util.*;

public class listlist {
    public static void main(String[] args) {


        //일반적인 2차원 배열
        int[][] temp = new int[1][1];


        //case2: ArrayList(1) Integer이용


        //동적인 ArrayList안에 정적 array넣기.
        ArrayList<Integer[]> list = new ArrayList<Integer[]>();

        list.add(new Integer[]{1, 2, 3});
        list.add(new Integer[]{4, 5, 6});

//        System.out.println(list.get(0));

        System.out.println(list.get(0)[0]);


        //case3: ArrayList(2) List중첩
        //우테코 문제에서 출제한 자료형!!
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String[] arrRowTempItems = {"1", "2", "3", "4", "5"};

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 5; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);

        }
        System.out.println(arr.get(1)); //출력 예시
        System.out.println(arr.get(1).get(0)); //출력 예시
    }
}
