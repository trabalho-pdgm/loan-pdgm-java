package br.cesul.testsloan;

import br.cesul.loan.LocalLoan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalLoanTest {

    @Test
    @DisplayName("Testa quando deve ser o pagamento final.")
    void testGetTotalLoan() {
        var loan = new LocalLoan(
                "José Pedro",
                2000D,
                2,
                5D,
                10D
        );

        assertEquals(2300D, loan.getTotalLoan());
    }
}
