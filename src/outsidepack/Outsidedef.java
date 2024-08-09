package outsidepack;

import mainpack.Maindef;

class B1 extends Maindef
{
	public void print() {
		System.out.println(c);
	}
}

public class Outsidedef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maindef cd=new Maindef();
		System.out.println(cd.c);
		B1 o=new B1();
		o.print();

	}

}
