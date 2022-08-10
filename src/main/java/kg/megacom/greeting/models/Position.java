package kg.megacom.greeting.models;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "positions")

public class Position {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "position_id")
    Long id;

    String name;
    boolean active;

}
