package lk.ijse.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Reserve {
    @Id
    private String res_Id;
    private LocalDate date;
    private String status;
    @ManyToOne
    private Student students;
    @ManyToOne
    private Room rooms;
    private int res_qty;


}
