package LV1;

public class smartPhone extends  TelePhone implements playGame{

    @Override
    public void call() {
        System.out.println("智能手机可以打电话！");
    }

    @Override
    public void message() {
        System.out.println("智能手机可以发短信！");
    }

    @Override
    public void playgame() {
        System.out.println("智能手机可以打王者荣耀！！！");
    }
}
