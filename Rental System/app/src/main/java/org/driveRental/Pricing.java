package org.driveRental;

public class Pricing {
    private String ratePerDay;
    private String ratePerWeek;
    private String ratePerMonth;
    private String currency;
    private String costPerExtraMile;
    private String costPerExtraKm;
    private String securityDeposit;

    public String getRatePerWeek() {
        return ratePerWeek;
    }

    public void setRatePerWeek(String ratePerWeek) {
        this.ratePerWeek = ratePerWeek;
    }

    public String getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(String ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    public String getRatePerMonth() {
        return ratePerMonth;
    }

    public void setRatePerMonth(String ratePerMonth) {
        this.ratePerMonth = ratePerMonth;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCostPerExtraMile() {
        return costPerExtraMile;
    }

    public void setCostPerExtraMile(String costPerExtraMile) {
        this.costPerExtraMile = costPerExtraMile;
    }

    public String getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(String securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public String getCostPerExtraKm() {
        return costPerExtraKm;
    }

    public void setCostPerExtraKm(String costPerExtraKm) {
        this.costPerExtraKm = costPerExtraKm;
    }
}
