package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide==1){
            System.out.println("it's not a triangle");
        } else if (secondSide==1) {
            System.out.println("this is a valid triangle");
        }else if (thirdSide==1){
            System.out.println("this is a valid triangle");
        }else {
            System.out.println("this is a valid triangle");
        }
    }
}
