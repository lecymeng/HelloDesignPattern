package design.pattern.creator.simpleFactory.chart.product;

/**
 * 柱状图类
 */
public class HistogramChart implements Chart {
  public HistogramChart() {
    System.out.println("create HistogramChart");
  }

  @Override
  public void displayChart() {
    System.out.println("display HistogramChart");
  }
}
