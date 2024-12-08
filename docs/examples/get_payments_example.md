# Example of getting payments

Getting payments is done by creating a GetPaymentsRequest request. If needed, you can pass additional parameters to the request builder to filter the result. Here is an example of how it works:

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