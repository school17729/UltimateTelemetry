package org.firstinspires.ftc.teamcode;

public class UTLogItem {
    private String label;
    private double value;
    private UTNumber type;

    public UTLogItem(String label, int value) {
        this.label = label;
        this.value = value;
        this.type = UTNumber.INT;
    }

    public UTLogItem(String label, double value) {
        this.label = label;
        this.value = value;
        this.type = UTNumber.DOUBLE;
    }

    public UTLogItem(String label, float value) {
        this.label = label;
        this.value = value;
        this.type = UTNumber.DOUBLE;
    }

    public String getLabel() {
        return label;
    }

    public double getValue() {
        return value;
    }

    public UTNumber getType() {
        return type;
    }
}
