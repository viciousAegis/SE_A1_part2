// class Staff {
//     - StaffType: StaffType
//     - salary: int
//     + deductFromSalary(amount: double): Boolean
// }

public class Staff extends User {
    private StaffType staffType; // staff type
    private int salary; // salary

    public enum StaffType {
        TEACHER,
        STAFF
    }

    // constructor
    public Staff() {
        this.staffType = StaffType.TEACHER;
        this.salary = 0;
    }

    // methods
    public Boolean deductFromSalary(double amount) {
        // deduct from salary
        return true;
    }
    
}
