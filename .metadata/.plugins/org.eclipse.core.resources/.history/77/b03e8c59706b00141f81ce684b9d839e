package ProviderTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class ProvenceMailerTest {
	
		String a = "Ihr Bestaetigungslink: http://www.provencemailer.de/questionmail.php?username=lofoxx&id=1411511318";
		String b = "Ihr Bestätigungslink: http://www.provencemailer.de/paidmail.php?username=lofoxx&id=1411514101&stan=t9cihxy5nv";
		String c = "Ihr Bestätigungslink: http://www.provencemailer.de/lightmail.php?username=lofoxx&id=1411514176&stan=jno95avnr3";
		String d = "Ihr Bestätigungslink: http://www.provencemailer.de/lightmail.php?username=lofoxx&id=1411557301&stan=fwh0para9j";
		String e = "Ihr Bestätigungslink: http://www.provencemailer.de/lightmail.php?username=lofoxx&id=1411557372&stan=xp9863j8nk";
		String f = "Ihr Bestätigungslink: http://www.provencemailer.de/lightmail.php?username=lofoxx&id=1411557445&stan=wxxvsusqm9";
		String g = "Ihr Bestätigungslink: http://www.provencemailer.de/lightmail.php?username=lofoxx&id=1411563188&stan=uirqn3togd";
		String h = "Ihr Bestätigungslink: http://www.provencemailer.de/lightmail.php?username=lofoxx&id=1411563221&stan=s1wa05vl8j";
		String i = "Ihr Bestätigungslink: http://www.provencemailer.de/lightmail.php?username=lofoxx&id=1411563153&stan=ceooycsn30";
		String j = "Ihr Bestätigungslink: http://www.provencemailer.de/paidmail.php?username=lofoxx&id=1411563303&stan=v95kbnc9d9";
		String k = "Ihr Bestätigungslink: http://www.provencemailer.de/paidmail.php?username=lofoxx&id=1411578975&stan=jf29smsbg0";
		String l = "Ihr Bestaetigungslink: http://www.provencemailer.de/aktivmail.php?username=lofoxx&id=1411597434";
		String m = "Ihr Bestaetigungslink: http://www.provencemailer.de/aktivmail.php?username=lofoxx&id=1411597472";
		String n = "Ihr Bestaetigungslink: http://www.provencemailer.de/questionmail.php?username=lofoxx&id=1411597780";
		String o = "Ihr Bestätigungslink: http://www.provencemailer.de/paidmail.php?username=lofoxx&id=1411600501&stan=6dvm1oom9b";
		
		String patternEmail = "(Ihr)(\\s)(.*)(\\s)(http://www.provencemailer.de/)(.*)(.php\\?username=lofoxx&id=)(.*)";		
		
		
		@Test
		public void pattern_example3() {
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
		
		
	/**
		@Test
		public void patternClick() {
			Matcher m = Pattern.compile(patternEmail).matcher(input);
			assertTrue("Pattern does not match.", m.matches());
			assertEquals("Matcher does return wrong link.", linkOut, m.group(groupNum));
		}

		@Test
		public void pattern_example1() {
			String regex = patternEmail;
			String test = (b);
			assertTrue(Pattern.compile(regex).matcher(test).matches());
		}

		
		*/	
}
