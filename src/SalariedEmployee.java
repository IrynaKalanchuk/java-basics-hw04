public class SalariedEmployee extends Employee{
  private String socialSecurityNumber;
  private double fixedMonthlyPayment;
  // TODO fix class declaration and declare variables here

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
    // TODO fill in code here
  }

  public String getSocialSecurityNumber() {
    // TODO fill in code here and replace the return statement
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    // TODO fill in code here
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    // TODO fill in code here and replace the return statement
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    // TODO fill in code here
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public void calculatePay() {
    avgMonthlySalary = fixedMonthlyPayment;
  }

  // TODO fill in code here
}
