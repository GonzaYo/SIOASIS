package web.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AccesControler {

    public String login;
    public String key;

    public AccesControler() {
    }

    public String getLogin() {
        return login;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String validate() {
        String flag = "error";
        if (this.login.equalsIgnoreCase("Ian") && this.key.equalsIgnoreCase("12345")) {
            flag = "wellcome";
        }
        return flag;
    }
}
