/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez_practiceobjects;

/**
 *
 * @author angelramirez-rivera
 */
public class Ramirez_PracticeObjects {

    public static void main(String[] args) {
        
        Admin getReady = new Admin();
        getReady.intro();
        MathFun calc1 = new MathFun();
        MathFun calc2 = new MathFun();

        
        calc1.setNumber1();
        calc1.setNumber2();
        calc2.setNumber1();
        calc2.setNumber2();
        
        
        
        System.out.println("calc1 number1: "+calc1.getNumber1());
        System.out.println("calc1 number2: "+calc1.getNumber2());
        System.out.println("calc2 number1: "+calc2.getNumber1());
        System.out.println("calc2 number2: "+calc2.getNumber2());
        
        System.out.println("calc1 addThem: "+calc1.addThem());
        System.out.println("calc1 multiplyThem: "+calc1.multiplyThem());
        System.out.println("calc2 addThem: "+calc2.addThem());
        System.out.println("calc2 multiplyThem: "+calc2.multiplyThem());
        
        
        double total1 = calc1.addThem() + calc2.addThem();
        double total2 = calc1.multiplyThem() * calc2.multiplyThem();
        
        System.out.println("Total of calc1 and calc2 addThem: " +total1);
        System.out.println("Total of calc1 and calc2 multiplyThem: " +total2);
        System.out.println("The application will now close ");
        getReady.goodbye();
    }
}
