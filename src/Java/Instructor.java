package Java;

public class Instructor extends Person implements  Teacher{

    public Instructor(long id) {
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

    public void teach (Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }


    public void lecture(Learner[]learners, double numberOfHours){
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int x = 0; x < learners.length; x++){
            learners[x].learn(numberOfHoursPerLearner);
            System.out.println("each student will take " + numberOfHoursPerLearner + " To Learn ");

        }





    }
}
