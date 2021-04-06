package step4.domain.money;

import step4.exception.InputNegativeAmountException;

public final class Money {

    private static final int ZERO = 0;

    private final int money;

    private Money(int money) {
        validateNegative(money);
        this.money = money;
    }

    public static final Money valueOf(int money) {
        return new Money(money);
    }

    public final int purchaseQuantity(int purchaseAmount) {
        validateNegative(purchaseAmount);
        return money / purchaseAmount;
    }


    private final void validateNegative(int money) {
        if (money < ZERO) {
            throw new InputNegativeAmountException();
        }
    }


}