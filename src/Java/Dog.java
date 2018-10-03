package Java;

import javax.swing.plaf.SpinnerUI;

public class Dog {
    public String name;
//    public String food;
//    public String breed;

    public Dog(String name){
        this.name = name;

    }

    @Override
    public String toString(){
        return name;
    }

}
