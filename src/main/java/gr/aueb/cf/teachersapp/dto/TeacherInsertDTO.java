package gr.aueb.cf.teachersapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherInsertDTO {

    @NotNull(message = "Name can not be Null")
    @Size(min = 2, message = "Name needs to have at least more than two letters")
    private String firstname;

    @NotNull(message= "Lastname can not be Null")
    @Size(min = 2, message = "Lastname needs to have at least more than two letters")
    private String lastname;

    @Pattern(regexp = "\\d{9,}", message = "VAT can not be less than nine digits")
    private String vat;
    @NotNull(message = "Region can not be null")
    private Long regionId;
}
