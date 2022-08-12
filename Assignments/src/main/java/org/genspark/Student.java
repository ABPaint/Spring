package org.genspark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Student implements Identification {
    private int iD;
    private String name;
    private String ph;
    private Address add;

    public Student(int iD, String name, String ph, Address add) {
        this.iD = iD;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return String.valueOf(iD);
    }


    @Override
    public void id() {
        System.out.println("Their name is "+ name);
        System.out.println("Their ID is "+ iD);
        System.out.println("Phone Number: "+ph);
//        Iterator<Phone> itr=ph.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        System.out.println("and their address is: "+add);

    }
}
