package web.forms;

/*Класс является техническим и представляет из себя кеш для сбора данных о пользователе в
* период одной сессии регистрации*/
public class CustomerForm {

    /*Customer data*/
    private String name;
    private String surname;
    private Integer age;

    /*Account data*/
    private String login;
    private String password;

    /*Credit data*/
    private Long credit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }
}
