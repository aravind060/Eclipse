package outsidepack1;

import mainpack.Myclass;

class C1 extends Myclass
{
	public void data()
	{
		System.out.println(d);
	}
}

public class Luminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass df=new Myclass();
		System.out.println(df.d);
		C1 d=new C1();
		d.data();

	}

}
