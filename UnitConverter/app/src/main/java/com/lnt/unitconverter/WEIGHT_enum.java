package com.lnt.unitconverter;

public class WEIGHT_enum {
    public enum Unit_3 {
        KILOGRAM,
        GRAMS,
        MILLIGRAMS,
        OUNCE,
        POUND;

        public static Unit_3 fromString(String text) {
            if (text != null) {
                for (Unit_3 unit_3 : Unit_3.values()) {
                    if (text.equalsIgnoreCase(unit_3.toString())) {
                        return unit_3;
                    }
                }
            }
            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }
    private final double multiplier;
    public WEIGHT_enum(Unit_3 from, Unit_3 to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case KILOGRAM:
                if (to == WEIGHT_enum.Unit_3.GRAMS) {
                    constant = 1000.0;
                } else if (to == WEIGHT_enum.Unit_3.OUNCE) {
                    constant = 35.274;
                } else if (to == WEIGHT_enum.Unit_3.POUND) {
                    constant = 2.205;
                } else if (to == WEIGHT_enum.Unit_3.MILLIGRAMS) {
                    constant = 1e+6;
                }
                break;
            case GRAMS:
                if (to == WEIGHT_enum.Unit_3.KILOGRAM) {
                    constant = 0.001;
                } else if (to == WEIGHT_enum.Unit_3.OUNCE) {
                    constant = 0.03527;
                } else if (to == WEIGHT_enum.Unit_3.POUND) {
                    constant = 0.00220462;
                } else if (to == WEIGHT_enum.Unit_3.MILLIGRAMS) {
                    constant = 1000;
                }
                break;
            case MILLIGRAMS:
                if (to == WEIGHT_enum.Unit_3.KILOGRAM) {
                    constant = 1e-6;
                } else if (to == WEIGHT_enum.Unit_3.GRAMS) {
                    constant = 0.001;
                } else if (to == WEIGHT_enum.Unit_3.OUNCE) {
                    constant = 3.5274e-5;
                } else if (to == WEIGHT_enum.Unit_3.POUND) {
                    constant = 2.2046e-6;
                }
                break;
            case OUNCE:
                if (to == WEIGHT_enum.Unit_3.KILOGRAM) {
                    constant = 0.0283495;
                } else if (to == WEIGHT_enum.Unit_3.GRAMS) {
                    constant = 28.3495;
                } else if (to == WEIGHT_enum.Unit_3.MILLIGRAMS) {
                    constant = 28349.5;
                } else if (to == WEIGHT_enum.Unit_3.POUND) {
                    constant = 0.0625;
                }
                break;
            case POUND:
                if (to == WEIGHT_enum.Unit_3.KILOGRAM) {
                    constant = 0.453592;
                } else if (to == WEIGHT_enum.Unit_3.GRAMS) {
                    constant = 453.592;
                } else if (to == WEIGHT_enum.Unit_3.MILLIGRAMS) {
                    constant = 453592;
                } else if (to == WEIGHT_enum.Unit_3.OUNCE) {
                    constant = 16;
                }
                break;
        }
        multiplier = constant;
    }
    public double convert(double input) {
        return input * multiplier;
    }
}
