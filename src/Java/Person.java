package Java;

public class Person {


    public String name;
    public final long id;


    public Person(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
