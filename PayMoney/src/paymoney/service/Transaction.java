package paymoney.service;

public class Transaction {
	public void getStatus(int[] arr, int target) {
		int size = arr.length;
		int transactionSum = 0;
		int i = 0;
		while (transactionSum <= target && i < size) {
			transactionSum = transactionSum + arr[i];
			i++;
		}
		if (transactionSum >= target) {
			System.out.println("Target is achieved after " + i + " transactions");
		}else {
			System.out.println("Given target is not achieved");
		}
	}

}
