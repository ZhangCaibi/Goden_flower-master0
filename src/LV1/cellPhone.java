package LV1;

public class cellPhone extends TelePhone {

    @Override
    public void call() {
        System.out.println("小灵通可以打电话。。。");
    }

    @Override
    public void message() {
        System.out.println("小灵通可以发短信。。。");
    }
}
