import java.util.concurrent.ForkJoinPool;

public class Main {


    public static void main(String[] args) {

        ForkJoinPool executor = new ForkJoinPool();
        Factorial factorial = new Factorial(20);
        executor.execute(factorial);

        Long r = factorial.join();
        System.out.println("Resultat: " + r);

    }


}
