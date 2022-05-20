public class Wall {
    public Wall(String direction)
    {
        this.direction=direction;
    }
    private int height=0;
    private String direction;
    private int success=0;
    private int minHeight=0;

    public boolean attackTheWall(int strength)
    {
        if(strength>this.height) //if strength increases when we need to return 
        {
            if(strength>this.minHeight)
                this.minHeight=strength;
            success++;
            return true;
        }
        //else it return false
        return false;
    }

    //For repair the wall
    public void repairTheWall()
    {
        this.height=this.minHeight;
    }

    //get and set for WallDirection
    public String getDirection()
    {
        return direction; 
    }

    public void setDirection(String direction)
    {
        this.direction=direction;
    }

    //get and set for success
    public int getSuccess()
    {
        return success;
    }

    public void setSuccess(int success)
    {
        this.success=success;
    }

}
