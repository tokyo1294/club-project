import java.util.ArrayList;
import java.util.Iterator;

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
         // question 4
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
        /**
     * Remove from the club's collection all members who
        * joined in the given month, and return them stored
        * in a separate collection object.
       * @param month The month of the membership.
       * @param year The year of the membership.
      * @return The members who joined in the given month and year.
      */
     public ArrayList<Membership> purge(int month, int year){
        // question 5
         if (month < 1 || month > 12) {
            System.out.println("invalid month");
            return null;
        }
         if (year < 1990 || year > 2009) {
            System.out.println("invalid year");
            return null;
        }
        
            ArrayList<Membership> purgeList = new ArrayList<>();
         //   for(Membership m : members){
                //if (m.getMonth() == month && m.getYear() == year){
                   // purgeList.add(m);
               // }
             Iterator<Membership>it = members.iterator();
             while(it.hasNext()){
                 Membership m = it.next();
                 if (m.getMonth()==month && m.getYear()==year){
                     purgeList.add(m);
                     it.remove();
                    
                 }
             }
        
        members.removeAll (purgeList); 
         return purgeList;
    }
}
