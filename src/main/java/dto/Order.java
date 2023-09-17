package dto;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Builder
public class Order {
    private String lipstick;
    private String shampoo;
    private String gel;
    private String soap;
    private String mascara;
}
