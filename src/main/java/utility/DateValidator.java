package utility;

public class DateValidator {
    public boolean validateDate(Date start,Date end)
    {
        if(end.getYear()>start.getYear())return true;
        else if(end.getMonth().compareTo(start.getMonth())>0&&end.getYear()==start.getYear())return true;
       else if(end.getDay()>start.getDay()&&end.getMonth().compareTo(start.getMonth())==0&&end.getYear()==start.getYear())
        return true;
       return false;

    }


}
