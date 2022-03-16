package br.julio.starrebelde.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rebel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;
    private Integer age;

    @NotNull
    private Enum gender;

    @NotNull
    private String location;

    @NotNull
    private String baseGalaxy;

    private boolean betrayer;
}
