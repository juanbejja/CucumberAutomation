package runner;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import util.LogHelper;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/java/features", glue = { "seleniumgluecode" }, plugin = {
		"json:test/report/cucumber_report.json" }, snippets = SnippetType.CAMELCASE, tags = { "@ejecutar" })

public class TestRunner {
	
 private static final Logger LOGGER = LogHelper.getLogger();
	
	
	@AfterClass
	public static void finish() {
		try {
			LOGGER.log(Level.INFO,"Generando reporte....");
			String[] cmd = { "cmd.exe", "/c", "npm run report" };
			Runtime.getRuntime().exec(cmd);
			LOGGER.log(Level.INFO,"Reporte generado satisfactoriamente");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
