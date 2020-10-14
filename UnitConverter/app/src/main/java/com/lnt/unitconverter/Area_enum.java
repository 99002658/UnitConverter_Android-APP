package com.lnt.unitconverter;

public class Area_enum {
    public enum Unit {
        SQUARE_METERS,
        SQUARE_CENTIMETERS,
        SQUARE_FEET,
        SQUARE_INCHES,
        SQUARE_KILOMETERS,
        SQUARE_MILES;

        // Helper method to convert text to one of the above constants
        public static Unit fromString(String text) {
            if (text != null) {
                for (Unit unit : Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }
    private final double multiplier;
    public Area_enum(Unit from, Unit to) {
        double constant = 1;
        switch (from) {
            case SQUARE_INCHES:
                if (to == Unit.SQUARE_CENTIMETERS) {
                    constant = 6.4516;
                } else if (to == Unit.SQUARE_FEET) {
                    constant = 0.00694444;
                } else if (to == Unit.SQUARE_METERS) {
                    constant = 0.00064516;
                } else if (to == Unit.SQUARE_MILES) {
                    constant = 2.491e-10;
                } else if (to == Unit.SQUARE_KILOMETERS) {
                    constant = 6.4516e-10;
                }
                break;
            case SQUARE_CENTIMETERS:
                if (to == Unit.SQUARE_INCHES) {
                    constant = 0.155;
                } else if (to == Unit.SQUARE_FEET) {
                    constant = 0.00107639;
                } else if (to == Unit.SQUARE_METERS) {
                    constant = 1e-4;
                } else if (to == Unit.SQUARE_MILES) {
                    constant = 3.861e-11;
                } else if (to == Unit.SQUARE_KILOMETERS) {
                    constant = 1e-10;
                }
                break;
            case SQUARE_FEET:
                if (to == Unit.SQUARE_INCHES) {
                    constant = 144;
                } else if (to == Unit.SQUARE_CENTIMETERS) {
                    constant = 929.03;
                } else if (to == Unit.SQUARE_METERS) {
                    constant = 0.092903;
                } else if (to == Unit.SQUARE_MILES) {
                    constant = 3.587e-8;
                } else if (to == Unit.SQUARE_KILOMETERS) {
                    constant = 9.2903e-8;
                }
                break;
            case SQUARE_METERS:
                if (to == Unit.SQUARE_INCHES) {
                    constant = 1550;
                } else if (to == Unit.SQUARE_CENTIMETERS) {
                    constant = 10000;
                } else if (to == Unit.SQUARE_FEET) {
                    constant = 10.7639;
                } else if (to == Unit.SQUARE_MILES) {
                    constant = 3.861e-7;
                } else if (to == Unit.SQUARE_KILOMETERS) {
                    constant = 1e-6;
                }
                break;
            case SQUARE_MILES:
                if (to == Unit.SQUARE_INCHES) {
                    constant = 4.014e+9;
                } else if (to == Unit.SQUARE_CENTIMETERS) {
                    constant = 2.59e+10;
                } else if (to == Unit.SQUARE_FEET) {
                    constant = 2.788e+7;
                } else if (to == Unit.SQUARE_METERS) {
                    constant = 2.59e+6;
                } else if (to == Unit.SQUARE_KILOMETERS) {
                    constant = 2.58999;
                }
                break;
            case SQUARE_KILOMETERS:
                if (to == Unit.SQUARE_INCHES) {
                    constant = 1.55e+9;
                } else if (to == Unit.SQUARE_CENTIMETERS) {
                    constant = 1e+10;
                } else if (to == Unit.SQUARE_FEET) {
                    constant = 1.076e+7;
                } else if (to == Unit.SQUARE_METERS) {
                    constant = 1e+6;
                } else if (to == Unit.SQUARE_MILES) {
                    constant = 0.386102;
                }
                break;
        }
        multiplier = constant;
    }

    public double convert(double input) {
        return input * multiplier;
    }
}


