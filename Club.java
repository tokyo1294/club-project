import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership>members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // question 1 
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
    members.add(member);
    //question 3 
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
        //question 2 
    }
    /**
     * 
     */
     public int joinedInMonth(int month){
         if (month >= 12 || month <= 1)  {
             System.out.println("month is out of range of 1-12 ");
             return 0;
             
            }else{
                 int count=0;
                 for(Membership m : members){
                 if(m.getMonth() == month){
                     count++;
                 }
             }
             return count;
         }
        }
    public int joinedInYear(int year){
        return (year);
    }
        
    }

