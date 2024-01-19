
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp,r,rev=0;
		temp=n;
		while(n!=0) {
			r = n % 10;
			rev = rev + (r*r*r);
			n = n / 10;
		}
		System.out.println(rev);
		if (rev==temp) {
			System.out.println("Amrstrong");
		}else {
			System.out.println(" Not Amrstrong");
		}
	}

}
