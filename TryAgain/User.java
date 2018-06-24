package TryAgain;
public class User {
    private String userName;
    private String realName;
    private String email;
    private String avatarPicURL;

    public User(String userName, String realName, String email, String avatarPicURL) {
        this.userName = userName;
        this.realName = realName;
        this.email = email;
        this.avatarPicURL = avatarPicURL;
    }
    public String getUserName() {
        return userName;
    }
    public String getRealName() {
        return realName;
    }
    public String getEmail() {
        return email;
    }
    public String getAvatarPicURL() {
        return avatarPicURL;
    }
}