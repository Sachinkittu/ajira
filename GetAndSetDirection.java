public class GetAndSetDirection {
    private Wall north=new Wall("N");
    private Wall south=new Wall("S");
    private Wall east=new Wall("E");
    private Wall west=new Wall("W");

    //get and set North Direction
    public Wall getNorth()
    {
        return north;
    }

    public void setNorth(Wall north)
    {
        this.north=north;
    }

    //get and set South Direction
    public Wall getSouth()
    {
        return south;
    }

    public void setSouth(Wall south)
    {
        this.south=south;
    }

    //get and set East Direction
    public Wall getEast()
    {
        return east;
    }

    public void setEast(Wall east)
    {
        this.east=east;
    }

    //get and set North Direction
    public Wall getWest()
    {
        return west;
    }

    public void setWest(Wall west)
    {
        this.west=west;
    }
}

