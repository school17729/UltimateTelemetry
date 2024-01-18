package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

import java.util.ArrayList;

public class GamepadKeyboard {
    public Gamepad gamepad;

    public ArrayList<GamepadKeys> activeBefore;
    public ArrayList<GamepadKeys> activeAfter;
    public ArrayList<GamepadKeys> pressed;
    public GamepadKeyboard(Gamepad gamepad) {
        this.gamepad = gamepad;
        activeBefore = new ArrayList<>();
        activeAfter = new ArrayList<>();
        pressed = new ArrayList<>();
    }

    public void update() {
        updateFinish();
        updateStart();
    }

    public void updateStart() {
        updateBefore();
        updateAfter();
    }

    public void updateFinish() {
        updateFinal();
    }

    private void updateBefore() {
        if (gamepad.left_bumper && !pressed.contains(GamepadKeys.LEFT_BUMPER)) {
            activeBefore.add(GamepadKeys.LEFT_BUMPER);
            pressed.add(GamepadKeys.LEFT_BUMPER);
        }
        if (gamepad.dpad_up && !pressed.contains(GamepadKeys.DPAD_UP)) {
            activeBefore.add(GamepadKeys.DPAD_UP);
            pressed.add(GamepadKeys.DPAD_UP);
        }
        if (gamepad.dpad_left && !pressed.contains(GamepadKeys.DPAD_LEFT)) {
            activeBefore.add(GamepadKeys.DPAD_LEFT);
            pressed.add(GamepadKeys.DPAD_LEFT);
        }
        if (gamepad.dpad_down && !pressed.contains(GamepadKeys.DPAD_DOWN)) {
            activeBefore.add(GamepadKeys.DPAD_DOWN);
            pressed.add(GamepadKeys.DPAD_DOWN);
        }
        if (gamepad.dpad_right && !pressed.contains(GamepadKeys.DPAD_RIGHT)) {
            activeBefore.add(GamepadKeys.DPAD_RIGHT);
            pressed.add(GamepadKeys.DPAD_RIGHT);
        }
        if (gamepad.y && !pressed.contains(GamepadKeys.Y)) {
            activeBefore.add(GamepadKeys.Y);
            pressed.add(GamepadKeys.Y);
        }
        if (gamepad.x && !pressed.contains(GamepadKeys.X)) {
            activeBefore.add(GamepadKeys.X);
            pressed.add(GamepadKeys.X);
        }
        if (gamepad.a && !pressed.contains(GamepadKeys.A)) {
            activeBefore.add(GamepadKeys.A);
            pressed.add(GamepadKeys.A);
        }
        if (gamepad.b && !pressed.contains(GamepadKeys.B)) {
            activeBefore.add(GamepadKeys.B);
            pressed.add(GamepadKeys.B);
        }
        if (gamepad.right_bumper && !pressed.contains(GamepadKeys.RIGHT_BUMPER)) {
            activeBefore.add(GamepadKeys.RIGHT_BUMPER);
            pressed.add(GamepadKeys.RIGHT_BUMPER);
        }

        if (gamepad.left_stick_button && !pressed.contains(GamepadKeys.LEFT_STICK_BUTTON)) {
            activeBefore.add(GamepadKeys.LEFT_STICK_BUTTON);
            pressed.add(GamepadKeys.LEFT_STICK_BUTTON);
        }
        if (gamepad.right_stick_button && !pressed.contains(GamepadKeys.RIGHT_STICK_BUTTON)) {
            activeBefore.add(GamepadKeys.RIGHT_STICK_BUTTON);
            pressed.add(GamepadKeys.RIGHT_STICK_BUTTON);
        }

        if ((gamepad.left_trigger > 0.9) && !pressed.contains(GamepadKeys.LEFT_TRIGGER)) {
            activeBefore.add(GamepadKeys.LEFT_TRIGGER);
            pressed.add(GamepadKeys.LEFT_TRIGGER);
        }
        if ((gamepad.right_trigger > 0.9) && !pressed.contains(GamepadKeys.RIGHT_TRIGGER)) {
            activeBefore.add(GamepadKeys.RIGHT_TRIGGER);
            pressed.add(GamepadKeys.RIGHT_TRIGGER);
        }
    }
    private void updateAfter() {
        if (!gamepad.left_bumper && pressed.contains(GamepadKeys.LEFT_BUMPER)) {
            activeAfter.add(GamepadKeys.LEFT_BUMPER);
            pressed.remove(GamepadKeys.LEFT_BUMPER);
        }
        if (!gamepad.dpad_up && pressed.contains(GamepadKeys.DPAD_UP)) {
            activeAfter.add(GamepadKeys.DPAD_UP);
            pressed.remove(GamepadKeys.DPAD_UP);
        }
        if (!gamepad.dpad_left && pressed.contains(GamepadKeys.DPAD_LEFT)) {
            activeAfter.add(GamepadKeys.DPAD_LEFT);
            pressed.remove(GamepadKeys.DPAD_LEFT);
        }
        if (!gamepad.dpad_down && pressed.contains(GamepadKeys.DPAD_DOWN)) {
            activeAfter.add(GamepadKeys.DPAD_DOWN);
            pressed.remove(GamepadKeys.DPAD_DOWN);
        }
        if (!gamepad.dpad_right && pressed.contains(GamepadKeys.DPAD_RIGHT)) {
            activeAfter.add(GamepadKeys.DPAD_RIGHT);
            pressed.remove(GamepadKeys.DPAD_RIGHT);
        }
        if (!gamepad.y && pressed.contains(GamepadKeys.Y)) {
            activeAfter.add(GamepadKeys.Y);
            pressed.remove(GamepadKeys.Y);
        }
        if (!gamepad.x && pressed.contains(GamepadKeys.X)) {
            activeAfter.add(GamepadKeys.X);
            pressed.remove(GamepadKeys.X);
        }
        if (!gamepad.a && pressed.contains(GamepadKeys.A)) {
            activeAfter.add(GamepadKeys.A);
            pressed.remove(GamepadKeys.A);
        }
        if (!gamepad.b && pressed.contains(GamepadKeys.B)) {
            activeAfter.add(GamepadKeys.B);
            pressed.remove(GamepadKeys.B);
        }
        if (!gamepad.right_bumper && pressed.contains(GamepadKeys.RIGHT_BUMPER)) {
            activeAfter.add(GamepadKeys.RIGHT_BUMPER);
            pressed.remove(GamepadKeys.RIGHT_BUMPER);
        }

        if (!gamepad.left_stick_button && pressed.contains(GamepadKeys.LEFT_STICK_BUTTON)) {
            activeAfter.add(GamepadKeys.LEFT_STICK_BUTTON);
            pressed.remove(GamepadKeys.LEFT_STICK_BUTTON);
        }
        if (!gamepad.right_stick_button && pressed.contains(GamepadKeys.RIGHT_STICK_BUTTON)) {
            activeAfter.add(GamepadKeys.RIGHT_STICK_BUTTON);
            pressed.remove(GamepadKeys.RIGHT_STICK_BUTTON);
        }

        if (!(gamepad.left_trigger > 0.9) && pressed.contains(GamepadKeys.LEFT_TRIGGER)) {
            activeAfter.add(GamepadKeys.LEFT_TRIGGER);
            pressed.remove(GamepadKeys.LEFT_TRIGGER);
        }
        if (!(gamepad.right_trigger > 0.9) && pressed.contains(GamepadKeys.RIGHT_TRIGGER)) {
            activeAfter.add(GamepadKeys.RIGHT_TRIGGER);
            pressed.remove(GamepadKeys.RIGHT_TRIGGER);
        }
    }

    private void updateFinal() {
        activeBefore.clear();
        activeAfter.clear();
    }

    public void reset() {
        pressed.clear();
        activeBefore.clear();
        activeAfter.clear();
    }
}
