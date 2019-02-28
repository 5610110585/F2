public class Game{
    private int p1;
    private int p2;
    private int maxslot;
    private int turn;
public Game(int max_slot){
    p1 = 0;
    p2 = 0;
    maxslot = max_slot;
    turn = 1;

}
public void walk(int slot){
    if(turn == 1){
        p1 += slot;
        turn = 2;
    }
    else if( turn == 2){
        p2 += slot;
        turn = 1;
    }
    if(p1 >= maxslot)
        System.out.println("Player 1 win");
    else if (p2 >= maxslot)
        System.out.println("Player 2 win");
    }

}