package com.stateauto;

/**
 * Created by wea3765 on 3/28/2017.
 */
public class FizzBuzz {
    public String[] countToOne() {
        return countToManyAsString(1);
    }

    public String[] countToTwo() {
        return countToManyAsString(2);
         }
    public String[] countToOneHundred(){
        return countToManyAsString( 100);
    }

    public String[] countToThree() {
        return countToManyAsString(3);
    }

    public String[] countToSix() {
        return countToManyAsString(6);
    }

    public String[] countToFive() {
        return countToManyAsString(5);
    }

    public String[] countToManyAsString(int count) {
        String[] mycount= new String[count];
        for(int i =0;i<count; i++) {
            if ((i+1)%3==0) {
                mycount[i] = "fizz";
            } else if ((i+1)%5==0) {
                mycount[i] = "buzz";
            } else {
                mycount[i] = String.valueOf(i + 1);
            }
        }

        return  mycount;
    }

//    public String[] countToEight() {
//        return countToManyAsString(8);
//    }
}
