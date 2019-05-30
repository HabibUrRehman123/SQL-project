/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.ui.screens;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

/**
 * FXML Controller class
 *
 * @author ijazm
 */
public class ClinicController implements Initializable {
    
    @FXML
    private PieChart pieChart;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            {
                {
                    {
                        {
                            {
                                {
                                    {
                                        {
                                            {
                                                /*ObservableList<PieChart.Data> pieChartData =
                                                 FXCollections.observableArrayList(
                                                 new PieChart.Data("Grapefruit", 13),
                                                 new PieChart.Data("Oranges", 5),
                                                 new PieChart.Data("Plums", 10),
                                                 new PieChart.Data("Pears", 22),
                                                 new PieChart.Data("Apples", 30));
                                                 final PieChart chart = new PieChart(pieChartData);*/
                                                String sql = "SELECT Name ,QuantityInStock FROM tbl_Medicine;";
                                                ResultSet rs = DatabaseUtil.Database.statement.executeQuery(sql);
                                                ArrayList<PieChart.Data> al = new ArrayList<>();
                                                for (; rs.next();) {
                                                    {
                                                        al.add(new PieChart.Data(rs.getString("Name"), rs.getInt("QuantityInStock")));
                                                    }
                                                }
                                                ObservableList<PieChart.Data> list = FXCollections.observableArrayList(al);
                                                {
                                                    list.forEach(data
                                                            -> data.nameProperty().bind(
                                                                    Bindings.concat(
                                                                            data.getName(), " ", data.pieValueProperty(), " "
                                                                    )
                                                            )
                                                    );
                                                }
                                                pieChart.setTitle("Showing Medicines in Stock");
                                                pieChart.setData(list);
                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
