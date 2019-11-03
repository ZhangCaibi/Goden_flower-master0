package LV1;

public class main {
    public static void main(String[] args) {
        TelePhone phone1 = new smartPhone();
        phone1.call();
        phone1.message();
        TelePhone phone2 = new cellPhone();
        phone2.call();
        phone2.message();
        playGame P1 = new smartPhone();
        P1.playgame();
        playGame P2 = new computer();
        P2.playgame();
        playGame P3 = new playGame() {
            @Override
            public void playgame() {
                System.out.println("PSP也可以打游戏！");
            }
        };
        P3.playgame();
        new playGame() {
            @Override
            public void playgame() {
                System.out.println("智能手表竟然也可以打游戏！！");
            }
        }.playgame();
    }
}
