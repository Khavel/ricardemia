package DataStructures;

public class Recursividad {

    public static void main (String[] args){
        System.out.println(factorialRecursivo(20));
    }


    public static int factorialRecursivo(int n){
        if(n == 1){
            return n;
        }else{
            return n * factorialRecursivo(n-1);
        }
    }
}
