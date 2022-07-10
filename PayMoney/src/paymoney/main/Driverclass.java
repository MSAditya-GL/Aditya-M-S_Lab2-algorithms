package paymoney.main;

import java.util.Scanner;

import paymoney.service.Transaction;

public class Driverclass {

	public static void main(String[] args) {
		System.out.println("Enter the size of Transaction Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the value of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < size; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTarget = sc.nextInt();
		while (noOfTarget-- != 0) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			Transaction service = new Transaction();
			service.getStatus(arr, target);
		}
		sc.close();
	}

}
