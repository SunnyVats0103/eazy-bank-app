package dev.sunny.core.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String username;
        private String email;
        private String pwd;
        private String role;
}
