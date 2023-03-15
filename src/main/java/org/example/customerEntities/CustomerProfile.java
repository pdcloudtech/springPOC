package org.example.customerEntities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import java.util.ArrayList;

@Entity //class mapped to a table for H2 - in mem database
@Data // handles tostring(), equals(),getters and setters for POJO's
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerProfile {

    @Id // specifies the primary key on the entity
    @NonNull
    private String name;

    private String fname;
    //@Column(name="phoneNumbers")
    private ArrayList<String> phoneNumbers;
    //@Column(name="skill")
    private String skill;
}
