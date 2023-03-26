package irs;

public class Legal extends AdressBook {

    private Integer nEmployees;

    public Legal() {
        super();
    }

    public Legal(String namePF, Double annualIncome, Integer nEmployees) {
        super(namePF, annualIncome);
        this.nEmployees = nEmployees;
    }

    public Integer getnEmployees() {
        return nEmployees;
    }

    public void setnEmployees(Integer nEmployees) {
        this.nEmployees = nEmployees;
    }

    @Override
    public Double taxesPaid() {
        Double calcule;

        if ( nEmployees < 10){
            calcule = getAnnualIncome() * 0.16;
        }
        else{
            calcule = getAnnualIncome() * 0.14;
        }
        return calcule;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%.2f", taxesPaid());
    }
}
