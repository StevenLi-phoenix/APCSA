import java.util.Arrays;

public class character extends human{
    private Mood[] moodList = new Mood[10];
    private UUID uuid = new UUID();

    @Override
    public String toString() {
        return "character [moodList=" + Arrays.toString(moodList) + ", uuid=" + uuid + "]";
    }
    private void initMoodList() {
        for (int i =0; i<moodList.length; i++){
            moodList[i] = new Mood();
        }
    }
    public Mood getFirstMood() {
        return moodList[0];
    }
    public Mood[] getMoodList() {
        return moodList;
    }
    public String getMoodList_Array() {
        return Arrays.toString(moodList);
    }
    public void setMoodList(Mood[] moodList) {
        this.moodList = moodList;
    }
    public character(){
        super("Null", -1.0, "male");
        initMoodList();
    }
    public character(String name, Double age, String gender){
        super(name, age, gender);
        initMoodList();
    }
    public character(String name, String gender){
        super(name, -1.0, gender);
        initMoodList();
    }
    public character(String name, Double age){
        super(name, age, "male");
        initMoodList();
    }
    public character(String name){
        super(name, -1.0, "male");
        initMoodList();
    }
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
