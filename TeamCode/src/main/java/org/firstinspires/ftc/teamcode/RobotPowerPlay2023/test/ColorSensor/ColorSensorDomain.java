package org.firstinspires.ftc.teamcode.RobotPowerPlay2023.test.ColorSensor;

import com.qualcomm.robotcore.hardware.ColorSensor;

public class ColorSensorDomain {

    ColorSensor colorsensor;

    public double GREEN = colorsensor.green();

    public double BLUE = colorsensor.blue();

    public double RED = colorsensor.red();

    public double ALPHA = colorsensor.alpha();

    int valordetectado = 200;

    int valornulo = 0;

    public ColorSensorDomain(ColorSensor colorsensor) {

    }


    public boolean detectarVerde(){
        if(GREEN > valordetectado){
            return true;
        }
        return false;
    }

    public boolean detectarAzul(){
        if(BLUE > valordetectado){
            return true;
        }
        return false;
    }

    public boolean detectarRojo(){
        if(RED > valordetectado){
            return true;
        }
        return false;
    }

    public boolean detectarAlpha(){
        if(ALPHA > valordetectado){
            return true;
        }
        return false;
    }

    public double valorVerde(){
        if(detectarVerde()){
            return colorsensor.green();
        }
        return valornulo;

    }

    public double valorAzul(){
        if(detectarAzul()){
            return colorsensor.blue();
        }
        return valornulo;
    }

    public double valorRojo(){
        if(detectarRojo()){
            return colorsensor.red();
        }
        return valornulo;
    }

    public double valorAlpha(){
        if(detectarAlpha()){
            return colorsensor.alpha();
        }
        return valornulo;
    }



}
