public class Attack {
    public Attack(String direction,int strength)
    {
        this.direction=direction;
        this.strength=strength;
    }
    private String direction;
    private int strength;
    //getters and setters
    public String getDirection()
    {
        return direction;
    }
    public void setDirection(String direction)
    {
        this.direction=direction;
    }
    //For Strength
    public int getStrength()
    {
        return strength;
    }
    public void setStrength(int strength)
    {
        this.strength=strength;
    }
}
