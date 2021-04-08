public class Palindrome {

    public static void main(String[] args) {
        for (int i = 0; i<args.length;i++){
            if(isPalindrome(args[i])){
                System.out.println(args[i]+" : is Palindrome");
            } else {
                System.out.println(args[i]+" : isn't Palindrome");
            }
        }
    }

    // Возвращает реверсную String из str
    public static String reverseString(String str){
        String result="";
        for (int i = str.length()-1; i >= 0;i--){
            result+=str.charAt(i);
        }
        return result;
    }

    // Проверяет, является ли поступающая String Palindrome
    public static boolean isPalindrome(String s){
        String reverse = reverseString(s);
        return s.equals(reverse);
    }
}
