package myMath;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JunitestMonom {

	@Test

	void test1() {
		System.out.println("*****  Test1:  *****");
		String[] monoms = { "2","-x","-3.2x^2","0"};
		for(int i=0;i<monoms.length;i++) {
			Monom m = new Monom(monoms[i]);
			String s = m.toString();
			m = new Monom(s);
			double fx = m.f(i);
			System.out.println(i+") "+m +"    \tisZero: "+m.isZero()+"\t f("+i+") = "+fx);
		}
		//fail("Not yet implemented");
	}
	@Test
	void test2() {
		System.out.println("*****  Test2:  *****");
		ArrayList<Monom> monoms = new ArrayList<Monom>();
		monoms.add(new Monom(0,5));
		monoms.add(new Monom(-1,0));
		monoms.add(new Monom(-1.3,1));
		monoms.add(new Monom(-2.2,2));

		for(int i=0;i<monoms.size();i++) {
			Monom m = new Monom(monoms.get(i));
			String s = m.toString();
			Monom m1 = new Monom(s);
			boolean e = m.equals(m1);
			System.out.println(i+") "+m +"    \tisZero: "+m.isZero()+"  \teq: "+e);
		}
	}

	@Test
	void testadd() {   //+ 

		Monom w=new Monom(4,3);
		Monom z=new Monom(2,3);
		z.add(z);
		if(!z.equals(w))
			fail();

	}

	@Test
	void testmultipy() {   //+ 

		Monom w=new Monom(4.2,3);
		Monom z=new Monom(4.2,3);
		Monom c=new Monom("2");
		z.multipy(c);
		w.add(w);
		if(!z.equals(w))
			fail();

	}
	@Test
	void testderuvative() {   //+ 

		Monom a=new Monom(4.2,3);
		Monom b=new Monom ("4.2x^3");
		a.derivative();
		b.derivative();
		if(!a.equals(b))
			fail();

	}
	@Test
	void testequal() {   //+ 

		Monom a=new Monom(-18,6);
		Monom b=new Monom ("-18x^6");

		if(!a.equals(b))
			fail();

	}
	@Test      

	void testinitfromstring() {   
		Monom a= new Monom(2,5);
		function f=new Monom(2,5);
		f=a.initFromString("2x^2");
		Monom x=new Monom("2x^2");
		if(f.equals(x)==false)
			fail();

	}
	@Test
	void testequalObject() {    

		Monom a=new Monom(-18,6);
		Object b=new Monom ("-18x^6");

		if(!a.equals(b))
			fail();

	}


}


