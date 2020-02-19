import java.awt.*;

public class main {
    public static void main (String[] args) {
        char[][] s = {{'Q', 'Q', 'Q', 'Q', 'Q', 'Q', 'Q', 'Q'},
                {'X' ,'X', 'X', 'X' ,'X' ,'X' ,'X' ,'X'},
                {'X' ,'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X' ,'X' ,'X' ,'X' ,'X' ,'X' ,'X' ,'X'},
                {'X' ,'X' ,'X', 'X', 'X', 'X', 'X', 'X'},
                {'X' ,'X' ,'X' ,'X' ,'X' ,'X' ,'X' ,'X'},
                {'X' ,'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X' ,'X' ,'X' ,'X', 'X' ,'X' ,'X' ,'X'} };
        LocalBeam localBeam = new LocalBeam(s);


        Point[] result = localBeam.run(8,100,  100);
        System.out.println(Utils.getHeuristicCost(result));
        print_result(result);
        System.out.println("#Of steps : " + localBeam.getSteps());
        System.out.println("#Of expanded : " + localBeam.getNumberOfBoardsExpanded());
        System.out.println("Running Time(ms) : " + localBeam.getRunning_time());
    }

    private static void print_result(Point[] result) {
        String[][] board = new String[8][8];
        for(int i=0; i<8; i++)
            for(int j=0; j<8; j++)
                board[i][j]="X ";
        //place the queens on the board
        for(int i=0; i<8; i++){
            board[result[i].x][result[i].y]="Q ";
        }
        //feed values into the result strin
        String out = "";
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                out+=board[i][j];
            }
            out+="\n";
        }
        System.out.println(out);
    }
}
