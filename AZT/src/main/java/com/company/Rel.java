package com.company;

/**
 * @author ED
 */
public class Rel {
    @AutoInjectable
    OneInterface oneInterface;
    @AutoInjectable
    TwoInterface twoInterface;

    public void test() {
        oneInterface.one();
        twoInterface.two();
    }
}
