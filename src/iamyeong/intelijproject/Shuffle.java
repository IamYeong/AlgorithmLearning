package iamyeong.intelijproject;

import java.util.ArrayList;
import java.util.List;

public class Shuffle {

    private List<Object> mixedList;
    private int listCount = 1;

    public Shuffle() {
        mixedList = new ArrayList<>();
    }

    public void shuffle(int n) {

        for (int i = 1; i <= n; i++) {
            mixedList.add(i);
        }

        System.out.println(mixedList);

        for (int i = mixedList.size(); i > 0; i--) {

            double random = Math.random() * i - 1;
            Object e = mixedList.get(i-1);
            Object k = mixedList.get((int)random);

            mixedList.set((int)random, e);
            mixedList.set(i-1, k);

        }

        System.out.println(mixedList);
    }




}
