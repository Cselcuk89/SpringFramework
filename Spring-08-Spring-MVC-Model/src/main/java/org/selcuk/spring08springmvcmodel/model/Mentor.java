package org.selcuk.spring08springmvcmodel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.selcuk.spring08springmvcmodel.enums.Gender;

@Data
@AllArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}
