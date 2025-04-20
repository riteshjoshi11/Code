package org.example.twoPointer;

public class pluseandNegative {
    public static void main(String args[]){
        int positive=0;
        int negative=0;
        int zero=0;
        Integer arr[]=new Integer[]{1,2,3,-1,-1,0};
        for (Integer integer : arr) {
            if(integer>0){
                positive++;
            }
            else if(integer<0){
                negative++;
            } else{
                zero++;
            }

        }
        System.out.println(String.format("%.6f", positive*1.000000/arr.length) );
        System.out.println(String.format("%.6f",negative*1.000000/arr.length));
        System.out.println(String.format("%.6f",zero*1.000000/arr.length));
    }
}
