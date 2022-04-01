package com.bs.logics;

public class Rough {
    public static void main(String[] args) {
        String str = "I am an Indian";
        int length = str.length ();
        char[] ch = str.toCharArray ();
        String res="";
        for (int i = 0; i < length; i++) {
            int k=i;
            //loop to increase i upto white space
            while (i < length && ch[i] != ' ') {
                i++;
            }

            //take pointer to before space character
            int j=i-1;
            //append char from initial index to before space char and concate to string
            while(k<=j){
                res=res+ch[j];
                j--;
            }
            res=res+' ';
        }

        System.out.println (res);
    }
}
