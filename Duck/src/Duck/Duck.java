package Duck;

import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

/* Duck：找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起——设计原则1
 * 抽象的Duck类，其方法分为三类（根据设计原则1）：
 * 具体子类实现的、接口定义的、子类都统一继承的 */
public abstract class Duck {

    /* Duck的成员接口: 针对接口编程，而不是针对实现编程——设计原则2 */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() { }

    /* 这一类方法是由Duck的子类来具体实现的、个性化的行为 */
    public abstract void display();

    /* 这一类方法是由Duck的成员接口统一定义好了的，Duck类只针对其接口编程 */
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    /* 由Duck的具体子类来指定Duck成员接口的具体实现 */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /* 这一类方法是Duck的所有子类都有的、统一的行为 */
    public void swim() {
        System.out.println("我在游泳！");
    }
}
