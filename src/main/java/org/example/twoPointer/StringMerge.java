package org.example.twoPointer;


public class StringMerge {
    public static void main(String args[]){
        String merge= mergeString("abcdd","efg");
        System.out.println("String "+merge);
    }
    static public String mergeString(String word1,String word2){
        StringBuffer merge=new StringBuffer();
        int i=0;int j=0;
        while(i<word1.length() && j< word2.length()){
            merge.append(word1.charAt(i++));
            merge.append(word2.charAt(j++));

            if(i==word1.length()){
                if(j<word2.length()){
                    merge.append(word2.substring(j,word2.length()));
                }
            }else  if(j==word2.length()){
                merge.append(word1.substring(i,word1.length()));
            }

        }
        return merge.toString();
    }

}