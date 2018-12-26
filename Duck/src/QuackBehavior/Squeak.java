package QuackBehavior;

import QuackBehavior.QuackBehavior;

/* 接口的实现类之一，通过重写接口的方法来提供方法的具体实现
 * 这个类为接口的行为提供了一种具体的可能，以供需要者使用 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫！");
    }
}
