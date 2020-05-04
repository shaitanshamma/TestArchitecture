package lesson6.entyties;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "film_tbl")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title_fld")
    private String title;

    @Column(name = "color_fld")
    private String color;

    @Column(name = "width_fld")
    private double width;

    @Column(name = "length_fld")
    private double length;

    @ManyToOne(optional = false)
    private Brand brand;
}
