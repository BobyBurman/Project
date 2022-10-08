package comparativeCode;

public class Searching {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int key=40;
		int first=0;
		int last=(arr.length-1);
		
		SerachingImpl imp=new SerachingImpl();
		
		imp.binarySerach(key, arr, first, last);
		imp.linearSearch(key,arr,first,last);
		
		

	}

}

class SerachingImpl{
	
	public void binarySerach(int key,int arr[],int first, int last) {
		
		while(first<=last) {
			
			int mid=(first+last) / 2;
			
			if(arr[mid]<key) {
				first=mid+1;
			}else if(arr[mid]==key) {
				System.out.println("Index of the key :"+mid);
				break;
			}else {
				last=mid-1;
			}
		}
		if(first>last) {
			System.out.println("Element not found");
		}
	}

	public void linearSearch(int key, int[] arr, int first, int last) {
		
		for(int i=first;i<=last;i++) {
			if(arr[i]==key) {
				System.out.println("Index of the key :"+i);
				first++;
			}
		}
		if(first==0) {
			System.out.println("Element not found");
		}
		
	}
}