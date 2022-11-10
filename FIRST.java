class SI{
	double principle;
	double rate;
	double time;
	
	void setprop(double p, double r, double t){
	principle=p;
	rate=r;
	time=t;
	}
	
	void calc(){
	System.out.println("simple interest is: "+principle*rate*time/100.0);
	
	}

}

class FIRST{
	public static void main(String args[]){
		SI s1=new SI();
		s1.setprop(10000.0,0.5,10.0);
		s1.calc();
	}
}
	

	