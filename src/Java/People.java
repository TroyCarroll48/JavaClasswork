package Java;

import java.util.ArrayList;

public class People {

    private Person person;

    ArrayList<Person> personList = new ArrayList();

    public void add(Person p) {
        personList.add(p);
    }


    public void findbyID(long id) {
        for (Person p : personList) {
            if (p.getid() == id)
                System.out.println(p);

        }

    }


    public void remove(Person person){
        personList.remove(person);
    }




    public void remove(long id) {
        for (Person p: personList)
            {if(id == p.getid())
                personList.remove(p);

        }
    }

    public int getCount(){
        return personList.size();
    }

//    public int getArray(){
//        return personList.size();
//    }

    public void  removeAll(){
        personList.removeAll(personList);
    }



}

