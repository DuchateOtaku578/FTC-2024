package org.firstinspires.ftc.teamcode.RobotPowerPlay2023.test.girosprecisos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.RobotPowerPlay2023.configuracion.RobotConfigMaster;
import org.firstinspires.ftc.teamcode.RobotPowerPlay2023.domain.Chasis;

@Autonomous(name="GirosPrecisosAutonomo", group="Pushbot")
@Disabled
public class GirosPrecisos extends LinearOpMode {

    RobotConfigMaster robot = new RobotConfigMaster();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap , telemetry);
        Chasis chasis = new Chasis(robot.motores, this);
        sleep(1000);
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        //while (opModeIsActive()) {





        }
    }
//}
