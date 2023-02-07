package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    public BaseBallTeam() {
    }
    
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    
    public double getRate() {
        int getRate = this.win / (this.win + this.lose);
        return getRate;
    }
    
    public void report() {
        System.out.println(this.name + "の" + "2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" +  (double)this.win / (this.win + this.lose) + "です。");
    }
    
    public String getBaseBallTeamName() {
        return name;
    }
    
    public void setBaseBallTeamName(String name) {
        this.name = name;
    }
    
    public int getWin() {
        return win;
    }
    
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    
    public void setLose(int lose) {
        this.lose = lose;
    }
    
    public int getDraw() {
        return draw;
    }
    
    public void setDraw(int draw) {
        this.draw = draw;
    }
}
