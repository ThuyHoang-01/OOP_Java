package week1;

import java.util.Scanner;

public class Bai9 {
/*Viết chương trình Java nhập một mảng số nguyên a0, a1, a2, …, an-1. Hãy sắp xếp mảng 
theo thứ tự tăng dần, sau đó chèn phần tử k vào mà vẫn đảm bảo mảng là tăng dần.*/
	 public static Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	        System.out.print("Nhập số phần tử của mảng: ");
	        int n = scanner.nextInt();
	        // khởi tạo arr
	        int [] arr = new int [n];
	        System.out.print("Nhập các phần tử của mảng: \n");
	        for (int i = 0; i < n; i++) {
	            System.out.printf("a[%d] = ", i);
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Nhập phần tử k = ");
	        int k = scanner.nextInt();
	        sortASC(arr);
	        System.out.println("Dãy số được sắp xếp tăng dần: ");
	        show(arr);
	        System.out.printf("\nChèn phần tử %d vào mảng.", k);
	        arr = insert(arr, k);
	        System.out.print("\nMảng sau khi chèn: ");
	        show(arr);
	    }
	    public static int [] insert(int [] arr, int k) {
	        int arrIndex = arr.length - 1;
	        int tempIndex = arr.length;
	        int [] tempArr = new int [tempIndex + 1];
	        boolean inserted = false;
	         
	        for (int i = tempIndex; i >= 0; i--) {
	            if (arrIndex > -1 && arr[arrIndex] > k) {
	                tempArr[i] = arr[arrIndex--];
	            } else {
	                if (!inserted) {
	                    tempArr[i] = k;
	                    inserted = true;
	                } else {
	                    tempArr[i] = arr[arrIndex--];
	                }
	            }
	        }
	        return tempArr;
	    }
	    public static void sortASC(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	    }
	     
	    public static void show(int [] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	    
	    
}
