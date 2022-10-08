package comparativeCode;

//singleton class is a class in which we can not create two objects
//even if we will try then it will return the same the same reference of theses objects
//Singleton class means it can have only one object.

//Critical section is a section of code that multiple(two) threads trying to use at same time and that may lost data consistency.

//We can make a class a s thread safe by defining synchronized in method level or by using double check of critical section.

class SingleTon{
	public volatile static SingleTon instance;
	
	private SingleTon() {
		
	}
	
//	public static synchronized SingleTon getSingleTonObject() {
//		
//		if(instance==null) {
//			instance=new SingleTon();// critical section
//		}
//		return instance;
//	}
	
	
	public static SingleTon getSingleTonObject() {
		
		if(instance==null) {
			synchronized (SingleTon.class) {
				if(instance==null) {
					instance=new SingleTon(); //double check point
				}
			}
			
		}
		return instance;
	}
}


public class SingletonDriver {
	public static void main(String[] args) {
		SingleTon obj1=SingleTon.getSingleTonObject();
		SingleTon obj2=SingleTon.getSingleTonObject();
		
		
		if(obj1==obj2) {
			System.out.println("same reference of two object");
		}else {
			System.out.println("reference is different");
		}
		
	}
}
