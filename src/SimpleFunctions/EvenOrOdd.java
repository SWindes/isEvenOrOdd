package SimpleFunctions;


public class EvenOrOdd {
	
	public EvenOrOdd() {
		
	}
	
	public boolean isEven(int n) {
		return n % 2==0;
	}
	
	public boolean isEven(float n) {
		return n % 2==0;
	}
	
	public boolean isEven(double n) {
		return n % 2==0;
	}
	
	public boolean isOdd(int n) {
		return !isEven(n);
	}
	
	public boolean isOdd(float n) {
		return !isEven(n);
	}
	
	public boolean isOdd(double n) {
		return !isEven(n);
	}

}
