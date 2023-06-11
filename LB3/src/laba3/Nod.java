package laba3;
public class Nod implements IOperation {
    @Override
    public String getName(){
        return "НОД";
    }

    @Override
    public String getSign(){
        return "nod";
    }

    @Override
    public int estimate(int a, int b){
        if (a == 0 || b == 0) return a + b;
        else {
            int x = Math.abs(a);
            int y = Math.abs(b);
            int z = Math.max(x,y );
            int s = Math.min(x,y );

            return estimate(z % s, s );
        }


    } 
}