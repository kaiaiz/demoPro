package user;
import java.util.Scanner;
/**
 * Created by kaiai on 16-5-19.
 */
public  class Start {
    private String number = "17835424469";
    private String password = "1028";
    private int amount=10000;
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号");
        String n = scanner.next();
        System.out.println("请输入密码");
        String p = scanner.next();
        if (n.equals(number) && p.equals(password)) {
            System.out.println("登录成功！");
            select();
        }
            else {
            System.out.println("请重新确认账号或密码");
        }
    }

private void select() {
    System .out.println("****1  查询" + "\n" + "****2  取款" + "\n" + "****3  存款" + "\n" + "****4  修改密码" + "\n" + "****0   退出" + "\n");
    Scanner scanner = new Scanner(System.in);
    byte choice = scanner.nextByte();
    switch (choice) {
        case 1:
            this.inquire();
            break;
        case 2:
            this.desposit();
            break;
        case 3:
            this.withDraw();
            break;
        case 4:
            this.changPassword();
            break;
        case 0:
            return;
        default:
            System.out.println("请输入正确的序号");
    }
}
    private void inquire(){
System.out.println("余额为："+this.amount);
    this.select();
    }
   private void desposit(){
       System.out.println("请输入取款金额");
       Scanner scanner=new Scanner(System.in);
   int get=scanner.nextInt();
if(amount>0)
{
    if(get%100==0&&get<=500) {
        this.amount = this.amount - get;
        this.select();
    }
    else
        System.out.println("请输入大于100的钞票");
    this.desposit();
}
       else
System.out.println("余额不足！");
   this.select();
   }
  private void withDraw(){
      System.out.println("请输入存款金额");
      Scanner scanner=new Scanner(System.in);
      int save=scanner.nextInt();
      if(save>0&&save%100==0)
      {this.amount=save+amount;
          this.select();}
  else
          {
              System.out.println("请输入大于100的钞票。");
              this.withDraw();
          }
          }
  private void changPassword(){
      System.out.println("将要进行修改密码的操作");
      System.out.println("请输入原密码");
      Scanner scanner=new Scanner(System.in);
      String password=scanner.next();
      if(password.equals(this.password)) {
          System.out.println("请输入修改后的密码");
          String modify=scanner.next();
          this.password = modify;
          System.out.println("修改密码成功！");
          this.select();
      }
      else {
          System.out.println("输入密码有误");
      this.changPassword();
      }
      }
}