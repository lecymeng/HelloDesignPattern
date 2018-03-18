package design.pattern.structure.decorator;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 抽象装饰者
 */
public abstract class Decorator extends Component {
    private Component mComponent;

    public Decorator(Component component) {
        mComponent = component;
    }

    @Override
    public void operator() {
        mComponent.operator();
    }
}
