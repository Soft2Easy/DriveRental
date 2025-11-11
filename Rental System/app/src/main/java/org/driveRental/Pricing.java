package org.driveRental;

/**
 * Represents the pricing details of a vehicle in the rental system.
 */
public class Pricing {
    private double ratePerDay;
    private double ratePerWeek;
    private double ratePerMonth;
    private String currency;
    private double costPerExtraMile;
    private double costPerExtraKm;
    private double securityDeposit;

    public Pricing(double ratePerDay, double ratePerWeek, double ratePerMonth, String currency,
                   double costPerExtraMile, double costPerExtraKm, double securityDeposit) {
        this.ratePerDay = ratePerDay;
        this.ratePerWeek = ratePerWeek;
        this.ratePerMonth = ratePerMonth;
        this.currency = currency;
        this.costPerExtraMile = costPerExtraMile;
        this.costPerExtraKm = costPerExtraKm;
        this.securityDeposit = securityDeposit;
    }

    public Pricing() {
    }

    public double getRatePerWeek() {
        return ratePerWeek;
    }

    public void setRatePerWeek(double ratePerWeek) {
        this.ratePerWeek = ratePerWeek;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(double ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    public double getRatePerMonth() {
        return ratePerMonth;
    }

    public void setRatePerMonth(double ratePerMonth) {
        this.ratePerMonth = ratePerMonth;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getCostPerExtraMile() {
        return costPerExtraMile;
    }

    public void setCostPerExtraMile(double costPerExtraMile) {
        this.costPerExtraMile = costPerExtraMile;
    }

    public double getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(double securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public double getCostPerExtraKm() {
        return costPerExtraKm;
    }

    public void setCostPerExtraKm(double costPerExtraKm) {
        this.costPerExtraKm = costPerExtraKm;
    }
}
