package org.example.customerEntities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerProfile {

    @Id
    @NonNull
    private String name;

    private String fname;
    //@Column(name="phoneNumbers")
    private ArrayList<String> phoneNumbers;
    //@Column(name="skill")
    private String skill;
}
