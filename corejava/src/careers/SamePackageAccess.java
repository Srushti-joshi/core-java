package careers;

public class SamePackageAccess {
    public void accessOccupation() {
        Occupation occupation = new Occupation();

        occupation.setJobTitle("Data Scientist");
        occupation.setSalary(95000.00);


        System.out.println("Job Title: " + occupation.getJobTitle());
        System.out.println("Salary: $" + occupation.getSalary());
    }
}
