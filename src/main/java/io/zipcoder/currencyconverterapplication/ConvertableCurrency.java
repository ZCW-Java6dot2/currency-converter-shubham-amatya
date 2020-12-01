package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {

        Double rateOfGivenCurrency = currencyType.getRate(); //rate of currency passed (base currency) as the argument
        Double rateOfNewCurrency = CurrencyType.getTypeOfCurrency(this).getRate(); // rate of currency to be converted to (target currency)

        return rateOfGivenCurrency/rateOfNewCurrency;
    }
    CurrencyType getCurrencyType();
}
