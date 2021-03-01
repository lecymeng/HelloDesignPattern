package design.pattern.creator.simpleFactory.chart;

import design.pattern.creator.simpleFactory.chart.product.Chart;
import design.pattern.creator.simpleFactory.chart.product.HistogramChart;
import design.pattern.creator.simpleFactory.chart.product.LineChart;
import design.pattern.creator.simpleFactory.chart.product.PieChart;

/**
 * old impl
 */
public class OldChart {
  private String mType; //图表类型
  private Chart mChart;

  public OldChart(Object[][] data, String type) {

    this.mType = type;
    if (type.equalsIgnoreCase("Histogram")) {
      //初始化柱状图
      mChart = new HistogramChart();
    } else if (type.equalsIgnoreCase("Pie")) {
      //初始化饼状图
      mChart = new PieChart();
    } else if (type.equalsIgnoreCase("Line")) {
      //初始化折线图
      mChart = new LineChart();
    }
  }

  public void display() {

    //        if (this.mType.equalsIgnoreCase("histogram")) {
    //            //显示柱状图
    //
    //        } else if (this.mType.equalsIgnoreCase("pie")) {
    //            //显示饼状图
    //        } else if (this.mType.equalsIgnoreCase("line")) {
    //
    //            //显示折线图
    //        }

    mChart.displayChart();
  }
}
