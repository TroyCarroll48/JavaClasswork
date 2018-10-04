package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        System.out.println("=========================================");

        People yerp = new People();
        Person yolo = new Person(1);
        Person gates = new Person(2);
        Person msJackson = new Person(3);

        yolo.setName("Troy");
        System.out.println(yolo.getName());

        yerp.add(yolo);

        yerp.remove(yolo);

        yerp.findbyID(1);

        yerp.add(gates);

        yerp.add(msJackson);

        System.out.println(yerp.getCount());

        yerp.remove(2);

        System.out.println(yerp.getCount());

        yerp.removeAll();

        System.out.println(yerp.getCount());

        Student pimpin = new Student(567);

        pimpin.setTotalStudeTime(5.50);

        pimpin.getTotalStudyTime();

        Instructor mrT = new Instructor(8768);

        Student polo = new Student(989);

        Student macDaddy = new Student(6757);

        Student[] bullshit = {polo,macDaddy};

        mrT.lecture(bullshit,40);



































































        System.out.println("=========================================");
    }

}
