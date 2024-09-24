package org.example;

public class App 
{
    public static String expandedForm(int num)
    {
        StringBuilder str = new StringBuilder(String.valueOf(num));
        String temp = "";
        StringBuilder answer = new StringBuilder();
        temp = str.substring(0);
        temp = temp.replaceAll("(?<=.)(.)", "0");
        answer.append(temp);
        for(int i = 1; i < str.length(); i++){
            temp = str.substring(i);
            if(temp.charAt(0) != '0') {
                temp = temp.replaceAll("(?<=.)(.)", "0");
                answer.append(" + ");
                answer.append(temp);
            }
        }
        return answer.toString();
    }
}
