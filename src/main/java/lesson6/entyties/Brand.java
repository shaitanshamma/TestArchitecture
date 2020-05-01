package lesson6.entyties;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(name = "brand_tbl")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title_fld")
    @NotNull
    private String title;

    @OneToMany(
            mappedBy = "brand",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Film> films;

    @OneToMany(
            mappedBy = "brand",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Glue> glues;
}
