public class SecurityCredentials {
    private String text = "";

    public SecurityCredentials(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
    /* after referencing examples i saw that this class was composed of
    just one text string, making all of this code i wrote unnecessary

    String username;
    String password;
    String userClass;

    public SecurityCredentials(String username, String password, String userClass)
    {
        this.username = username;
        this.password = password;
        this.userClass = userClass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }*/

