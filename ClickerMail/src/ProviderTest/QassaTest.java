package ProviderTest;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class QassaTest {

	String a = "http://www.qassa.de/am.php?h=8e0538dc2d00cb4abf4ffd2f611e6f82&c=k7741b033&d=4425103030e14";
	String b = "http://www.qassa.de/am.php?h=8773fc04638a5a2f589d863c250a5550&c=k8541b033&d=442510823efc0";
	String c = "http://www.qassa.de/am.php?h=b3deaab808863a2b68fc3f3480d95d49&c=k8741b033&d=44251079995de";
	
	String patternEmail = "(http://www.reading4money.de/paidmail.php\\?username=lofoxx&id=)(.*)(mid=0)";
	
	
	  @Test
		public void pattern_example1() {
			String regex = patternEmail;
			String test = (a);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
	  }
	
}
