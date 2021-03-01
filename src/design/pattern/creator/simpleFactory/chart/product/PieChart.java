package design.pattern.creator.simpleFactory.chart.product;

/**
 * 饼状图类
 */
public class PieChart implements Chart {
  public PieChart() {
    System.out.println("create PieChart");
  }

  @Override
  public void displayChart() {
    System.out.println("display PieChart");
  }
}
