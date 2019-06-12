package basics;

public class ThisKeyword {

	int a;
	int b;
	
	public void setData (int c, int d) {
		a = c;
		b = d;
	}
	
	public void showData () {
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
	}
	
	public static void main(String[] args) {
		ThisKeyword kw1 = new ThisKeyword();
		kw1.setData(5, 10);
				
		ThisKeyword kw2 = new ThisKeyword();
		kw2.setData(1, 2);
		
		kw2.showData();
		kw1.showData();
	}

}
