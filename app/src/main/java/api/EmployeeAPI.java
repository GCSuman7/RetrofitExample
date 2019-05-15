package api;

import java.util.List;

import model.Employee;
import model.EmployeeCUD;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmployeeAPI {

    //Get all the employees
    @GET("employees")
    Call<List<Employee>> getEmployee();


    @POST("create")
    Call<Void> registerEmployee(@Body EmployeeCUD emp);


    //Get employee on the basis of EmpID
    @GET("employee/{empID}")
    Call<Employee> getEmployeeByID(@Path("empID") int empId);

    Call<Void> updateEmployee(int parseInt, EmployeeCUD employee);

    Call<Void> deleteEmployee(int parseInt);
}

