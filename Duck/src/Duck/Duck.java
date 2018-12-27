package Duck;

import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

/* OO(Object Oriented)的三大特性：
 * 复用、可扩充、可维护 */

/* OO的4大基础：
 * 抽象、封装、多态、继承 */

/* OO策略模式——定义了算法族，分别封装起来，让它们之间可以互相替换，
 * 策略模式让算法的变化独立于使用算法的客户（详见抽象类Duck及其两个成员接口）。 */

/* OO设计原则1——找出应用中可能需要变化之处，把它们独立出来，
 * 不要将那些变化的和不需要变化的代码混在一起（详见Duck的三大类方法）。
 * 抽象的Duck类，其方法分为三类（符合设计原则1）：
 * 具体子类实现的、接口定义的、子类都统一继承的 */
public abstract class Duck {

    /* OO设计原则2——针对接口编程，不针对实现编程
    （详见对Duck的使用及Duck的两个成员接口）。 */

    /* OO设计原则3——多用组合，少用继承
     *（详见Duck两个成员接口的组合使用）。
     * FlyBehavior接口有三种实现类， QuackBehavior接口有三种实现类，
     * 两者组合可以实现 3 X 3 = 9 种不同的Duck行为，这比9个Duck的子类好管理得多*/
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
