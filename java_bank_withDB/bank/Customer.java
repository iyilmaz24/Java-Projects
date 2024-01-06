package java_bank_withDB.bank;


public class Customer {

    private int id;
    private String username;
    private String password;
    private String name;
    private int accountId;
    private boolean authenticated;

    public Customer(int id, String username, String password, String name, int accountId ){
        setId(id);
        setUsername(username);
        setPassword(password);
        setName(name);
        setAccountId(accountId);
        setAuthenticated(false);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public boolean isAuthenticated() {
        return authenticated;
    }
    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
        
}

