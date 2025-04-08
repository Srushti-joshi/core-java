package backgroundcheck;
import careers.Occupation;

public class DifferentPackageAccess {

        public void accessOccupation() {
            Occupation occupation = new Occupation();

            System.out.println("Job Title: " + occupation.getJobTitle());
            System.out.println("Salary: $" + occupation.getSalary());
        }
}
