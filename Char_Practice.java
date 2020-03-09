public class Char_Practice {
    public  static void main(String[] args){
        System.out.println("The character 'a' is "+Character.isDigit('a'));
        System.out.println("The character 'A' is "+Character.isLetter('A'));
        System.out.println("isLetterOrDigit('a') is "+Character.isLetterOrDigit('a'));//字母或者数字返回true
        System.out.println("isLowerCase('a') is "+Character.isLowerCase('a'));//小写字母返回true
        System.out.println("isUpperCase('a') is "+Character.isUpperCase('a'));//大写字母返回true
        System.out.println("toLowerCase('A') is "+Character.toLowerCase('A'));//转换成小写字母
        System.out.println("toUpperCase('f') is "+Character.toUpperCase('f') );//转换成大写字母
    }
}
