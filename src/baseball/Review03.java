package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam baseballteam = new BaseBallTeam();
        baseballteam.setBaseBallTeamName("東京ヤクルトスワローズ");
        baseballteam.setWin(80);
        baseballteam.setLose(59);
        baseballteam.setDraw(4);
        
        baseballteam.report();
        
        BaseBallTeam baseballteam1 = new BaseBallTeam();
        baseballteam1.setBaseBallTeamName("横浜ベイスターズ");
        baseballteam1.setWin(73);
        baseballteam1.setLose(68);
        baseballteam1.setDraw(2);
        
        baseballteam1.report();
        
        BaseBallTeam baseballteam2 = new BaseBallTeam();
        baseballteam2.setBaseBallTeamName("阪神タイガース");
        baseballteam2.setWin(68);
        baseballteam2.setLose(71);
        baseballteam2.setDraw(4);
        
        baseballteam2.report();
        
        BaseBallTeam baseballteam3 = new BaseBallTeam();
        baseballteam3.setBaseBallTeamName("読売ジャイアンツ");
        baseballteam3.setWin(68);
        baseballteam3.setLose(72);
        baseballteam3.setDraw(3);
        
        baseballteam3.report();
        
        BaseBallTeam baseballteam4 = new BaseBallTeam();
        baseballteam4.setBaseBallTeamName("広島東洋カープ");
        baseballteam4.setWin(66);
        baseballteam4.setLose(74);
        baseballteam4.setDraw(3);
        
        baseballteam4.report();
        
        BaseBallTeam baseballteam5 = new BaseBallTeam();
        baseballteam5.setBaseBallTeamName("中日ドラゴンズ");
        baseballteam5.setWin(66);
        baseballteam5.setLose(75);
        baseballteam5.setDraw(2);
        
        baseballteam5.report();
    }
}
