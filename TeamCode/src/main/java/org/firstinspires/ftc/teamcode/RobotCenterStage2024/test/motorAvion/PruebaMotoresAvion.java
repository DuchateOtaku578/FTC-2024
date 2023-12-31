package org.firstinspires.ftc.teamcode.RobotCenterStage2024.test.motorAvion;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="PruebaMotoresAvion" , group = "PusBot")
public class PruebaMotoresAvion extends LinearOpMode {


    @Override
    public void runOpMode() {
        PruebaMotoresAvionConfig robot = new PruebaMotoresAvionConfig();
        robot.init(hardwareMap, telemetry);


        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.x) {
                robot.irPosicionInicial();
            } else if (gamepad1.a) {
                robot.moverServo();
            } else if(gamepad1.b){
                robot.irPosicionMaxima();
            }
        }

    }
}
