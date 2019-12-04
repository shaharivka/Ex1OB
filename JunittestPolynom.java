package myMath;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


class JunittestPolynom {
	
	@Test

	 void addtest() { 

		Polynom z=new Polynom("3X^2+5X+6");
		Polynom p1=new Polynom("3X^2");
		Polynom p2=new Polynom("5X");		
		Polynom p3=new Polynom("6");

		p1.add(p2);
		p1.add(p3);
		if(!z.equals(p1))
			fail();

	}

	@Test
	 void testsubstract() {
		Polynom a= new Polynom("8.5X^8+2.22X");
		a.substract(a);
		if(!a.isZero())
			fail();

	}
	@Test

	 void multtest() {    
		Polynom p=new Polynom("3X^2+4X+2");
		Polynom a=new Polynom("2");
		p.multiply(a);
		Polynom p2=new Polynom("6X^2+8X+4");
		if(!p2.equals(p))
			fail();
	}

	@Test

	 void testderivative() {   
		Polynom p= new Polynom("2X^2+4X");
		Polynom p1= new Polynom("4X+4");

		p.derivative();
		if(!p.equals(p1))
			fail();

	}

	@Test

	 void testroot() {   
		Polynom p= new Polynom("2X^2+4X");
		p.derivative();
		double extreme =p.root(-2, 2, 0.00001);
		if(extreme!=-1)
			fail();

		Polynom p1= new Polynom("3X^3+12X^2");
		p1.derivative();
		double extreme2 =p1.root(-2, 2, 0.00001);
		if(extreme2!=0)
			fail();


	}


	@Test
	 void testarea() {  
		Polynom a=new Polynom("-X^2+3");
		double area1=a.area(-2,0, 0.0001);
		double area2=a.area(0, 2, 0.0001);
		if(area1-area2>0.0001)
			fail();

		Polynom b=new Polynom("-X^4+3X");
		double area11=b.area(-2,0, 0.0001);
		double area21=b.area(0, 2, 0.0001);
		if(area11-area21>0.0001)
			fail();


	}
//	@Test     //�� ����� ����� �� �� 
//
//	 void testcopy() {   
//		Polynom a= new Polynom("8.5X^8+2.22X");
//		Polynom c=new Polynom(a.copy().toString());
//		if(a.toString()==c.toString())		
//			fail();
//		
//
//
//	}
//	

}