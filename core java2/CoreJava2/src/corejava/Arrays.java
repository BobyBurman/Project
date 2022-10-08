package corejava;



public class Arrays {
	 

	public static void main(String arr[]) {
		 
		 int a[]= {1,2,3,4};
		 
		 int l=a.length;
		 int j=0;
		 int b[]=new int [l];
		 for(int i=(l-1);i>=0;i--) {
			 if(j>=0&&j<l) {
				 b[j]=a[i];
				 j++;
			 }else {
				 break;
			 }
		 }
		 
		 for(int i:b) {
			 System.out.print(i);
		 }
		 
		 System.out.println("");
		 //another swap
		 int temp=0;
		 int k=a.length-1;
		 for(int i=0;i<(a.length-1)/2;i++) {
			 temp=a[i];
			 a[i]=a[k];
			 a[k]=temp;
			 k--;
		 }
		 for(int i:a) {
			 System.out.print(i);
		 }
		
	
	 }
}
