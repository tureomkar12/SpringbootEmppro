package org.Omkarpro.emproject;

import org.hibernate.internal.build.AllowNonPortable;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllowNonPortable
public class Employee {
    private Long id;
    private String name;
    private String phone;
    private String email;

}
