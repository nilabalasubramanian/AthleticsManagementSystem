package Test;

import Service.AthleteManagement;
import Service.Player;
import Service.Sports;
import utility.Date;
import java.util.ArrayList;
import java.util.List;

public class AthleteTester {
    AthleteManagement am=new AthleteManagement();
    Player p1=new Player("Raman",19,2,"BE");
    Player p2=new Player("Nayantara",23,6,"BE");
    Player p3=new Player("Nazriya",28,1,"BE");
    Sports s1=new Sports(1,"Tennis","Outdoor",null,p1);
    Sports s2=new Sports(2,"Tennis","Outdoor",null,p2);
    List<Sports> sportsList1=new ArrayList<Sports>();

}
