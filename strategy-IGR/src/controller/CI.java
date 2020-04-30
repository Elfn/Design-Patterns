package controller;

/**
 * Created by Elimane on Apr, 2020, at 13:23
 */
public class CI implements IGR{
    @Override
    public float getIGR(float annualSalary) {

        String tranche = (1000 <= annualSalary && annualSalary <= 2_200_000) ? "TRANCHE 1" :
                         (2_200_001 <= annualSalary && annualSalary <= 3_600_000) ? "TRANCHE 2" :
                         (3_600_001 <= annualSalary && annualSalary <= 5_200_000) ? "TRANCHE 3" :
                         (5_200_001 <= annualSalary && annualSalary <= 7_200_000) ? "TRANCHE 4" :
                         (7_200_001 <= annualSalary && annualSalary <= 9_600_000) ? "TRANCHE 5" :
                         (9_600_001 <= annualSalary && annualSalary <= 12_600_000) ? "TRANCHE 6" :
                         (12_600_001 <= annualSalary && annualSalary <= 20_000_000) ? "TRANCHE 7" :
                         (20_000_001 <= annualSalary && annualSalary <= 30_000_000) ? "TRANCHE 8" :
                         (30_000_001 <= annualSalary && annualSalary <= 40_000_000) ? "TRANCHE 9" :
                         (40_000_001 <= annualSalary && annualSalary <= 50_000_000) ? "TRANCHE 10" :
                         (50_000_000 < annualSalary ) ? "TRANCHE 11" :
                         "ERROR!";

        switch(tranche) {

            case "TRANCHE 1":
                return annualSalary * 2/100;

            case "TRANCHE 2":
                return annualSalary *  10 / 100;

            case "TRANCHE 3":
                return annualSalary * 15/100;

            case "TRANCHE 4":
                return annualSalary *20/100;

            case "TRANCHE 5":
                return annualSalary * 24/100;

            case "TRANCHE 6":
                return annualSalary * 26/100;

            case "TRANCHE 7":
                return annualSalary * 29/100;

            case "TRANCHE 8":
                return annualSalary * 32/100;

            case "TRANCHE 9":
                return annualSalary * 34/100;

            case "TRANCHE 10":
                return annualSalary * 35/100;

            case "TRANCHE 11":
                return annualSalary * 36/100;

            default:
                return 0f;
        }

    }
}
