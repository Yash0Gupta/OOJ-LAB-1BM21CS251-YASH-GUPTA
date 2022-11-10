class employee{
String name;
int age;

employee(String s1, int n){
name=s1;
age=n;
}

void display(){
System.out.println("NAME: "+name+"\nAGE: "+age);
}

void compareAge(employee e2){
		if(this.age>e2.age){
			System.out.println("The elder employee is: "+this.name);
		}
		else{
			System.out.println("The elder employee is: "+e2.name);
		}
	}
}

class fourth{
	public static void main(String args[]){
		employee e1=new employee("yash",19);
		employee e2=new employee("zayd",20);
		e1.display();
		e2.display();
		e2.compareAge(e1);
	}
}
