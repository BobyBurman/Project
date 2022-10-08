package comparativeCode;

public class Sorting {
	public static void main(String arr[]) {
		int a[]= {5, 1, 4, 2, 8};
		int l=a.length;
		
		System.out.println("{5, 1, 4, 2, 8}");
		
		
		//bubbleSort(a,l);
		//selectionSort(a,l);
		//generalSort(a,l);
		
		
	}
	
	
	//Selection Sort Algorithm
	private static void selectionSort(int[] a, int l) {
		 
		for(int i=0; i<l-1;i++) {
			int min_index=i;
			for(int j=i+1;j<l;j++) {
				if(a[min_index]>a[j]) {
					min_index=j;
				}
			}
			int temp=a[min_index];
			a[min_index]=a[i];
			a[i]=temp;
			
			for(int k:a) {
				System.out.print(k+" ");
			}
			System.out.println();
			
		}

		
	}



	//Bubble Sort Algorithm
	public static void bubbleSort(int a[],int l) {
		int temp=0;
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				for(int k:a) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	
	public static void generalSort(int a[],int l) {
		int temp=0;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				for(int k:a) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
	

}
