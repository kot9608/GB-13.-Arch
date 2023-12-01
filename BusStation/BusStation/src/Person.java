public class Person {
    private int id;
    private String fio;
    private Long cardNumber;
    private Long hashPass;
    private String login;

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;

    }
    public Long getHashPass() {
        return hashPass;
    }
    public void setHashPass(Long hashPass) {
        this.hashPass = hashPass;

    }
}
