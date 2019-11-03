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
public class FoldPlayer implements Player {
    @Override
    public String getName() {
        return "弃牌狗";
    }

    @Override
    public String getStuNum() {
        return "2018233333";
    }

    @Override
    public void onGameStart(Manager manager, int totalPlayer) {

    }

    @Override
    public int bet(int time, int round, int lastPerson, int moneyOnDesk, int moneyYouNeedToPayLeast, List<Poker> pokers) {
        //妈妈说不要赌博，我要弃牌
        return 0;
    }

    @Override
    public void onResult(int time, boolean isWin, List<Poker> pokers) {

    }
}

