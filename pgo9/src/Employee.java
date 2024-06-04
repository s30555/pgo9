import java.time.Year;

public class Employee extends Person {
        protected int hireDate;
        protected String companyName;
        protected double salary;
        public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary){
            super(firstName, lastName, birthdayYear);
            this.hireDate = hireDate;
            this.companyName = companyName;
            this.salary = salary;

        }
        public int getJobSeniority() {
            int dataAktualna = Year.now().getValue();
            return dataAktualna - this.hireDate;

        }

        public double getSalary() {
            return this.salary;

        }

    }

