package com.lnt.unitconverter;

public class CURRENCY_enum {
    public enum Unit_5 {
        US_DOLLAR,
        RUPEE,
        EURO,
        POUND_STERLING,
        UAE_DIRHAM,
        BITCOIN,
        ETHER;

        public static Unit_5 fromString(String text) {
            if (text != null) {
                for (Unit_5 unit_5 : Unit_5.values()) {
                    if (text.equalsIgnoreCase(unit_5.toString())) {
                        return unit_5;
                    }
                }
            }
            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }
    private final double multiplier;
    public CURRENCY_enum(Unit_5 from, Unit_5 to) {
        double constant = 1;
        switch (from) {
            case US_DOLLAR:
                if (to == Unit_5.RUPEE) {
                    constant = 73.29;
                } else if (to == Unit_5.UAE_DIRHAM) {
                    constant = 3.67;
                } else if (to == Unit_5.EURO) {
                    constant = 0.85;
                } else if (to == Unit_5.POUND_STERLING) {
                    constant = 0.77;
                } else if (to == Unit_5.BITCOIN) {
                    constant = 0.000087;
                } else if (to == Unit_5.ETHER) {
                    constant = 0.0026;
                }
                break;
            case RUPEE:
                if (to == Unit_5.US_DOLLAR) {
                    constant = 0.014;
                } else if (to == Unit_5.UAE_DIRHAM) {
                    constant = 0.050;
                } else if (to == Unit_5.EURO) {
                    constant = 0.012;
                } else if (to == Unit_5.POUND_STERLING) {
                    constant = 0.010;
                } else if (to == Unit_5.BITCOIN) {
                    constant = 0.0000012;
                } else if (to == Unit_5.ETHER){
                    constant = 0.000035;
                }
                break;
            case UAE_DIRHAM:
                if (to == Unit_5.US_DOLLAR) {
                    constant = 0.27;
                } else if (to == Unit_5.RUPEE) {
                    constant = 19.95;
                } else if (to == Unit_5.EURO) {
                    constant = 0.23;
                } else if (to == Unit_5.POUND_STERLING) {
                    constant = 0.21;
                } else if (to == Unit_5.BITCOIN) {
                    constant = 0.000024;
                } else if (to == Unit_5.ETHER){
                    constant = 0.00071;
                }
                break;
            case EURO:
                if (to == Unit_5.US_DOLLAR) {
                    constant = 1.18;
                } else if (to == Unit_5.RUPEE) {
                    constant = 86.40;
                } else if (to == Unit_5.UAE_DIRHAM) {
                    constant = 4.33;
                } else if (to == Unit_5.POUND_STERLING) {
                    constant = 0.90;
                } else if (to == Unit_5.BITCOIN) {
                    constant = 0.00010;
                } else if (to == Unit_5.ETHER) {
                    constant = 0.0031;
                }
                break;
            case POUND_STERLING:
                if (to == Unit_5.US_DOLLAR) {
                    constant = 1.30;
                } else if (to == Unit_5.RUPEE) {
                    constant = 95.54;
                } else if (to == Unit_5.UAE_DIRHAM) {
                    constant = 4.79;
                } else if (to == Unit_5.EURO) {
                    constant = 1.11;
                } else if (to == Unit_5.BITCOIN) {
                    constant = 0.00011;
                } else if (to == Unit_5.ETHER) {
                    constant = 0.0034;
                }
                break;
            case BITCOIN:
                if (to == Unit_5.US_DOLLAR) {
                    constant = 11526.50;
                } else if (to == Unit_5.RUPEE) {
                    constant = 844919.89;
                } else if (to == Unit_5.UAE_DIRHAM) {
                    constant = 42348.49;
                } else if (to == Unit_5.EURO) {
                    constant = 0.014;
                } else if (to == Unit_5.POUND_STERLING) {
                    constant = 8845.84;
                } else if (to == Unit_5.ETHER) {
                    constant = 29.89;
                }
                break;
            case ETHER:
                if (to == Unit_5.US_DOLLAR) {
                    constant = 384.78;
                } else if (to == Unit_5.RUPEE) {
                    constant = 28256.58;
                } else if (to == Unit_5.UAE_DIRHAM) {
                    constant = 1416.26;
                } else if (to == Unit_5.EURO) {
                    constant = 327.17;
                } else if (to == Unit_5.POUND_STERLING) {
                    constant = 295.90;
                } else if (to == Unit_5.BITCOIN) {
                    constant = 0.033;
                }
                break;
        }
        multiplier = constant;
    }
    public double convert(double input) {
        return input * multiplier;
    }
}
