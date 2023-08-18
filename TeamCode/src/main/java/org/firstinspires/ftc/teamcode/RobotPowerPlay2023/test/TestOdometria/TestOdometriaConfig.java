package org.firstinspires.ftc.teamcode.RobotPowerPlay2023.test.TestOdometria;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TestOdometriaConfig {
    public DcMotor encoderDerecho; //0 expansion
    public DcMotor encoderIzquiedo; //1 expansion
    public DcMotor encoderTrasero; //2 expansion
    public DcMotor Motores[]= {};

    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();

    public TestOdometriaConfig(){

    }
    public void init(HardwareMap ahwMap, Telemetry telemetry) {
        // Save reference to Hardware map
        hwMap = ahwMap;

    }
}
