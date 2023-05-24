
package bancobrasil;

public class Gerente extends Usuario {
    
    private String login;
    private String password;

    
     public Gerente(String login, String password, String n, String s, String t) {
        super(n, s, t);
        this.login = login;
        this.password = password;
    }
     
    public Gerente(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
