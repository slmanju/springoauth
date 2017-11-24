package com.manjula.springoauth.view;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmployeeView {

    private String id;
    private String firstName;
    private String lastName;

    public static EmployeeView instance() {
        return new EmployeeView();
    }

}
