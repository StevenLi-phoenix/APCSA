public class GameSpinner{
    private int sectors;
    private int runcount;
    private int cache = 0;
    public GameSpinner(int sectors){
        this.sectors = sectors;
    }
    public int currentRun() {
        return runcount;
    }
    public int spin(){
        int ans = (int)(Math.random() * sectors) + 1;
        if(ans == cache){
            runcount++;
        }else{
            runcount = 0;
        }
        return ans;
    }
}
