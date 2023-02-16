package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "companies")
@Getter
@Setter
@NoArgsConstructor
public class Company {
    @Id
    @SequenceGenerator(name = "company_gen", sequenceName = "company_seq", allocationSize = 1, initialValue = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_id_seq")
    private Long id;
    private String name;
    private String country;
    private String logo;
    @OneToMany(mappedBy = "company", cascade = {CascadeType.ALL})
    private List<Car> carList;


}
