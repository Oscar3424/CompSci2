package FamilyTree_block4;

import java.util.ArrayList;

public class Person {
    public String name;
    public String country;
    public ArrayList<Person> children;

    public Person[] allChildren;

    public Person(String n, String c){
        name = n;
        country = c;
        children = new ArrayList<>();
//        allChildren = new Person[4];
    }


    public void summonChild(Person p){
        children.add(p);
    }




}
