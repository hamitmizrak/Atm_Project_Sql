package com.hamitmizrak.atm.dto;

import com.hamitmizrak.atm.util.BaseField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//Lombok
@Data
@AllArgsConstructor
@Builder
public class RegisterDto extends BaseField {

    //field
    private String username;
    private String password;
    private String telephoneNumber;
    private String emailAddress;

    //parametresiz constructor
    public RegisterDto() {
    }

    //parametreli constructor
    public RegisterDto(Long id, String username, String password, String telephoneNumber, String emailAddress) {
        super(id);
        this.username = username;
        this.password = password;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }

    //toString
    @Override
    public String toString() {
        return "RegisterDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                "} " + super.toString();
    }
}
