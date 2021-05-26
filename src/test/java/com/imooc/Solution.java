package com.imooc;

public class Solution {
    public static void main(String[] args) {
        String s ="PAYPALISHIRING";
        int numRows = 3;
        String convert = convert(s, numRows);
        System.out.println(convert);
    }
    public static String convert(String s, int numRows) {
        String[] res = new String[numRows];
        int j = 0;
        boolean flag = false;//true向下，false向上
        for(int i=0;i<s.length();i++){
            if(i%(numRows-1)==0){
                flag=!flag;
            }
            if(flag==true){
                res[j]+=s.charAt(i);
                j++;
            }else{
                res[j]+=s.charAt(i);
                j--;
            }
        }
        String result = "";
        for(int i=0;i<numRows;i++){
            result+=res[i];
        }
        return result;
    }
}