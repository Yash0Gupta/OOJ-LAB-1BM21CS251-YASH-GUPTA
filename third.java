class BOX{
	double width,length,height;

	BOX(double w, double l, double h){
		width=w;
		length=l;
		height=h;
	}
	
	void volume(){
		System.out.println("The volume is: "+width*length*height);
	}
}

class third{
	public static void main(String args[]){
		BOX b1= new BOX(10.0,20.0,30.0);
		b1.volume();
	}
}	

