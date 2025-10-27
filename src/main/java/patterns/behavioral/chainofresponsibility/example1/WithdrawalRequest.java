package patterns.behavioral.chainofresponsibility.example1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class WithdrawalRequest {
    private BigDecimal amount;
    private String purpose;
}
