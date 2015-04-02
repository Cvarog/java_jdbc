package finaltest;

/**
 * Created by Admin on 02.04.2015.
 */
public class User {

    public User(){

    }
    private String name;
    private String sername;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                '}';
    }
}
