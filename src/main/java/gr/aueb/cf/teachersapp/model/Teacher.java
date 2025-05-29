package gr.aueb.cf.teachersapp.model;

import gr.aueb.cf.teachersapp.model.static_data.Region;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "table")
public class Teacher extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String uuid;

    @Column(unique = true)
    private String vat;
    private String firstname;
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "region_id")
     private Region region;

    @PrePersist
    public void initializeUUID() {
        if (uuid == null) uuid = UUID.randomUUID().toString();
    }
}
