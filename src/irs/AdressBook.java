package irs;

import java.text.Format;

public abstract class AdressBook {

    private String namePF;
    private Double annualIncome;

    public AdressBook() {
    }

    public AdressBook(String namePF, Double annualIncome) {
        this.namePF = namePF;
        this.annualIncome = annualIncome;
    }

    public String getNamePF() {
        return namePF;
    }

    public void setNamePF(String namePF) {
        this.namePF = namePF;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract Double taxesPaid();

    @Override
    public String toString() {
        return namePF + " $ ";
    }
}

