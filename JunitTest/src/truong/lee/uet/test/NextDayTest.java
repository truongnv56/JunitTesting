package truong.lee.uet.test;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import truong.lee.uet.NextDay;

public class NextDayTest {

	@Test
	public void testcase1() throws Exception{
		NextDay day1 = new NextDay(2, 3, 2000);
		int actual =  day1.checkNextDay();
		int expected = 1;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase2() throws Exception{
		NextDay day1 = new NextDay(31, 3, 2000);
		int actual =  day1.checkNextDay();
		int expected = 1;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase3() throws Exception{
		NextDay day1 = new NextDay(2, 4, 2000);
		int actual =  day1.checkNextDay();
		int expected = 2;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase4() throws Exception{
		NextDay day1 = new NextDay(30, 4, 2000);
		int actual =  day1.checkNextDay();
		int expected = 2;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase5() throws Exception{
		NextDay day1 = new NextDay(2, 12, 2000);
		int actual =  day1.checkNextDay();
		int expected = 3;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase6() throws Exception{
		NextDay day1 = new NextDay(31, 12, 2012);
		int actual =  day1.checkNextDay();
		int expected = 3;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase7() throws Exception{
		NextDay day1 = new NextDay(27, 2, 2000);
		int actual =  day1.checkNextDay();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase8() throws Exception{
		NextDay day1 = new NextDay(28, 2, 2000);
		int actual =  day1.checkNextDay();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase9() throws Exception{
		NextDay day1 = new NextDay(28, 2, 2001);
		int actual =  day1.checkNextDay();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}
	
	@Test
	public void testcase10() throws Exception{
		NextDay day1 = new NextDay(29, 2, 2000);
		int actual =  day1.checkNextDay();
		int expected = 4;
		Assert.assertEquals(expected,actual);
		
	}

	

}
