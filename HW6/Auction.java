public class Auction{
    private ArrayList <Lot> lots;

    public Auction(){
        lots = new ArrayList <Lot>();
        
    }
    public void enterLot(int lotNum, String description){
        lots.add( new Lot( lotNum, description));

    }
    public void ShowLots(){
        for( Lot lot : lots);
        System.out.println( lot.toString());

    }
}
 
