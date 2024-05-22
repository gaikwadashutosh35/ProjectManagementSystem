package com.ashu.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String fullName;
        private String email;
        
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private String password;

        @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
        private List<Issue>assignedIssues = new ArrayList<>();
        private int projectSize;


}
