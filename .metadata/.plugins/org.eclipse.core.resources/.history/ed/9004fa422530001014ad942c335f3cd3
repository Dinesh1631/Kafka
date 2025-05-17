package CompletableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo1 {
	public String getFirstName() throws InterruptedException {
		Thread.sleep(4000);
		return "Dinesh";
	}

	public String getLastName() throws InterruptedException {
		Thread.sleep(5000);
		return "Golla";
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		FutureDemo1 demo = new FutureDemo1();
		long start = System.currentTimeMillis();
		System.out.println("Started Main method ..........");
		Callable<String> firstNameCallable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return demo.getFirstName();
			}
		};
		
		Callable<String> lastNameCallable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return demo.getLastName();
			}
		};

		ExecutorService exceutor = Executors.newFixedThreadPool(2);
		Future<String> firstNameFuture = exceutor.submit(firstNameCallable);
		Future<String> lastNameFuture = exceutor.submit(lastNameCallable);
		
		String FirstName = firstNameFuture.get();
		String LastName = lastNameFuture.get();
		System.out.println(FirstName + " " + LastName);
		System.out.println(LastName);
		System.out.println("The time taken to finish the oprition : " + (System.currentTimeMillis() - start));
	}
}
