package FamilyTree_block4;

import java.util.ArrayList;

public class FamilyTreeMain {

    public static void run() {
        //generation 0
        Person person1 = new Person("Bobbie", "Mexico");

        //gen 1
        person1.summonChild(new Person("Susan", "Canada"));
        person1.summonChild(new Person("Jill", "Canada"));
        person1.summonChild(new Person("Bobette", "Czechia"));

        //gen2
        person1.children.get(0).summonChild( new Person("Zain","Czechia"));
        person1.children.get(2).summonChild(new Person("Bob III", "Belise"));
        person1.children.get(2).summonChild(new Person("Jasmine", "Canada"));
        person1.children.get(1).summonChild(new Person("Oscar I", "Canada"));
        person1.children.get(1).summonChild(new Person("Oscar II", "Canada"));

        //gen 3
        person1.children.get(0).children.get(0).summonChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).summonChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).summonChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).summonChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).summonChild(new Person("Steve", "USA"));
        person1.children.get(1).children.get(0).summonChild(new Person("Oscar III", "Canada"));

        //gen 4
        person1.children.get(1).children.get(0).children.get(0).summonChild(new Person("Oscar IV", "Canada"));


    }//run

    public void printFamily( Person ptemp){
        for (int i = 0; i < ptemp.children.size(); i++) {


        }

    }

    public static int countFamily( Person pTemp){
        int num = 0;
        return num;
    }


}//class
