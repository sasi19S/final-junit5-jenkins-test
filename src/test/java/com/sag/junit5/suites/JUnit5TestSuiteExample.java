package com.sag.junit5.suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.sag.junit5.packageA"
				,"com.sag.junit5.packageB"})
@IncludeClassNamePatterns({"^.*ATests?$"})
@IncludeTags("production")
public class JUnit5TestSuiteExample {

}
