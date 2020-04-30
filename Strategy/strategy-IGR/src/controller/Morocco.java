package controller;

/**
 * Created by Elimane on Apr, 2020, at 13:23
 */
public class Morocco implements IGR {
    @Override
    public float getIGR(float annualSalary) {

        String tranche = (annualSalary <= 40_000) ? "TRANCHE 1" :
                (40_000 <= annualSalary && annualSalary <= 120_000) ? "TRANCHE 2" :
                        (120_000 <= annualSalary) ? "TRANCHE 3" :
                                "ERROR";

        switch (tranche) {

            case "TRANCHE 1":
                return (annualSalary * 5 / 100);

            case "TRANCHE 2":
                return (annualSalary * 20 / 100);

            case "TRANCHE 3":
                return (annualSalary * 42 / 100);

            default:
                return 0f;
        }

    }
}
