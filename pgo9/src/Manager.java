final class Manager extends Employee {
        private double bonus;
        public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
            super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
            this.bonus = bonus;
        }

        @Override
        public double getSalary() {
            return this.salary + this.bonus;
        }

        @Override
        public String toString() {
            return "Manager with lastName " + this.lastName + " and age " + this.getAge() + " has salary " + this.getSalary();

        }

    }

