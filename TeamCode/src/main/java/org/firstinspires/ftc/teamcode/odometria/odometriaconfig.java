package org.firstinspires.ftc.teamcode.odometria;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class odometriaconfig {
    //EXPANSION HUB MOTORES
    public DcMotor enfrenteDer; //0
    public DcMotor enfrenteIzq; //1
    public DcMotor atrasDer; //2
    public DcMotor atrasIzq; //3
    //EXPANION HUB ENCODERS, VAN EN LUGAR DE LOS ENCODERS DE LOS MOTRES
    public DcMotor encoderDer;
    public DcMotor encoderIzq;
    public DcMotor encoderMid;

    HardwareMap hwMap = null;
    private ElapsedTime period = new ElapsedTime();


    public void init(HardwareMap ahwMap, Telemetry telemetry) {

        hwMap = ahwMap;

        enfrenteDer = hwMap.get(DcMotor.class, "enfrenteDer");
        enfrenteIzq = hwMap.get(DcMotor.class, "enfrenteIzq");
        atrasDer = hwMap.get(DcMotor.class, "atrasDer");
        atrasIzq = hwMap.get(DcMotor.class, "atrasIzq");

        reversa(atrasIzq, atrasDer);
        derecho(enfrenteDer, enfrenteIzq);

        usarWithoutEncoder(enfrenteDer, enfrenteIzq, atrasDer, atrasIzq);
        frenar(enfrenteDer, enfrenteIzq, atrasDer, atrasIzq);

        parar();

        }


        public void reversa (DcMotor...motores){
            for (DcMotor motor : motores) {
                motor.setDirection(DcMotor.Direction.REVERSE);
            }
        }

        public void derecho (DcMotor...motores){
            for (DcMotor motor : motores) {
                motor.setDirection(DcMotor.Direction.FORWARD);
            }
        }

        public void usarWithoutEncoder (DcMotor...motores){
            for (DcMotor motor : motores) {
                motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            }
        }
        public void frenar(DcMotor... motores) {
            for (DcMotor motor : motores) {
                motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

            encoderDer = enfrenteDer;
            encoderIzq = enfrenteIzq;
            atrasDer = encoderMid;




        }
    public void parar(){
        enfrenteDer.setPower(0);
        enfrenteIzq.setPower(0);
        atrasDer.setPower(0);
        atrasIzq.setPower(0);
    }
}
