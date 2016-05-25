package fivechess;


/**
 * ���̶���
 * 
 * @author 
 * @version  1.0
 */
public class Chessboard {
	// ����һ����ά�������䵱����
	private String[][] board;
	// �������̵Ĵ�С
	public static final int BOARD_SIZE = 22;

	/**
	 * ��ʼ������
	 * 
	 * @return void
	 */
	public void initBoard() {
		// ��ʼ����������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		// ��ÿ��Ԫ�ظ�ֵΪ��ʮ�������ڿ���̨�������
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				board[i][j] = "ʮ";
			}
		}
	}

	/**
	 * �ڿ���̨������̵ķ���
	 */
	public void printBoard() {
		// ��ӡÿ������Ԫ��
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				// ��ӡ�󲻻���
				System.out.print(board[i][j]);
			}
			// ÿ��ӡ��һ������Ԫ�ؾͻ���һ��
			System.out.print("\n");
		}
	}

	/**
	 * ������λ�ø�ֵ
	 * 
	 * @param posX
	 *            X����
	 * @param posY
	 *            Y����
	 * @param chessman
	 *            ����
	 */
	public void setBoard(int posX, int posY, String chessman) {
		this.board[posX][posY] = chessman;
	}

	/**
	 * ��������
	 * 
	 * @return ��������
	 */
	public String[][] getBoard() {
		return this.board;
	}
}