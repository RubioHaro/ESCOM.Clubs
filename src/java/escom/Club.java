package escom;

public class Club {

    private String ID_CLUB;
    private String NAME;
    private String DESCRIPTION;
    private String LOGO;
    private String OWNER;
    private String MAX_MEMBERS;
    private String CURRENT_MEMBERS;
    private String PLACE;
    private String CREATION_DATE;
    private String STATUS;

    public Club() {
    }

    public Club(String ID_CLUB, String NAME, String DESCRIPTION, String LOGO, String OWNER, String MAX_MEMBERS,
            String CURRENT_MEMBERS, String PLACE, String CREATION_DATE, String STATUS) {
        this.ID_CLUB = ID_CLUB;
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.LOGO = LOGO;
        this.OWNER = OWNER;
        this.MAX_MEMBERS = MAX_MEMBERS;
        this.CURRENT_MEMBERS = CURRENT_MEMBERS;
        this.PLACE = PLACE;
        this.CREATION_DATE = CREATION_DATE;
        this.STATUS = STATUS;
    }


    public String getID_CLUB() {
        return ID_CLUB;
    }

    public void setID_CLUB(String iD_CLUB) {
        ID_CLUB = iD_CLUB;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String nAME) {
        NAME = nAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String dESCRIPTION) {
        DESCRIPTION = dESCRIPTION;
    }

    public String getLOGO() {
        return LOGO;
    }

    public void setLOGO(String lOGO) {
        LOGO = lOGO;
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String oWNER) {
        OWNER = oWNER;
    }

    public String getMAX_MEMBERS() {
        return MAX_MEMBERS;
    }

    public void setMAX_MEMBERS(String mAX_MEMBERS) {
        MAX_MEMBERS = mAX_MEMBERS;
    }

    public String getCURRENT_MEMBERS() {
        return CURRENT_MEMBERS;
    }

    public void setCURRENT_MEMBERS(String cURRENT_MEMBERS) {
        CURRENT_MEMBERS = cURRENT_MEMBERS;
    }

    public String getPLACE() {
        return PLACE;
    }

    public void setPLACE(String pLACE) {
        PLACE = pLACE;
    }

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATION_DATE(String cREATION_DATE) {
        CREATION_DATE = cREATION_DATE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String sTATUS) {
        STATUS = sTATUS;
    }

    @Override
    public String toString() {
        return "Club [ID_CLUB=" + ID_CLUB + ", NAME=" + NAME + ", DESCRIPTION=" + DESCRIPTION + ", LOGO=" + LOGO
                + ", OWNER=" + OWNER + ", MAX_MEMBERS=" + MAX_MEMBERS + ", CURRENT_MEMBERS=" + CURRENT_MEMBERS
                + ", PLACE=" + PLACE + ", CREATION_DATE=" + CREATION_DATE + ", STATUS=" + STATUS + "]";
    }
    
}
