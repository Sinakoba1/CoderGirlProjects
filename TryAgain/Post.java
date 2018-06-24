package TryAgain;
public class Post {
    private String userPost;
    private String userName;
    public Post(String userPost, String userName)
    {
        this.userName = userName;
        this.userPost = userPost;
    }
    public String getPost()
    {
        return this.userName +  " - " + this.userPost;
    }
    public String getUserName() {
        return userName;
    }
}
