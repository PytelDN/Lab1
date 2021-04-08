public class Primes {

    public static void main(String[] args) {
        for (int i = 2; i<= 100; i++){
            if (isPrime(i)){
                System.out.print(i+", ");
            }
        }
    }

    /* Метод проверяющий, является ли поступившее число простым
    В случае если является, return true, иначе return false


     */
    private static boolean isPrime(int value){
        if (value <= 1){
            return false;
        }
        for (int i = 2; i < value; i++){
            if (value%i==0){
                return false;
            }
        }
        return true;
    }
}
