package find.itTeam.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class CreateNewPost {

    private String content;
    private LocalDate dateTime;

}