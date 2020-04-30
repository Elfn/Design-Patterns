package controller;

/**
 * Created by Elimane on Apr, 2020, at 13:23
 */
public class Algeria implements IGR{


    @Override
    public float getIGR(float annualSalary) {
        return (annualSalary * 35 / 100);
    }
}
