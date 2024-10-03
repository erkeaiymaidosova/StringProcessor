package org.example;

public class StringProcessor {
    public boolean isStrongPassword(String password){
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean symbol=false;
        for(int i=0;i<password.length();i++){
            char p=password.charAt(i);
            if(Character.isLowerCase(p)){
               lower=true;
            }
            if(Character.isUpperCase(p)){
                upper=true;
            }
            if(Character.isDigit(p)){
                digit=true;
            }
            if(!Character.isLetterOrDigit(p)){
                symbol=true;
            }
        }
        if(upper && lower && digit && symbol){
            return true;
        }else{
            return false;
        }

    }
    public int calculateDigits(String sentence){
        int count=0;
        for(int i=0;i<sentence.length();i++){
            char s = sentence.charAt(i);
            if(Character.isDigit(s)){
                count++;
            }
        }
        return count;
    }
    public int calculateWords(String sentence){
        int spaces=0;
        for(int i=1;i<sentence.length()-1;i++){
            char space=sentence.charAt(i);
            if(space==' '){
                spaces++;
            }
        }
        return spaces+1;
    }
    public double calculateExpression(String expression){
        
    }
}
