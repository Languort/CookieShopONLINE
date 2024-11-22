package model;

import sun.security.util.Password;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String name;


    private boolean isAdmin = false;
    private boolean isValidate = false;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }




    public String getUsername() {return username;}
    public String getPassword() {return password;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}
    public String getAddress() {return address;}
    public String getName(){return name;}


    public boolean isAdmin() {return isAdmin;}
    public boolean isValidate() {return isValidate;}

    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}
    public void setEmail(String email) {this.email = email;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setAddress(String address) {this.address = address;}
    public void setName(String name) {this.name = name;}
    public void setAdmin(boolean isAdmin) {this.isAdmin = isAdmin;}
    public void setValidate(boolean isValidate) {this.isValidate = isValidate;}


    public User(int id, String username, String password, String email, String phone, String address,String name, boolean isAdmin, boolean isValidate) {

        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.isAdmin = isAdmin;
        this.isValidate = isValidate;

    }


    //用于创建成功后
    public User(String username, String password, String email, String phone, String address, String name, boolean isAdmin, boolean isValidate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.name = name;
        this.isAdmin = false;
        this.isValidate = false;

    }

    public User() {super();}
}
