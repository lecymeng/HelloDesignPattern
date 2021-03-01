package design.pattern.creator.simpleFactory.chart.factory;

import design.pattern.creator.simpleFactory.chart.product.Chart;
import design.pattern.creator.simpleFactory.chart.product.HistogramChart;
import design.pattern.creator.simpleFactory.chart.product.LineChart;
import design.pattern.creator.simpleFactory.chart.product.PieChart;

/**
 * 图表工厂类：工厂类
 */
public class ChartFactory {
  //静态工厂方法
  public static Chart getChart(String chartType) {
    Chart chart = null;
    switch (chartType) {
      case "Histogram":
        chart = new HistogramChart();
        break;
      case "Pie":
        chart = new PieChart();
        break;
      case "Line":
        chart = new LineChart();
        break;
      default:
        break;
    }

    return chart;
  }
}
