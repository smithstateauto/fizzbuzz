package com.stateauto;

/**
 * Created by wea3765 on 3/28/2017.
 */
public class FizzBuzz {
    private int[] mycount;
    public int[] countToOne() {
        return countToMany(1);
    }

    public int[] countToTwo() {
        return countToMany(2);
         }
    public int[] countToOneHundred(){
        return countToMany(100);
    }

    public int[] countToMany(int count) {
        mycount= new int[count];
        for(int i =0;i<count; i++){
            mycount[i]=i+1;
        }
        return  mycount;

    }
}
