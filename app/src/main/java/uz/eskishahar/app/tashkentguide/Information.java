package uz.eskishahar.app.tashkentguide;

public class Information {

    private String mName;

    private String mAddress;

    private String mWebsite;

    private String mContacts;

    private String mWorkTime;

    private String mInfo;

    private int mImage;

    public Information(String name, String address, String website, String contacts, String workTime, String info, int image) {
        this.mName = name;
        this.mAddress = address;
        this.mWebsite = website;
        this.mContacts = contacts;
        this.mWorkTime = workTime;
        this.mInfo = info;
        this.mImage = image;
    }

    public String getInfo() {
        return mInfo;
    }

    public String getWorkTime() {
        return mWorkTime;
    }

    public String getContacts() {
        return mContacts;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getName() {
        return mName;
    }

    public int getImage() {
        return mImage;
    }
}
