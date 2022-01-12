import java.util.Date;

public class UUID {
    private static final String AlphaBataList = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private String uuid;
    private Date createDate;

    private String GenerateUUIDAlphaBataPart(int listLong) {
        assert listLong >= 0;
        String ABlist = "";
        for(int i=0; i<=listLong; i++) {ABlist+=AlphaBataList.charAt((int)(Math.random()*52));}
        return ABlist;
    }
    public UUID() {
        createDate = new Date();
        uuid = "" + GenerateUUIDAlphaBataPart(6) + createDate.getTime();
    }
    public String toString() {
        return uuid;
    }
    public String getCreateDate() {
        return "" + createDate.getTime();
    }
    public String getUUID() {
        return uuid;
    }
    
}
