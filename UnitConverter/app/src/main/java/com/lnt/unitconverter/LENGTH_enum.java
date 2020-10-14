package com.lnt.unitconverter;

public class LENGTH_enum {
    public enum Unit_2 {
        METER,
        CENTIMETER,
        FOOT,
        INCH,
        KILOMETER,
        MILE;

        // Helper method to convert text to one of the above constants
        public static LENGTH_enum.Unit_2 fromString(String text) {
            if (text != null) {
                for (LENGTH_enum.Unit_2 unit_2 : LENGTH_enum.Unit_2.values()) {
                    if (text.equalsIgnoreCase(unit_2.toString())) {
                        return unit_2;
                    }
                }
            }
            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }
    private final double multiplier;
    public LENGTH_enum(LENGTH_enum.Unit_2 from, LENGTH_enum.Unit_2 to) {
        double constant = 1;
        switch (from) {
            case INCH:
                if (to == LENGTH_enum.Unit_2.CENTIMETER) {
                    constant = 2.54;
                } else if (to == LENGTH_enum.Unit_2.FOOT) {
                    constant = 0.083333;
                } else if (to == LENGTH_enum.Unit_2.METER) {
                    constant = 0.0254;
                } else if (to == LENGTH_enum.Unit_2.MILE) {
                    constant = 1.5783e-5;
                } else if (to == LENGTH_enum.Unit_2.KILOMETER) {
                    constant = 2.54e-5;
                }
                break;
            case CENTIMETER:
                if (to == LENGTH_enum.Unit_2.INCH) {
                    constant = 0.393701;
                } else if (to == LENGTH_enum.Unit_2.FOOT) {
                    constant = 0.0328084;
                } else if (to == LENGTH_enum.Unit_2.METER) {
                    constant = 0.01;
                } else if (to == LENGTH_enum.Unit_2.MILE) {
                    constant = 6.2137e-6;
                } else if (to == LENGTH_enum.Unit_2.KILOMETER) {
                    constant = 1e-5;
                }
                break;
            case FOOT:
                if (to == LENGTH_enum.Unit_2.INCH) {
                    constant = 12;
                } else if (to == LENGTH_enum.Unit_2.CENTIMETER) {
                    constant = 30.48;
                } else if (to == LENGTH_enum.Unit_2.METER) {
                    constant = 0.3048;
                } else if (to == LENGTH_enum.Unit_2.MILE) {
                    constant = 0.000189394;
                } else if (to == LENGTH_enum.Unit_2.KILOMETER) {
                    constant = 0.0003048;
                }
                break;
            case METER:
                if (to == LENGTH_enum.Unit_2.INCH) {
                    constant = 39.3701;
                } else if (to == LENGTH_enum.Unit_2.CENTIMETER) {
                    constant = 100;
                } else if (to == LENGTH_enum.Unit_2.FOOT) {
                    constant = 3.28084;
                } else if (to == LENGTH_enum.Unit_2.MILE) {
                    constant = 0.000621371;
                } else if (to == LENGTH_enum.Unit_2.KILOMETER) {
                    constant = 0.001;
                }
                break;
            case MILE:
                if (to == LENGTH_enum.Unit_2.INCH) {
                    constant = 63360;
                } else if (to == LENGTH_enum.Unit_2.CENTIMETER) {
                    constant = 160934;
                } else if (to == LENGTH_enum.Unit_2.FOOT) {
                    constant = 5280;
                } else if (to == LENGTH_enum.Unit_2.METER) {
                    constant = 1609.34;
                } else if (to == LENGTH_enum.Unit_2.KILOMETER) {
                    constant = 1.60934;
                }
                break;
            case KILOMETER:
                if (to == LENGTH_enum.Unit_2.INCH) {
                    constant = 39370.1;
                } else if (to == LENGTH_enum.Unit_2.CENTIMETER) {
                    constant = 100000;
                } else if (to == LENGTH_enum.Unit_2.FOOT) {
                    constant = 3280.84;
                } else if (to == LENGTH_enum.Unit_2.METER) {
                    constant = 1000;
                } else if (to == LENGTH_enum.Unit_2.MILE) {
                    constant = 0.621371;
                }
                break;
        }
        multiplier = constant;
    }
    public double convert(double input) {
        return input * multiplier;
    }
}
