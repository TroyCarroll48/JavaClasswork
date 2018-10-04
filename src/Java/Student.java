package Java;

public class Student extends Person implements Learner {

    public double totalStudyTime;


    public Student(long id) {
        super(id);
    }

    public long getid(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void learn(double numberOfHours){
       numberOfHours = numberOfHours + totalStudyTime;
    }

    public void setTotalStudeTime(double totalStudyTime){
        this.totalStudyTime = totalStudyTime;

    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }


}
