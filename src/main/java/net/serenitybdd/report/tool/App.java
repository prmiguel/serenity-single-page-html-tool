package net.serenitybdd.report.tool;

import net.thucydides.core.reports.ExtendedReport;
import net.thucydides.core.reports.ExtendedReports;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    String sourceDirectory = args[0];
    String outputDirectory = args[1];
    List<String> reporterNames = new ArrayList<>();
    reporterNames.add("single-page-html");
    List<ExtendedReport> reporters = ExtendedReports.named(reporterNames);
    ExtendedReport reporter = reporters.stream().findFirst().get();
    reporter.setSourceDirectory(Path.of(sourceDirectory));
    reporter.setOutputDirectory(Path.of(outputDirectory));
    reporter.generateReport();
  }
}
