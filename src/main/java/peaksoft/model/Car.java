package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "car_id", sequenceName = "car_id_seq", allocationSize = 1)
    private Long id;
    private String model;
    private BigDecimal price;
    @ManyToOne(cascade = {REFRESH, MERGE, DETACH, PERSIST})
    private Company company;
}
