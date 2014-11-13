package ProviderTest;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class Reading4MoneyTest {

	
		String a = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411502095&mid=0";
		String b = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411503208&mid=0";
		String c = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411503438&mid=0";
		String d = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411503438&mid=0";
		String e = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411503438&mid=0";
		String f = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411585472&mid=0";
		String g = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411587109&mid=0";
		String h = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1411587244&mid=0";
		String i = "http://www.reading4money.de/paidmail.php?username=lofoxx&id=1412197035&mid=0";
	
		String patternEmail = "(http://www.reading4money.de/paidmail.php\\?username=lofoxx&id=)(.*)(mid=0)";
		
	
	  @Test
		public void pattern_example1() {
			String regex = patternEmail;
			String test = (a);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}
	  
	  @Test
		public void pattern_example2() {
			String regex = patternEmail;
			String test = (b);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}
	  
	  @Test
		public void pattern_example3() {
			String regex = patternEmail;
			String test = (c);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}
	  
	  @Test
		public void pattern_example4() {
			String regex = patternEmail;
			String test = (d);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}
	  
	  @Test
		public void pattern_example5() {
			String regex = patternEmail;
			String test = (e);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}
	  
	  @Test
		public void pattern_example6() {
			String regex = patternEmail;
			String test = (f);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}
	  
	  @Test
		public void pattern_example7() {
			String regex = patternEmail;
			String test = (g);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}
	  
	  @Test
		public void pattern_example8() {
			String regex = patternEmail;
			String test = (h);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}

}
