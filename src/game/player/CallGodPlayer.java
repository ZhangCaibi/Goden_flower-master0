package game.player;

import game.Player;
import game.Poker;
import java.util.List;

/**
 * Created by : zixuan
 * Created on : 2019/10/26
 * Created for : Games.
 * Enjoy it !!!!
 */
public class CallGodPlayer implements Player {
    @Override
    public String getName() {
        return "跟注帝";
    }

    @Override
    public String getStuNum() {
        return "2018233333";
    }

    @Override
    public void onGameStart(game.Manager manager, int totalPlayer) {

    }

    @Override
    public int bet(int time, int round, int lastPerson, int moneyOnDesk, int moneyYouNeedToPayLeast, List<Poker> pokers) {
        return moneyYouNeedToPayLeast;
    }

    @Override
    public void onResult(int time, boolean isWin, List<game.Poker> pokers) {

    }
}

