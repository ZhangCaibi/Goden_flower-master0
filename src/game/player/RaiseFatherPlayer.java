package game.player;

import game.Manager;
import game.Player;
import game.Poker;
import java.util.List;

/**
 * Created by : zixuan
 * Created on : 2019/10/26
 * Created for : Games.
 * Enjoy it !!!!
 */
public class RaiseFatherPlayer implements Player {
    @Override
    public String getName() {
        return "加注狗";
    }

    @Override
    public String getStuNum() {
        return "2019213333";
    }

    @Override
    public void onGameStart(Manager manager, int totalPlayer) {

    }

    @Override
    public int bet(int time, int round, int lastPerson, int moneyOnDesk, int moneyYouNeedToPayLeast, List<Poker> pokers) {
        //爸爸给我说玩牌要霸气，不要看牌，直接加倍
        return 3 * moneyYouNeedToPayLeast;
    }

    @Override
    public void onResult(int time, boolean isWin, List<Poker> pokers) {

    }
}

