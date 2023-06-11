
package laba3;

public class div implements IOperation {

    @Override
    public String getName(){
        return "div";
    }

    @Override
    public String getSign(){
        return "/";
    }

    @Override
    public int estimate(int a, int b){
        return a/b;
    }
    
}