package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class UTTelemetry {
    private GamepadKeyboard keyboard;
    private Telemetry telemetry;
    private UTState state;

    public UTTelemetry(Telemetry telemetry) {
        this.state = new UTState();
        this.telemetry = telemetry;
    }

    public void update() {
        if (keyboard.activeBefore.contains(GamepadKeys.DPAD_DOWN)) {

        }
    }
}
