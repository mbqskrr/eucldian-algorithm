package model;

public class Algortihm {
	
	private int num;
	private int num1;
	
	public Algortihm(int num, int num1) {
		this.num = num;
		this.num1 = num1;
	}
	
	public int mcd() {
		int euclid = 0;
		int greater;
		int minor;
		
		if (num>num1) {
			greater = num;
			minor = num1;
		} else {
			greater = num1;
			minor = num;
		}
		
		int r = greater%minor;
		int tempR = r;
		 
		while (r != 0) {
			if (r == 0) {
				break;
			} else {
				tempR = r;
				int temp = r;
				r = minor % r;
				minor = temp;
			}

		}		
		euclid = tempR;
		return euclid;
	}
	
	
}
