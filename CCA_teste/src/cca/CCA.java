
package cca;
import java.util.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CCA {

    public static void main(String[] args) {
        
        //add
        ArrayList<Bicho> animal = new ArrayList<Bicho>();
        
        GregorianCalendar cal = new GregorianCalendar(1983,6,4);
        Date d = cal.getTime();
        
        animal.add(new Bicho(1234, 180.55, "brangus", "M", "Cabanha JMT",d));
        //animal.add(new Bicho(5239, 200.35, "angus", "F", "Cabanha Grande"));
        
        
        //mostra
        for(int i=0; i<animal.size(); i++){
            animal.get(i).mostra();
        }
       
    }
}
