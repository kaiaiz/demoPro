package fivechess;


/**
 * 棋盘对象
 * 
 * @author 
 * @version  1.0
 */
public class Chessboard {
	// 定义一个二维数组来充当棋盘
	private String[][] board;
	// 定义棋盘的大小
	public static final int BOARD_SIZE = 22;

	/**
	 * 初始化棋盘
	 * 
	 * @return void
	 */
	public void initBoard() {
		// 初始化棋盘数组
		board = new String[BOARD_SIZE][BOARD_SIZE];
		// 把每个元素赋值为“十”，用于控制台输出棋盘
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				board[i][j] = "十";
			}
		}
	}

	/**
	 * 在控制台输出棋盘的方法
	 */
	public void printBoard() {
		// 打印每个数组元素
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				// 打印后不换行
				System.out.print(board[i][j]);
			}
			// 每打印完一行数组元素就换行一次
			System.out.print("\n");
		}
	}

	/**
	 * 给棋盘位置赋值
	 * 
	 * @param posX
	 *            X坐标
	 * @param posY
	 *            Y坐标
	 * @param chessman
	 *            棋子
	 */
	public void setBoard(int posX, int posY, String chessman) {
		this.board[posX][posY] = chessman;
	}

	/**
	 * 返回棋盘
	 * 
	 * @return 返回棋盘
	 */
	public String[][] getBoard() {
		return this.board;
	}
}