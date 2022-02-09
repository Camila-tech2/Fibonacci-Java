//Sequencia de fibonacci
package fibonaccicamila;

/*
 * @author camila
 */
public class FibonacciCamila {
    static long fibo(int n){
        if (n<2){
        return n;
        }// fim do if
        
        else {
        return fibo (n - 1) + fibo(n - 2);
        }// fim do else
        
    }// fim do long
   
    public static void main(String[] args) {
        for (int i=0; i<30; i++) {
            System.out.println("(" + i + ")" + FibonacciCamila.fibo(i) + "\t");
        }// fim do for
        
    }// fim do main
}// fim do public class