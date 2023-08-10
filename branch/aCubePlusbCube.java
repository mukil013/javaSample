package branch;

public class aCubePlusbCube {
    public double answer(int a, int b){
        return (Math.pow(a,3)+(3+((Math.pow(a,2)))*b)+(3+(a*(Math.pow(b,2))))+(Math.pow(b,3)));
    }
}
