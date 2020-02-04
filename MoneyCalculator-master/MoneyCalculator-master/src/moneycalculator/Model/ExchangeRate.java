package moneycalculator.model;

import java.util.Date;

public class ExchangeRate {
    
    private Currency from;
    private Currency to;
    private Date date;
    private double rate;

    public ExchangeRate(Currency from, Currency to, Date date, double rate) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.rate = rate;
    }
    

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Date getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }
}