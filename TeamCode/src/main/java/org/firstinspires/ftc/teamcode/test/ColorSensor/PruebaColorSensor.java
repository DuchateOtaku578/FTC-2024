package org.firstinspires.ftc.teamcode.test.ColorSensor;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class PruebaColorSensor {

    public ColorSensor colorsensor;

    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();


    public PruebaColorSensor() {
    }


    public void init(HardwareMap ahwMap, Telemetry telemetry){
        hwMap = ahwMap;

        colorsensor=hwMap.get(ColorSensor.class, "colorsensor");


        telemetry.addLine("Sensor de color inicializado");
        telemetry.update();

    }


}
