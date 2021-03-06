package cn.mageek.pojo;

import cn.mageek.annotation.PastLocalDate;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Scope;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Form  implements Serializable{

    @Size(min = 2,max = 20)
    private String name;
    @Email
    @NotEmpty
    private String email;
    @NotNull
    @PastLocalDate
    private LocalDate birthDate ;
    private List<String> hobbies;

    //构造函数加了内容的话，表单的placeholder 就不管用了
    public Form() {
        this.name = "";
        this.email = "";
        this.birthDate = LocalDate.now();
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "name:" + name + " email:" + email + " birthDate:" + birthDate.toString() + " hobbies:" + hobbies.toString();
    }
}
