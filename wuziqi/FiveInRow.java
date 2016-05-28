/**
 * Created by kaiai on 16-5-24.
 */
public class FiveInRow {
    public static void main(String[] args)throws Exception{
        System.out.println("五子棋游戏开始");
        System.out.println("请输入下棋坐标，应以x,y的格式。");
        ChessBoard chessBoard=new ChessBoard();
        chessBoard.initBoard();
        chessBoard.printBoard();
        ChessGame game=new ChessGame(chessBoard);
        game.start();
    }
}
