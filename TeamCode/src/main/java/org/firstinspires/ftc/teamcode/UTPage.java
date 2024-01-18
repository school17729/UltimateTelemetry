package org.firstinspires.ftc.teamcode;

import java.util.ArrayList;

public class UTPage {
    private ArrayList<UTLogItem> logItems;

    public UTPage() {
        this.logItems = new ArrayList<>();
    }

    public UTPage(ArrayList<UTLogItem> logItems) {
        this.logItems = logItems;
    }
}
