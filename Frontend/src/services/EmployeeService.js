import axios from 'axios';

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/v1/employees";

class EmployeeService {

    // Fetch all employees
    getEmployees() {
        return axios.get(EMPLOYEE_API_BASE_URL);
    }

    // Create a new employee
    createEmployee(employee) {
        return axios.post(EMPLOYEE_API_BASE_URL, employee);
    }

    // Fetch an employee by ID
    getEmployeeById(employeeId) {
        return axios.get(`${EMPLOYEE_API_BASE_URL}/${employeeId}`);
    }

    // Update an existing employee
    updateEmployee(employee, employeeId) {
        return axios.put(`${EMPLOYEE_API_BASE_URL}/${employeeId}`, employee);
    }

    // Delete an employee by ID
    deleteEmployee(employeeId) {
        return axios.delete(`${EMPLOYEE_API_BASE_URL}/${employeeId}`);
    }
}

export default new EmployeeService();