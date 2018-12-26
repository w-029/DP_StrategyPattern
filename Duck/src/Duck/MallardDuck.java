package Duck;

import Duck.Duck;
import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

/* Duck的具体子类之一，它必须完善Duck类的前两类灵活的方法：
 * 实现Duck的成员接口（指定一个实现接口的具体对象）；
 * 重写Duck的抽象方法 display()；
 * 同时，它还继承了Duck类统一的方法 swim() */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我是一只真正的鸭子：");
    }
}
