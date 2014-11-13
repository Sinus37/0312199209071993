package ProviderTest;

import static org.junit.Assert.*;
import java.util.regex.Pattern;
import org.junit.Test;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;


public class BoniMailTest {

	String pattern = "(^\\s*)(http://www.bonimail.de/link/?)(.*)";
	
	String norm = "http://www.bonimail.de/link/?";
	
	String example1 = "http://www.bonimail.de/link/?5559542d962d9fa863c5da954d11df";
	String example2 = "http://www.bonimail.de/link/?4549542d962d67ee2707f05fdad9d8";
	
	
	@Test
	public void pattern_example1() {
		String regex = pattern;
		String test = (example1);
		assertTrue(Pattern.compile(regex).matcher(test).matches());
	}
	
	@Test
	public void pattern_example2() {
		String regex = pattern;
		String test = (example2);
		assertTrue(Pattern.compile(regex).matcher(test).matches());
	}

}
