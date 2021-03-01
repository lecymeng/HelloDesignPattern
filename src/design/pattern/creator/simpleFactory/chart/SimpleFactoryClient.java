package design.pattern.creator.simpleFactory.chart;

import design.pattern.creator.simpleFactory.chart.factory.ChartFactory;
import design.pattern.creator.simpleFactory.chart.product.Chart;

public class SimpleFactoryClient {
  public static void main(String[] args) {
    Chart histogramChart = ChartFactory.getChart("Histogram");
    Chart pieChart = ChartFactory.getChart("Pie");
    Chart lineChart = ChartFactory.getChart("Line");

    System.out.println("\n");

    histogramChart.displayChart();
    pieChart.displayChart();
    lineChart.displayChart();
  }
}
