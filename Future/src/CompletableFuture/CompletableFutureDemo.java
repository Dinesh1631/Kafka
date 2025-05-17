package CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
	
	public String getFirstName() {
		System.out.println("The is executed by getFisrStName : " + Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Dinesh";
	}

	public String getLastName()  {
		System.out.println("The is executed by  getLastName: " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Golla";
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException {	
		long start = System.currentTimeMillis();
		System.out.println("Code execution started");
		CompletableFutureDemo future = new CompletableFutureDemo();
		CompletableFuture<Void> callableFutureFirstName = CompletableFuture.supplyAsync(()-> future.getFirstName())
				                                       .thenAccept(str ->System.out.println(str));
		
		CompletableFuture<Void> callableFutureLastName = CompletableFuture.supplyAsync(()-> future.getLastName())
                .thenAccept(str ->System.out.println(str));
				                                   
		System.out.println("The is executed by Main Method : " + Thread.currentThread().getName());
		System.out.println("Done Code executuion is done");
		System.out.println("Total time takesn is : " +(System.currentTimeMillis()-start));
		Thread.sleep(5000);
	}
}
