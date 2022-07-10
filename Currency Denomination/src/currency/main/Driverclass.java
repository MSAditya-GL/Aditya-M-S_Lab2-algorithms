package currency.main;

import java.util.Scanner;

import currency.service.ModifiedMergeSort;

import currency.service.Service;

public class Driverclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service currency = new Service();
		ModifiedMergeSort mergesort = new ModifiedMergeSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		if (size > 0) {
			System.out.println("Enter the currency denomination value");
			int[] notes = new int[size];
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			mergesort.sort(notes, 0, notes.length - 1);
			System.out.println("Enter the amount you want to pay");
			int amount = sc.nextInt();
			currency.notesCountImplementation(notes, amount);
			sc.close();
		} else {
			System.out.println("Enter the valid size of currency denominations");
		}

	}

}
