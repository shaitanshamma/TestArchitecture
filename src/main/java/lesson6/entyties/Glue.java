package lesson6.entyties;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "glue_tbl")
public class Glue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title_fld")
    private String title;

    @Column(name = "width_fld")
    private double width;

    @Column(name = "length_fld")
    private double length;

    @ManyToOne(optional = false)
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
