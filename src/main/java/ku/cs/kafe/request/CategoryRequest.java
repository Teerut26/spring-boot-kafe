// Teerut Srithongdee 6510405601
package ku.cs.kafe.request;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CategoryRequest {


    @NotBlank
    private String name;


}

