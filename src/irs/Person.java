package irs;

public class Person extends AdressBook {

    private Double healthExpenses;

    public Person() {
        super();
    }

    public Person(String namePF, Double annualIncome, Double healthExpenses) {
        super(namePF, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double taxesPaid() {
        double calcule;

        if (getAnnualIncome() < 20000.0){
            calcule = getAnnualIncome() * 0.15 - healthExpenses * 0.5;
        }
        else{
            calcule = getAnnualIncome() * 0.25 - healthExpenses * 0.5;
        }
        return calcule;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%.2f", taxesPaid());
    }

}
