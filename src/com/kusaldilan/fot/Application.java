package com.kusaldilan.fot;



import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
    /*    List<String> students=new ArrayList<>();

        students.add("saman");
        students.add("Nimal");
        students.add("Amal");
        students.add("Kanthi");
        students.add("Ruwan");
        students.add("Isuri");
        System.out.println(students);

        List<String> filtereddata=students.stream()
                .filter(s->s. length()>5)
                .collect(Collectors.toList());
        System.out.println(filtereddata);
 */
List<Sensor> Sensors= new ArrayList<>();

        Sensor Sensor1 =new Sensor("Living room",32);
        Sensors.add(Sensor1);
        Sensor Sensor2 =new Sensor("office roomm",28);
        Sensors.add(Sensor1);
        Sensor Sensor3 =new Sensor("Bed room",26);
        Sensors.add(Sensor1);
        Sensor Sensor4 =new Sensor("Kitchen room",30);
        Sensors.add(Sensor1);
        Sensor Sensor5 =new Sensor("Bath room",28);
        Sensors.add(Sensor1);

        List<Sensor> hotsensor=Sensors.stream()
                .filter(Sensor ->Sensor.getValue()>28)
                .collect(Collectors.toList());

        System.out.println(hotsensor);
    }
}

