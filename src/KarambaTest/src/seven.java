import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class seven {

    private static String process(){
        sleep(1000);
        System.out.println("Current Execution thread where the supplier is executed - " + Thread.currentThread().getName());
        return "Hello Educative";
    }
    
    private static String anotherP() {
    	return "Lets Do Another Run";
    }

    private static CompletableFuture<String> createFuture(){
        return CompletableFuture.supplyAsync(seven::process);
    }
    

    private static CompletableFuture<String> createFuture2(){
    	return CompletableFuture.supplyAsync(seven::anotherP);
    }

    private static void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> stringCompletableFuture = createFuture();

        String value = stringCompletableFuture.get();

        System.out.println("Completed Processing. Returned value - " + value);

    }
}