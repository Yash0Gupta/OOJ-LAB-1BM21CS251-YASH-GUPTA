class box{
	double width,length,height;

	box(){
		System.out.println("Successfully created a box :)");
	}

	void set_dim(double w, double l, double h){
		width=w;
		length=l;
		height=h;
	}
	
	void volume(){
		System.out.println("The volume is: "+width*length*height);
	}
}

class second{
	public static void main(String args[]){
		box b1= new box();
		b1.set_dim(10.0,20.0,30.0);
		b1.volume();
		box b2= new box();
		b2.set_dim(5.0,10.0,100.0);
		b2.volume();
	}
}				