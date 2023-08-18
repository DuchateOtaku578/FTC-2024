package org.firstinspires.ftc.teamcode.RobotPowerPlay2023.test.ColorSensor;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="PruebaSensorColor" , group="PushBot")
public class ColorSensorInit extends LinearOpMode {

    PruebaColorSensor robot = new PruebaColorSensor();

    @Override
    public void runOpMode() {
        robot.init(hardwareMap, telemetry);
        ColorSensorDomain sensorcolor = new ColorSensorDomain(robot.colorsensor);
        telemetry.addLine("Senosor inicializado");
        telemetry.update();
        sleep(1000);



        while (opModeIsActive()) {
            if(sensorcolor.detectarRojo()){
                telemetry.addData("detecto color rojo: ",sensorcolor.valorRojo());
            }else
                if(sensorcolor.detectarAzul()){
                    telemetry.addData("detecto color azul: ", sensorcolor.valorAzul());
                }else
                    if(sensorcolor.detectarVerde()){
                        telemetry.addData("detecto color verde: ",sensorcolor.valorVerde());
                    }else
                        if(sensorcolor.detectarAlpha()){
                            telemetry.addData("detecto alpha: ", sensorcolor.valorAlpha());
                        }else
                            telemetry.addLine("no detecto nada");
                        telemetry.update();


        }
    }
}
