package com.lnt.unitconverter;

import static com.lnt.unitconverter.TEMP_enum.Unit_1.FAHRENHEIT;
import static com.lnt.unitconverter.TEMP_enum.Unit_1.KELVIN;

public class TEMP_enum {

    public enum Unit_1 {
        CELSIUS,
        FAHRENHEIT,
        KELVIN;

        public static Unit_1 fromString(String text) {
            if (text != null) {
                for (Unit_1 unit_1: Unit_1.values()) {
                    if (text.equalsIgnoreCase(unit_1.toString())) {
                        return unit_1;
                    }
                }
            }
            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;
    public TEMP_enum(Unit_1 fromUnit, Unit_1 toUnit, double input) {
        double constant = 1;
        switch (fromUnit) {
            case CELSIUS:
                if (toUnit == FAHRENHEIT) {
                    constant = (1.8*input)+32;
                } else if (toUnit == KELVIN) {
                    constant = input+273.15;
                }
                break;
            case FAHRENHEIT:
                if (toUnit == Unit_1.CELSIUS) {
                    constant = (input-32)*(5/9);
                } else if (toUnit == KELVIN) {
                    constant = ((input-32)*(5/9))+273.15;
                }
                break;
            case KELVIN:
                if (toUnit == FAHRENHEIT) {
                    constant = ((input-273.15)*1.8)+32;
                } else if (toUnit == KELVIN) {
                    constant = input-273.15;
                }
                break;
        }
        multiplier = constant;
    }

    public double convert(double input) {
        return multiplier;
    }
}
