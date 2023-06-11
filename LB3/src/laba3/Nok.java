package laba3;
public class Nok implements IOperation {
    @Override
    public String getName(){
        return "НОК";
    }

    @Override
    public String getSign(){
        return "НОК";
    }

    @Override
    public int estimate(int a, int b){
        if (a == 0 || b == 0) return 0;
        else {
            int x = Math.abs(a);
            int y = Math.abs(b);
            int z = Math.max(x,y);
            int s = Math.min(x,y);
            int nok = z;
            while (nok % s !=0) nok+=z;
            return nok;
        }
    } 
}