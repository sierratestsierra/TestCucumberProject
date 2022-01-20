package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EmployeeFormPage;

public class EmployeeFormSteps {

    EmployeeFormPage employeeFormPage;

    @Given("employee list home page")
    public void employeeHomePage() {
        employeeFormPage.open();
    }

    @When("no employee is selected from the list")
    public void noEmployeeIsSelected() {
        Assert.assertTrue(employeeFormPage.employeeIsNotSelected());
    }

    @And("view selected data button is clicked")
    public void selectedDataIsClicked() {
        employeeFormPage.selectedDataIsClicked();
    }

    @Then("view of selected data is empty")
    public void selectedDataIsEmpty() {
        Assert.assertTrue(employeeFormPage.viewSelectedDataIsEmpty());
    }

    @When("one employee is selected from the list")
    public void oneEmployeeIsSelected(DataTable dataTable) {
        employeeFormPage.selectEmployee(dataTable);
    }

    @Then("unselect employee from the list")
    public void oneEmployeeIsUnselected(DataTable dataTable) {
        employeeFormPage.unselectEmployee(dataTable);
    }

    @When("select all employees")
    public void selectAllEmployees() {
        employeeFormPage.selectAllEmployees();
    }

    @Then("view all cities of employees on selected data")
    public void viewAllCitiesOfEmployeesOnSelectedData(DataTable t) {
        Assert.assertTrue(employeeFormPage.verifyCityOfEmployee(t));
    }

    @Then("view city of employee selected")
    public void viewCityOfEmployeeSelected(DataTable dataTable) {
        Assert.assertTrue(employeeFormPage.verifyCityOfEmployee(dataTable));
    }

}
