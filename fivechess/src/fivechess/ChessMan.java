package fivechess;


/**
 * ���ӽӿ�
 * 
 * @author 
 * @version  1.0
 */
public interface ChessMan {
	
	/**
	 * @return String ������߰��������
	 */
	public String getChessMan();
}
                  /**
	 * @�����࣬ʵ�����ӽӿ�
	 */
class Black implements ChessMan{
        private String black;   
        /**
         * @˽�л����캯����ͨ�������ṩ�ľ�̬�����������
         */
        private  Black(String black){
              this.black=black;
        }
       public String getChessMan(){
             return this.black;
        }
       public static ChessMan getBlack(){
            return new Black("��");
      }
}
                   /**
	 * @�����࣬ʵ�����ӽӿ�
	 */
class White implements ChessMan{
        private String white;
        private White(String white){
             this.white=white;
       }
       public String getChessMan(){
            return this.white;
       }
       public static ChessMan getWhite(){
           return new White("��");
        }
}