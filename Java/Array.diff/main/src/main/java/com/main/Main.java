package com.main;

import java.util.ArrayList;

public class Main {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            boolean found = false;
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                resultList.add(a[i]);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
      }
}