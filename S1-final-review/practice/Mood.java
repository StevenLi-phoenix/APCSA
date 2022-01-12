public class Mood{
    // 喜悦、愤怒、悲伤、恐惧、厌恶、惊奇、羨慕
    private double joy;
    private double angry;
    private double sadness;
    private double fear;
    private double hate;
    private double surprise;
    private double envy;

    public Mood() {
        joy = 0.0;
        angry = 0.0;
        sadness = 0.0;
        fear = 0.0;
        hate = 0.0;
        surprise = 0.0;
        envy = 0.0;
    }
    public Mood(String Prefeb){
        if(Prefeb.equals("angry"))
        {
            angry=1.0;
        }
    }
    @Override
    public String toString() {
        return "Mood [angry=" + angry + ", envy=" + envy + ", fear=" + fear + ", hate=" + hate + ", joy=" + joy
                + ", sadness=" + sadness + ", surprise=" + surprise + "]";
    }
    
}
