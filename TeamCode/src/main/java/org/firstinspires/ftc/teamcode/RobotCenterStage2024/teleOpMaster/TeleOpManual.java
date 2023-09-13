package org.firstinspires.ftc.teamcode.RobotCenterStage2024.teleOpMaster;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotCenterStage2024.domain.ChasisDos;
import org.firstinspires.ftc.teamcode.RobotPractica.RobotConfigMaster_3;

@TeleOp(name="TeleOpManual", group="Pushbot")

public class TeleOpManual extends LinearOpMode {

    @Override
    public void runOpMode() {
        RobotConfigMaster_3 robot = new RobotConfigMaster_3();
        robot.init(hardwareMap, telemetry);
        ChasisDos chasis = new ChasisDos(robot.enfrenteDer, robot.enfrenteIzq, robot.atrasDer, robot.atrasIzq);
        chasis.init();
        telemetry.update();
        final double velocidad = 0.5;
        double incremento = 0;
        boolean cambio = true;
        int pulsosElevador = 0;



        waitForStart();

        while (opModeIsActive()) {


            incremento = (gamepad1.left_stick_button || gamepad1.right_stick_button) ? 0.7 : 0;

            telemetry.addData("Velocidad", (velocidad + incremento) * 100 + "%");

            double stickIzquierdoY = -gamepad1.left_stick_y;
            double stickIzquierdoX = gamepad1.left_stick_x;

            double stickDerechoY = -gamepad1.right_stick_y;
            double stickDerechoX = gamepad1.right_stick_x;


            double stickIzquierdoY_2 = -gamepad2.left_stick_y;
            double stickIzquierdoX_2 = gamepad2.left_stick_x;

            double stickDerechoY_2 = -gamepad2.right_stick_y;
            double stickDerechoX_2 = gamepad2.right_stick_x;

            boolean cruzArriba2 = gamepad2.dpad_up;
            boolean cruzAbajo2 = gamepad2.dpad_down;


            telemetry.addLine("CONTROL 1");
            telemetry.addData("Stic isquierdo Y", stickIzquierdoY);
            telemetry.addData("Stic isquierdo X ", stickIzquierdoX);
            telemetry.addData("Stic derecho Y ", stickDerechoY);
            telemetry.addData("Stic derecho X ", stickDerechoX);
            telemetry.addLine("");
            telemetry.addLine("CONTROL 2");
            telemetry.addData("Stic isquierdo 2 Y", stickIzquierdoY_2);
            telemetry.addData("Stic isquierdo 2 X ", stickIzquierdoX_2);
            telemetry.addData("Stic derecho 2 Y ", stickDerechoY_2);
            telemetry.addData("Stic derecho 2 X ", stickDerechoX_2);


            telemetry.update();


            //Control de chasis
            if (stickIzquierdoY > 0.5 && gamepad1.right_trigger > 0.1) {
                chasis.tokyoDrift(velocidad + incremento);
            } else if (stickIzquierdoY > 0.9) {
                chasis.moverseEnfrente(velocidad + incremento);
            } else if (stickIzquierdoY < -0.9) {
                chasis.moverseAtras(velocidad + incremento);
            } else if (stickIzquierdoX < -0.9) {
                chasis.moverseIzquierda(velocidad + incremento);
            } else if (stickIzquierdoX > 0.9) {
                chasis.moverseDerecha(velocidad + incremento);
            } else if (stickDerechoX < -0.9) {
                chasis.girarIzquierda(velocidad + incremento);
            } else if (stickDerechoX > 0.9) {
                chasis.girarDerecha(velocidad + incremento);
            } else {
                chasis.parar();
            }

            //Control de giro (Automático)


        }
    }
}



