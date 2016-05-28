import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by kaiai on 16-5-27.
 */
public class ChessGame {
    private int posX = 0;
    private int posY = 0;
    private String white = "✰";
    private String black = "✭";
    private String ico;           //缺省机器先走，为黑方。
    private  boolean winOrLose;
    public ChessBoard chess;
    public ChessGame() {
    }

    public ChessGame(ChessBoard chessBoard) {
        this.chess = chessBoard;
    }

    public void start() throws Exception{
        this.computerDo();
    }

    private boolean invalid(int posTagX,int posTagY) {
        if (0 <= posTagX&&posTagX<chess.BOARD_SIZE&&0<=posTagY&&posTagY<chess.BOARD_SIZE){
            if (chess.chessBoard[posTagX][posTagY].equals(white)|| chess.chessBoard[posTagX][posTagY].equals(black)) {
                return true;
            }
            else {
                System.out.println("输入棋盘坐标已有棋子。");
                return false;
            }
        }
        else{
            System.out.println("输入棋盘坐标超出范围。");
            return false;
        }
    }

    private void userDo() throws Exception{
        ico=white;
        int posTagX=0;
        int posTagY=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=null;
        while((input=br.readLine())!=null){
            String[] posStrArr=input.split(",");
            posTagX=Integer.parseInt(posStrArr[0]);
            posTagY=Integer.parseInt(posStrArr[1]);
        }
        boolean invalid=this.invalid(posTagX,posTagY);
        if(invalid) {
            winOrLose=this.WinOrLose(posTagX, posTagY, ico);
                    if(winOrLose)
                        System.out.println("您赢了。");
            else
                        chess.chessBoard[posX-1][posY]=ico;
                       chess.printBoard();
                        this.computerDo();
        }else {
            System.out.println("输入棋子坐标无效，请重新输入。");
            this.userDo();
        }
    }

    private void computerDo() throws Exception{
        ico=black;
        int posTagX=(int)(Math.random()*(chess.BOARD_SIZE));
        int posTagY=(int)(Math.random()*(chess.BOARD_SIZE));
        boolean invalid=this.invalid(posTagX,posTagY);
        if(!invalid)
            this.computerDo();
        else
            chess.chessBoard[posTagX][posTagY]=black;
        chess.printBoard();
        winOrLose = this.WinOrLose(posTagX, posTagY,ico);
        if(winOrLose)
            System.out.println("您输了。");
        else
            this.userDo();
    }

    private boolean WinOrLose(int posTagX, int posTagY,String ico) {
        int tag = 0;
        int acount = 0;
        int tagXStart = posTagX - 1 - 5;
        int tagXEnd = posTagX - 1 + 5;
        int tagYStart = posTagY- 1 - 5;
        int tagYEnd = posTagY - 1 + 5;
        for (int i = tagXStart; i <= tagXEnd; i++) {                  //判断左右
            if (chess.chessBoard[posTagX][i].equals(ico) && chess.chessBoard[posTagX][i + 1].equals(ico)) {
                tag++;
            } else
                tag = 0;
        }
        if (tag == 4)
            acount++;
        tag = 0;
        for (int i = tagXStart; i <= tagXEnd; i++) {                    //判断上下
            if (chess.chessBoard[i][posTagY].equals(ico) && chess.chessBoard[i + 1][posTagY].equals(ico)) {
                tag++;
            } else
                tag = 0;
        }
        if (tag == 4)
            acount++;
        for (int i = tagXEnd; i <= tagXStart; i++) {            //判断右下到左上
            for (int j = tagYStart; j <= tagYEnd; j++) {
                if (chess.chessBoard[i][j].equals(ico) && chess.chessBoard[i + 1][j + 1].equals(ico)) {
                    tag++;
                } else
                    tag = 0;
            }
        }
        if (tag == 4)
            acount++;
        tag = 0;
        for (int i = tagXStart; i <= tagXEnd; i++) {
            for (int j = tagYStart; j <= tagYEnd; j++) {
                if (chess.chessBoard[i][j].equals(ico) && chess.chessBoard[i + 1][j + 1].equals(ico)) {
                    tag++;
                } else
                    tag = 0;
            }
        }
        if (acount >= 1)
            return true;
        else
            return false;
    }
}