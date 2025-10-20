package patterns.structural.bridge.example1;

import java.math.BigDecimal;

import patterns.structural.bridge.example1.abstraction.BasicPayment;
import patterns.structural.bridge.example1.abstraction.Payment;
import patterns.structural.bridge.example1.abstraction.SecurePayment;
import patterns.structural.bridge.example1.implementation.CryptoPaymentSystem;
import patterns.structural.bridge.example1.implementation.PayPalPaymentSystem;
import patterns.structural.bridge.example1.implementation.StripePaymentSystem;

/*
    Abstraction: Payment, BasicPayment, SecurePayment
    Implementation: PaymentSystem, CryptoPaymentSystem, PayPalPaymentSystem, StripePaymentSystem
 */
public class Application {
    public static void main(String[] args) {
        Payment basePayPalPayment = new BasicPayment(new PayPalPaymentSystem());
        Payment stripeSecurePayment = new SecurePayment(new StripePaymentSystem());
        Payment cryptoSecurePayment = new SecurePayment(new CryptoPaymentSystem());

        basePayPalPayment.pay(BigDecimal.valueOf(300));
        basePayPalPayment.refund(BigDecimal.valueOf(300));

        System.out.println();

        stripeSecurePayment.pay(BigDecimal.valueOf(4500));
        stripeSecurePayment.refund(BigDecimal.valueOf(4500));

        System.out.println();

        cryptoSecurePayment.pay(BigDecimal.valueOf(10_000));
        cryptoSecurePayment.refund(BigDecimal.valueOf(10_000));
    }
}
