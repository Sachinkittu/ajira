import java.util.*;
public class Day {
    //parameterized constructor for setting value
    public Day(String dayName,List<Attack> attacks)
    {
        this.dayName=dayName;
        this.attacks=attacks;
    }
    private String dayName;
    private List<Attack> attacks;

    //get and set dayname
    public String getDayName()
    {
        return dayName;
    }
    public void setDayName(String dayName)
    {
        this.dayName=dayName;
    }
    //for attacks get and set methods
    public List<Attack> getAttacks()
    {
        return attacks;
    }
    public void setAttacks(List<Attack> attacks)
    {
        this.attacks=attacks;
    }
}
