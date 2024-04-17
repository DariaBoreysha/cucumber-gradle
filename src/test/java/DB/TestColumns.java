/*
package DB;
import db.EmployeeService;
import org.example.PropertyReader;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
*/
/**//*

import static db.EmployeeService.statement;
import static org.assertj.core.api.Assertions.assertThat;

public class TestColumns {
    EmployeeService e = new EmployeeService();
    PropertyReader p = new PropertyReader("src/test/resources/queries.properties");


    @Test
    public void checkDbColumnsTest() throws SQLException {

        ResultSet resultSet = statement.executeQuery(p.getProperty("selectAll"));
       List<String> listActual = new ArrayList<>();
        while(resultSet.next()){
            listActual.add(resultSet.getString(2));
        }
        assertThat(listActual)
                .as("Checking the presence of collection elements")
                .containsExactly("Tandy","Palmer","Tristan","Jack","Kitana","Jane");
    }

}
*/
