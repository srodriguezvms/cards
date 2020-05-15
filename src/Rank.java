public class Rank
{
    private int value;
    private String name;


    public Rank(int rankValue)
    {
        value = rankValue;
    }

    public Rank(String rankName)
    {
        name = rankName;
    }

    public String toString()
    {
        return name;
    }

    public int getValue()
    {
        return value;
    }
}
