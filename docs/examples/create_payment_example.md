# Example of creating a payment

A payment is created by creating a CreatePaymentRequest and passing the required parameters to it. Here is an example of how it works:

```java
import com.mefrreex.yookassa.api.Yookassa;
import com.mefrreex.yookassa.api.model.Amount;
import com.mefrreex.yookassa.api.model.Currency;
import com.mefrreex.yookassa.api.model.Locale;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationRedirect;
import com.mefrreex.yookassa.api.model.payment.*;

import java.math.BigDecimal;

public class CreatePaymentExample {

    public static void main(String[] args) {
        Yookassa yookassa = Yookassa.create(1, "");

        CreatePaymentRequest request = CreatePaymentRequest.builder()
                .amount(Amount.of(BigDecimal.valueOf(1), Currency.EUR))
                .description("New payment description")
                .confirmation(ConfirmationRedirect.create(Locale.ENGLISH, "https://example.com"))
                .build();

        Payment payment = yookassa.createPayment(request);

        Confirmation confirmation = payment.getConfirmation();
        if (confirmation instanceof ConfirmationRedirect redirect) {
            System.out.println("Your payment link: " + redirect.getConfirmationUrl());
        }
    }
}
```