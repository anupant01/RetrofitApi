package ClientApi;

import java.util.List;

import model.Employee;
import model.EmployeeCUD;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmployeeAPI {

    //to get all the employees
    @GET("employees")
    Call<List<Employee>> getAllEmployee();

    //to get employee on the basis of their id
    @GET("employee/{empID}")
    Call<Employee> getEmployeeByID(@Path("empID") int empID);

    //to create or register
    @POST("create")
    Call<Void> registerEmployee (@Body EmployeeCUD emp);
}
