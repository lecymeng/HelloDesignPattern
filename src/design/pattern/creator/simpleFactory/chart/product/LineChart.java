package design.pattern.creator.simpleFactory.chart.product;

/**
 * 折线图类
 */
public class LineChart implements Chart {
  public LineChart() {
    System.out.println("create LineChart");
  }

  @Override
  public void displayChart() {
    System.out.println("display LineChart");
  }
}
