package ch9.ex;

public class Ex20 {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println("Math.round(val) = " + Math.round(val)); //91
        val *= 100;
        System.out.println("Math.round(val) = " + Math.round(val)); //9076

        System.out.println("Math.round(val)/100 = " + Math.round(val) / 100); //90
        System.out.println("Math.round(val)/100.0 = " + Math.round(val) / 100.0); //90.76
        System.out.println();
        System.out.println("Math.ceil(1.1) = " + Math.ceil(1.1)); //2.0
        System.out.println("Math.floor(1.5) = " + Math.floor(1.5)); //1.0
        System.out.println("Math.round(1.1) = " + Math.round(1.1)); //1
        System.out.println("Math.round(1.5) = " + Math.round(1.5)); //2
        System.out.println("Math.rint(1.5) = " + Math.rint(1.5)); //2
        System.out.println("Math.round(-1.5) = " + Math.round(-1.5)); //-1
        System.out.println("Math.rint(-1.5) = " + Math.rint(-1.5)); //-2
        System.out.println("Math.ceil(-1.5) = " + Math.ceil(-1.5)); //-1.0
        System.out.println("Math.floor(-1.5) = " + Math.floor(-1.5)); //-2.0

    }
}
