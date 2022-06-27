package lk.ijse.hibernate.view.tm;

import lk.ijse.hibernate.entity.Room;
import lk.ijse.hibernate.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ReserveTM {
    private String res_Id;
    private Student students;
    private Room rooms;
    private int res_qty;
}
