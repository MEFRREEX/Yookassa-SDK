# Example of getting payments

Getting payments is done by creating a GetPaymentsRequest request. Here is an example of how it works:

```java
import com.mefrreex.yookassa.api.Yookassa;
import com.mefrreex.yookassa.api.model.payment.*;

public class GetPaymentsExample {

    public static void main(String[] args) {
        Yookassa yookassa = Yookassa.create(1, "");
        PaymentList payments = yookassa.getPayments(GetPaymentsRequest.builder().build());

        for (Payment payment : payments.getPayments()) {
            System.out.println("Payment with Id: " + payment.getId());
        }
    }
}
```

If needed, you can pass additional parameters to the request builder to filter the result:
```java
import com.mefrreex.yookassa.api.Yookassa;
import com.mefrreex.yookassa.api.model.payment.*;

import java.time.Instant;

public class GetPaymentsExample {

    public static void main(String[] args) {
        Yookassa yookassa = Yookassa.create(1, "");

        GetPaymentsRequest request = GetPaymentsRequest.builder()
                .createdAtLt(Instant.parse("2018-07-18T10:51:18.139Z")) // Filter payments from the specified date
                .limit(50) // Limit for 50 payments
                .build();

        PaymentList payments = yookassa.getPayments(request);
        for (Payment payment : payments.getPayments()) {
            System.out.println("Payment with Id: " + payment.getId());
        }
    }
}
```