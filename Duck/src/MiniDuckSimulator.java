import Duck.Duck;
import Duck.MallardDuck;
import Duck.ModelDuck;
import FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        /* “针对接口编程”的真正含义：
         * “针对超类型(Duck)”编程 */
        Duck mallard = new MallardDuck();
        mallard.display();      //Duck的抽象方法，必须由子类具体实现
        mallard.performQuack(); //Duck的接口方法，由Duck的子类来指定接口的具体实现对象
        mallard.performFly();   //接口的具体实现对象在Duck的子类构造函数中指定
        mallard.swim();         //Duck的统一方法，每个子类都需继承
        System.out.println();

        /* 所有的方法调用都是通过“超类”Duck进行的，
         * 但Duck的方法又是有其具体的子类(new ModelDuck())来实现的 */
        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.swim();
        System.out.println();
    }
}
