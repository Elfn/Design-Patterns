package model;

import interfaces.IceCream;

/**
 * Created by Elimane on Apr, 2020, at 19:48
 */
public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating basic Ice cream");
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
