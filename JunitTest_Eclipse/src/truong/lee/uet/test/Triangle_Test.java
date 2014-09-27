package truong.lee.uet.test;

import org.junit.Assert;
import org.junit.Test;

import truong.lee.uet.Triangle;

public class Triangle_Test {
	
	@Test
	public void testcase1() throws Exception {
		Triangle t = new Triangle(4, 1, 2);
		int expected = -1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

	@Test
	public void testcase2() throws Exception {
		Triangle t = new Triangle(1, 4, 2);
		int expected = -1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

	@Test
	public void testcase3() throws Exception {
		Triangle t = new Triangle(1, 2, 4);
		int expected = -1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

	@Test
	public void testcase4() throws Exception {
		Triangle t = new Triangle(5, 5, 5);
		int expected = 2;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

	@Test
	public void testcase5() throws Exception {
		Triangle t = new Triangle(2, 2, 3);
		int expected = 1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

	@Test
	public void testcase6() throws Exception {
		Triangle t = new Triangle(2, 3, 2);
		int expected = 1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

	@Test
	public void testcase7() throws Exception {
		Triangle t = new Triangle(3, 2, 2);
		int expected = 1;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

	@Test
	public void testcase8() throws Exception {
		Triangle t = new Triangle(3, 4, 5);
		int expected = 0;
		int actual = t.CheckTriangle();
		Assert.assertEquals(expected, actual);
		System.out.println(t.Print());
	}

}
