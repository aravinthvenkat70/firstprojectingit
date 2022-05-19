package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public  class ReportGenerator {
public static void ReportGenerator(String json) {
	File file = new File("C:\\Users\\lenovo\\eclipse-workspace\\sample1\\target");
	Configuration configuration= new Configuration(file, "aravinth");
	configuration.addClassifications("browser", "google");
	configuration.addClassifications("sprint", "10");
	
	List<String> list = new ArrayList<String>();
	list.add(json);
	ReportBuilder builder = new ReportBuilder(list, configuration);
	builder.generateReports();
}
}
