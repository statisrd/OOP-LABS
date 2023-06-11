package laba3;


public class Mod implements IOperation {
    @Override
    public String getName(){
        return "mod";
    }

    @Override
    public String getSign(){
        return "%";
    }

    @Override
    public int estimate(int a, int b){
        return a%b;
    } 
}