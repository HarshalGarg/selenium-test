package com.iiitb;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
//import org.junit.Test;

public class MainClass {
	SortingTestClasses srt=new SortingTestClasses();
	@Test
	public void checkTest(){
		String message="Hello";
		assertEquals(message,"Hello");
	}
	@Test
	public void testCheck1(){
		int expected[]={3,5,7,15,92};
		int given[]={15,3,7,92,5};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}
	@Test
	public void testCheck2(){
		int expected[]={10,20,30,40,50};
		int given[]={20,40,30,50,10};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}@Test
	public void testCheck3(){
		int expected[]={2,11,15,27,92};
		int given[]={92,15,27,11,2};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}@Test
	public void testCheck4(){
		int expected[]={53,58,60,87,126};
		int given[]={87,58,126,60,53};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}
	@Test
	public void testCheck5(){
		int expected[]={110,120,130,140,150};
		int given[]={120,140,130,150,110};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}@Test
	public void testCheck6(){
		int expected[]={103,203,303,403,503};
		int given[]={203,403,303,503,103};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}@Test
	public void testCheck7(){
		int expected[]={170,270,370,470,580};
		int given[]={270,470,370,580,170};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}@Test
	public void testCheck8(){
		int expected[]={11,134,256,344,597};
		int given[]={256,11,597,134,344};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}
	@Test
	public void testCheck9(){
		int expected[]={10,20,30,40,50};
		int given[]={256,11,597,134,344};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}
	@Test
	public void testCheck10(){
		int expected[]={11,134,256,34,57};
		int given[]={256,11,597,134,344};
		//assertEquals(expected,sort.bubblesort(given));
		Assert.assertArrayEquals(expected,srt.bubblesort(given));
	}
}
