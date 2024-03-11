package TestCasePackage;

import org.testng.annotations.Test;

public class TestCaseFiles  extends BaseClassFiles{
@Test
public void openurl() {
	driver.get(url);
	log2.info("hi buddy");
}
}
