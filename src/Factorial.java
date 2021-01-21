import java.util.concurrent.RecursiveTask;

public class Factorial extends RecursiveTask<Long> {
    private final int n;

    public Factorial(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if(n>8) return factorialRec();
        else return factorialIter();
    }

    private Long factorialRec() {
//        if (n==1) return 1L;
        Factorial factorial = new Factorial(n-1);
        factorial.fork();
        return factorial.join() * n;
    }

    private Long factorialIter(){
        Long result = 1L;
        int i=1;
        while (i<=n){
            result = result * i;
            i++;
        }
        return result;
    }
}
