public class Game{
    private int p1;
    private int p2;
    private int maxslot;
    private int turn;
    private Dice dice1;
    private Dice dice2;
    
public Game(int max_slot){
    p1 = 0;
    p2 = 0;
    maxslot = max_slot;
    turn = 1;
    tunnels = new ArrayList<Tunnel> ();
    }
public void addTunnel(int s_in, int s_out){
        Tunnel t = new Tunnel(s_in, s_out);
        Tunnels.add(t);
    }
public void walk(int slot){
    if(turn == 1){
        p1 += slot;
        for(Tunnel t : tunnels){
            p1 = t.walkIn(p1);
        }
    }
    else if( turn == 2){
        p2 += slot;
        for(Tunnel t : tunnels){
            p2 = t.walkIn(p2);
        }
    }
    if(p1 >= maxslot)
        System.out.println("Player 1 win");
    else if (p2 >= maxslot)
        System.out.println("Player 2 win");
    }
public boolean isEnded(){
        return p1 >= maxSlot || p2 >= maxSlot;
    }
public void play(){
        dice1.roll(); dice2.roll();
        wlak(dice1.getValue() + dice2.getVAlue());
        if(dice1.getValue() != dice2.getValue()){
            changeTurn();
        }
    }
private void changeTurn(){
        turn = turn == 1 ? 2 : 1;
        }
    
}