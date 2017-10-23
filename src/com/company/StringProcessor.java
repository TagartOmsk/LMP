package com.company;

public class StringProcessor {
    private static class ArgumentUnderZero extends RuntimeException{
        public ArgumentUnderZero() {
        }

        public ArgumentUnderZero(String message) {
            super(message);
        }
    }

    public static String StringCopier(String origin, int quantity) throws ArgumentUnderZero{
        if(quantity<0){
            throw new ArgumentUnderZero("Argument must be more than zero");
        }
        String result = "";
        for(int i=0;i<quantity;i++){
            result+=origin;
        }
        return result;
    }
    public static int NumOEntries(String orig,String pat){
        int i=0,result=0;
        while(i<orig.length()-1){
            if(orig.charAt(i)==pat.charAt(0)){
                for(int k=0;k<pat.length();k++){
                    if(orig.charAt(i+k)!=pat.charAt(k))break;
                }
                result++;
            }i++;
        }
        return result;
    }
    public static int NumberOfEntries(String origin,String pattern){
        int curPose=0,tempO=0,tempP=0,result=0;
        while(tempO<origin.length()){
            if(origin.charAt(tempO)==pattern.charAt(tempP)){
                tempP++;
                if(tempP==pattern.length()){
                    result++;
                    tempP=0;
                    tempO-=pattern.length()-1;
                }
            }
            tempO++;
        }

        return result;
    }
    public static String NumsIntoChars(String origin){
        origin = origin.replace("1","один");
        origin = origin.replace("2","два");
        origin = origin.replace("3","три");
        origin = origin.replace("4","четыре");
        origin = origin.replace("5","пять");
        origin = origin.replace("6","шесть");
        origin = origin.replace("7","семь");
        origin = origin.replace("8","восемь");
        origin = origin.replace("9","девять");
        origin = origin.replace("0","ноль");
        return origin;
    }

}
