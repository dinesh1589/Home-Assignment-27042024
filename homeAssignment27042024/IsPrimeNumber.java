package homeAssignment27042024;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int n=29;int x=0;
		for(int i=2;i<=n-1;i++) {			
			if(n%i==0) {
				x=1;break;			
		    }
		
	    }
		if(x==0) {
			System.out.println("n is a prime number");
		}
		else {
			System.out.println("n is not a prime number");
		}
  }
}
