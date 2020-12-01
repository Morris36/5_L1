package com.company;

import java.io.IOException;

/**
 * @author ED
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        addProperties addProperties = new addProperties();
        addProperties.newProperties("interface com.company.OneInterface", "com.company.One");
        addProperties.newProperties("interface com.company.TwoInterface", "com.company.Two");
        addProperties.saveProperties();
        Rel rel = (new Injector()).inject(new Rel());
        rel.test();
        addProperties.delProperties("interface com.company.TwoInterface");
        addProperties.newProperties("interface com.company.TwoInterface", "com.company.Fri");
        addProperties.saveProperties();
        Rel rel1 = (new Injector()).inject(new Rel());
        rel1.test();
    }
}
