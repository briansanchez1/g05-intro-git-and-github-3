
public class EscapeRoom {

    public EscapeRoom(){
        
    }

    public void initializeMatrix(){
        
    }

    /* room check method to check which room the player is in. I went off the idea that the 
        values of the gid are stored in the gid directly and have the method check the 
        position for the value and then inform the player and add it to the "inventory"
    */

    public void roomCheck(int[][] room, Player player){
        int val = room[player.getPosition().getRow()][player.getPosition().getColumn()];

        if(val != 1 || val != 0 || val != -1){

            if (val == 4) {
                player.updateInventory("1-4");
                System.out.println("You found part of the code: 1-4" );
            } else if (val == 8) {
                player.updateInventory("2-8");
                System.out.println("You found part of the code: 2-8" );
            } else if (val == 9) {
                player.updateInventory("3-9");
                System.out.println("You found part of the code: 3-9" );
            } else if (val == 6){
                player.updateInventory("4-6");
                System.out.println("You found part of the code: 4-6" );;
            }

        } else if (val == -1) {
            System.out.println("You found the key pad to exit the room");

        } else {
            System.out.println("This part of the room is empty, keep looking!");
        }
    }
}
