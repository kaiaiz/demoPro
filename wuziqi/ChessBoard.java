/**
 * Created by kaiai on 16-5-24.
 */
public class ChessBoard {
    int  BOARD_SIZE=15;
    public String[][] chessBoard;
            public  String[][] initBoard(){
                chessBoard=new String[BOARD_SIZE][BOARD_SIZE];
                for(int i=0;i<BOARD_SIZE;i++){
                    for(int j=0;j<BOARD_SIZE;j++)
                        chessBoard[i][j]="✚";
                }
           return chessBoard;
            }
    public void printBoard(){
        for(int i=0;i<BOARD_SIZE;i++){
            for(int j=0;j<BOARD_SIZE;j++)
                System.out.print(chessBoard[i][j]);
            System.out.print("\n");
        }
    }
}


