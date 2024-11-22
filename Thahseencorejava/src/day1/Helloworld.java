package day1;

public class Helloworld {
public static void main(String[]args) {

	int fname=20;
	int sname=10;
	int addition=fname+sname;
	int sub=fname-sname;
	int multiplication=fname*sname;
	int division=fname/sname;
	int modulus=fname%sname;
	 int val = 10;
	 int val2 = 20;
	System.out.println("Arithmetic Operations:");
	System.out.println("Addition:"+addition);
	System.out.println("Subtraction:"+sub);
	System.out.println("Multiplication:"+multiplication);
	System.out.println("Division:"+division);
	System.out.println("Modulus:"+modulus);
	System.out.println();
	System.out.println("Relational Operations:");
	System.out.println("20>10 :"+(fname>sname));
	System.out.println("20<10 :"+(fname<sname));
	System.out.println("20>=10 :"+(fname>=sname));
	System.out.println("20<=10 :"+(fname<=sname));
	System.out.println("20==10 :"+(fname==sname));
	System.out.println("20!=10 :"+(fname!=sname));
	System.out.println();
	System.out.println("Logical Operations");
	System.out.println("AND:"+(fname>10 && sname<50));
	System.out.println("OR:"+(fname<5 || sname>100));
	System.out.println();
	System.out.println("Assignment Operations:");
	System.out.println("Initial value:"+val);
	System.out.println("After +=: "+(val+=5));
	System.out.println("After -=: "+(val-=5));
	System.out.println("After *=: "+(val*=5));
	System.out.println("After /=: "+(val/=5));
	System.out.println("After %=: "+(val%=5));
	System.out.println();
	System.out.println("Unary Operations:");
	System.out.println("Initial value:"+ val2);
	System.out.println("After increment:"+(++val2));
	System.out.println("After decrement:"+(--val2));
	System.out.println("After post increment:"+(val2++));
	System.out.println("After post decrement:"+(val2--));
	System.out.println();
	System.out.println("Conditional (Ternary) Operations:");
	if((fname%=2)==0) {
		System.out.println("is even");
	}else {
		System.out.println("is odd");
	}
}
}
