
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    static int DEFAULT_POWER = 10;
    int power;
    String name;

    /**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
    public PowerPill(String name){
        this.name = name;
        power = DEFAULT_POWER;
    }

    public PowerPill(String name, int power){
        this.name = name;
        this.power = power;
    }

    /**
     * Gets name of PowerPill object
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * Gets power of PowerPill object
     * @return power
     */
    public int getPower(){
        return power;
    }

    /**
     * Sets name of PowerPill Object
     * @param name
     */
    public void setName(String name){this.name = name;}

    /**
     * Sets power of PowerPill Object
     * @param power
     */
    public void setPower(int power){this.power = power;}


    /**
     * Returns string of PowerPill object
     * @return toString
     */
    public String toString(){
        return "PowerPill " + name + " = " + power;
    }

}