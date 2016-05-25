package fivechess;


/**
 * 棋子接口
 * 
 * @author 
 * @version  1.0
 */
public interface ChessMan {
	
	/**
	 * @return String 黑棋或者白棋抽象函数
	 */
	public String getChessMan();
}
                  /**
	 * @黑棋类，实现棋子接口
	 */
class Black implements ChessMan{
        private String black;   
        /**
         * @私有化构造函数，通过类中提供的静态函数单例设计
         */
        private  Black(String black){
              this.black=black;
        }
       public String getChessMan(){
             return this.black;
        }
       public static ChessMan getBlack(){
            return new Black("●");
      }
}
                   /**
	 * @黑棋类，实现棋子接口
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
           return new White("○");
        }
}