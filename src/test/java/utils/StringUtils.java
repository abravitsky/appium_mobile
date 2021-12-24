package utils;

public class StringUtils {
    public static String leaveNumbers(String word){
       return word.replaceAll("[^0-9]", "");
    }
}
