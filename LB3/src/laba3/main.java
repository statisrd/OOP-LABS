package laba3;
public class main
{

    public static void main(String[] args){
        IOperation[] parentint = {new div(), new Mod(), new Nod(), new Nok()};

        int a = 200, b = 3;
        for (IOperation op : parentint){
            System.out.println(op.getName());
            System.out.printf("%d %s %d = %d \n", a, op.getSign(), b, op.estimate(a, b));
        }
    }
    
}