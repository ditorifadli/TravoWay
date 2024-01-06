package travoway.pbo;


import java.util.Arrays;
import java.util.List;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//import net.sf.jasperreports.engine.JREmptyDataSource;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.design.JasperDesign;
//import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import net.sf.jasperreports.view.JasperViewer;


public class DashboardController implements Initializable {

    @FXML
    private AnchorPane main_form;

    @FXML
    private Button close;

    @FXML
    private Button minimize;

    @FXML
    private Label username;

    @FXML
    private Button dashboard_Btn;

    @FXML
    private Button availableB_Btn;

    @FXML
    private Button bookingTicket_Btn;

    @FXML
    private Button customers_btn;

    @FXML
    private Button logout;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Label dashboard_availableB;

    @FXML
    private Label dashboard_incomeToday;

    @FXML
    private Label dashboard_totalIncome;

    @FXML
    private AreaChart<?, ?> dashboard_chart;

    @FXML
    private AnchorPane availableB_form;

    @FXML
    private TextField availableB_travelID;

//    @FXML
//    private TextField availableB_location;

    @FXML
    private ComboBox<String> availableB_asal;
    
    @FXML
    private ComboBox<String> availableB_tujuan;
    
    @FXML
    private ComboBox<?> availableB_status;

    @FXML
    private TextField availableB_price;

    @FXML
    private DatePicker availableB_date;

    @FXML
    private Button availableB_addBtn;

    @FXML
    private Button availableB_updateBtn;

    @FXML
    private Button availableB_resetBtn;

    @FXML
    private Button availableB_deleteBtn;

    @FXML
    private TableView<travelData> availableB_tableView;

    @FXML
    private TableColumn<travelData, String> availableB_col_travelID;

    @FXML
    private TableColumn<travelData, String> availableB_col_asal;
    
    @FXML
    private TableColumn<travelData, String> availableB_col_tujuan;

    @FXML
    private TableColumn<travelData, String> availableB_col_status;

    @FXML
    private TableColumn<travelData, String> availableB_col_price;

    @FXML
    private TableColumn<travelData, String> availableB_col_date;

    @FXML
    private TextField availableB_search;

    @FXML
    private AnchorPane bookingTicket_form;

    @FXML
    private ComboBox<?> bookingTicket_travelId;

    @FXML
    private ComboBox<String> bookingTicket_asal;

    @FXML
    private ComboBox<String> bookingTicket_tujuan;

    
    @FXML
    private ComboBox<?> bookingTicket_type;

    @FXML
    private ComboBox<?> bookingTicket_ticketNum;

    @FXML
    private TextField bookingTicket_Nama;

    @FXML
    private ComboBox<?> bookingTicket_gender;

    @FXML
    private TextField bookingTicket_phoneNum;

    @FXML
    private DatePicker bookingTicket_date;

    @FXML
    private Button bookingTicket_selectBtn;

    @FXML
    private Button bookingTicket_resetBtn;

    @FXML
    private Label bookingTicket_sci_Nama;

    @FXML
    private Label bookingTicket_sci_gender;

    @FXML
    private Label bookingTicket_sci_phoneNum;

    @FXML
    private Label bookingTicket_sci_date;

    @FXML
    private Label bookingTicket_sci_travelID;

    @FXML
    private Label bookingTicket_sci_asal;
    
    @FXML
    private Label bookingTicket_sci_tujuan;

    @FXML
    private Label bookingTicket_sci_type;

    @FXML
    private Label bookingTicket_sci_ticketNum;

    @FXML
    private Label bookingTicket_sci_total;

    @FXML
    private Button bookingTicket_sci_pay;

    @FXML
    private Button bookingTicket_sci_receipt;

    @FXML
    private AnchorPane customer_Form;

    @FXML
    private TableView<customerData> customers_tableView;

    @FXML
    private TableColumn<customerData, String> customers_customerNum;

    @FXML
    private TableColumn<customerData, String> customers_ticketNum;

    @FXML
    private TableColumn<customerData, String> customers_nama;

    @FXML
    private TableColumn<customerData, String> customers_gender;

    @FXML
    private TableColumn<customerData, String> customers_phoneNum;

    @FXML
    private TableColumn<customerData, String> customers_travelID;

    @FXML
    private TableColumn<customerData, String> customers_asal;
    
    @FXML
    private TableColumn<customerData, String> customers_tujuan;

    @FXML
    private TableColumn<customerData, String> customers_type;

    @FXML
    private TableColumn<customerData, String> customers_date;

    @FXML
    private TextField customers_search;
        
    @FXML
    public void onDatePicked(ActionEvent event) {
        travelIdList();
    }
 
    private final List<String> lokasiBandung = Arrays.asList("Baltos", "Ujung Berung", "Cibiru", "Cimahi", "M. Toha", "Pasteur", "Soreang");
    private final List<String> lokasiJakarta = Arrays.asList("Pancoran", "Jatiwaringin", "Bintaro", "Sarinah", "Ciledug", "Cibubur", "Melawai");
    
     private int countRow = 0;
     
     private double totalP = 0;
     
//    DATABASE TOOLS
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;


    public void availableTravelAdd() {

        String addData = "INSERT INTO travel (travel_id, asal, tujuan, status, price, date) VALUES(?,?,?,?,?,?)";

        connect = Database.connectDb();

        try {

            Alert alert;

            if (availableB_travelID.getText().isEmpty()
                    || availableB_asal.getSelectionModel().getSelectedItem() == null
                    || availableB_tujuan.getSelectionModel().getSelectedItem() == null
                    || availableB_status.getSelectionModel().getSelectedItem() == null
                    || availableB_price.getText().isEmpty()
                    || availableB_date.getValue() == null) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();

            } else {

                String check = "SELECT travel_id FROM travel WHERE travel_id = '"
                        + availableB_travelID.getText() + "'";

                statement = connect.createStatement();
                result = statement.executeQuery(check);

                if (result.next()) {

                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Travel ID: " + availableB_travelID.getText() + " was already exist!");
                    alert.showAndWait();

                } else {

                    prepare = connect.prepareStatement(addData);
                    prepare.setString(1, availableB_travelID.getText());
                    prepare.setString(2, (String) availableB_asal.getSelectionModel().getSelectedItem());
                    prepare.setString(3, (String) availableB_tujuan.getSelectionModel().getSelectedItem());
                    prepare.setString(4, (String) availableB_status.getSelectionModel().getSelectedItem());
                    prepare.setString(5, availableB_price.getText());
                    prepare.setString(6, String.valueOf(availableB_date.getValue()));

                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();

                    availableBShowTravelData();
                    availableTravelReset();

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
          

    }

    public void availableTravelUpdate() {

        String updateData = "UPDATE travel SET asal = '"
                + availableB_asal.getSelectionModel().getSelectedItem() + "', tujuan = '"
                + availableB_tujuan.getSelectionModel().getSelectedItem() + "', status = '"
                + availableB_status.getSelectionModel().getSelectedItem()
                + "', price = '" + availableB_price.getText()
                + "', date = '" + availableB_date.getValue()
                + "' WHERE travel_id = '" + availableB_travelID.getText() + "'";

        connect = Database.connectDb();

        Alert alert;

        try {

            if (availableB_travelID.getText().isEmpty()
                    || availableB_asal.getSelectionModel().getSelectedItem() == null
                    || availableB_tujuan.getSelectionModel().getSelectedItem() == null
                    || availableB_status.getSelectionModel().getSelectedItem() == null
                    || availableB_price.getText().isEmpty()
                    || availableB_date.getValue() == null) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please select the item first");
                alert.showAndWait();

            } else {

                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE Travel ID: " + availableB_travelID.getText() + "?");

                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {

                    prepare = connect.prepareStatement(updateData);
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    availableBShowTravelData();
                    availableTravelReset();
                    
                } else {
                    return;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void availableTravelDelete(){
        
        String deleteData = "DELETE FROM travel WHERE travel_id = '"
                +availableB_travelID.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
            Alert alert;
            
            if (availableB_travelID.getText().isEmpty()
                    || availableB_asal.getSelectionModel().getSelectedItem() == null
                    || availableB_tujuan.getSelectionModel().getSelectedItem() == null
                    || availableB_status.getSelectionModel().getSelectedItem() == null
                    || availableB_price.getText().isEmpty()
                    || availableB_date.getValue() == null) {

                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please select the item first");
                alert.showAndWait();

            } else {
                
                alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to delete Travel ID: " + availableB_travelID.getText() + "?");
                
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK)){
                    
                    statement = connect.createStatement();
                    statement.executeUpdate(deleteData);
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                    
                    availableBShowTravelData();
                    availableTravelReset();
                    
                }else{
                    return;
                }
            }
        }catch(Exception e){e.printStackTrace();}
        
    }

    public void availableTravelReset() {

        availableB_travelID.setText("");
        availableB_asal.getSelectionModel().clearSelection();
        availableB_tujuan.getSelectionModel().clearSelection();
        availableB_status.getSelectionModel().clearSelection();
        availableB_price.setText("");
        availableB_date.setValue(null);

    }


    private String[] statusList = {"Available", "Not Available"};

    public void comboBoxStatus() {

        List<String> listS = new ArrayList<>();

        for (String data : statusList) {
            listS.add(data);
        }

        ObservableList listStatus = FXCollections.observableArrayList(listS);
        availableB_status.setItems(listStatus);

    }
    
    

    public ObservableList<travelData> availableTravelData() {

        ObservableList<travelData> travelListData = FXCollections.observableArrayList();

        String sql = "SELECT * FROM travel";

        connect = Database.connectDb();

        try {

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            travelData travelD;

            while (result.next()) {
                travelD = new travelData(result.getInt("travel_id"),
                        result.getString("asal"),
                        result.getString("tujuan"),
                        result.getString("status"),
                        result.getDouble("price"),
                        result.getDate("date"));

                travelListData.add(travelD);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return travelListData;

    }

    private ObservableList<travelData> availableTravelListData;

    public void availableBShowTravelData() {

        availableTravelListData = availableTravelData();

        availableB_col_travelID.setCellValueFactory(new PropertyValueFactory<>("travelId"));
        availableB_col_asal.setCellValueFactory(new PropertyValueFactory<>("asal"));
        availableB_col_tujuan.setCellValueFactory(new PropertyValueFactory<>("tujuan"));
        availableB_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
        availableB_col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
        availableB_col_date.setCellValueFactory(new PropertyValueFactory<>("date"));

        availableB_tableView.setItems(availableTravelListData);

    }

    public void avaialbleBSelectTravelData() {

        travelData travelD = availableB_tableView.getSelectionModel().getSelectedItem();
        int num = availableB_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        availableB_travelID.setText(String.valueOf(travelD.getTravelId()));
        availableB_asal.getSelectionModel().select(travelD.getAsal());
        availableB_tujuan.getSelectionModel().select(travelD.getTujuan());
        availableB_price.setText(String.valueOf(travelD.getPrice()));
        availableB_date.setValue(LocalDate.parse(String.valueOf(travelD.getDate())));

    }
    
    public void availableSearch(){
        
        FilteredList<travelData> filter = new FilteredList<>(availableTravelListData, e-> true);
        
        availableB_search.textProperty().addListener((Observable, oldValue, newValue) ->{
            
            filter.setPredicate(predicateTravelData ->{
                
                if(newValue.isEmpty() || newValue == null){
                    return true;
                }
                
                String searchKey = newValue.toLowerCase();

                if(predicateTravelData.getTravelId().toString().contains(searchKey)){

                    return true;
                }else if(predicateTravelData.getAsal().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateTravelData.getTujuan().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateTravelData.getStatus().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateTravelData.getDate().toString().contains(searchKey)){
                    return true;
                }else if(predicateTravelData.getPrice().toString().contains(searchKey)){
                    return true;
                }else return false;
                
            });
        });
        
        SortedList<travelData> sortList = new SortedList<>(filter);
        
        sortList.comparatorProperty().bind(availableB_tableView.comparatorProperty());
        availableB_tableView.setItems(sortList);
    }
    
    public void travelIdList() {
        String travelD = "SELECT * FROM travel WHERE status = 'Available'";

        connect = Database.connectDb();

        try {
            prepare = connect.prepareStatement(travelD);
            result = prepare.executeQuery();

            ObservableList<String> listB = FXCollections.observableArrayList();
            HashMap<String, String[]> travelIdMap = new HashMap<>();

            while (result.next()) {
                listB.add(result.getString("travel_id"));
                travelIdMap.put(result.getString("travel_id"), new String[] {result.getString("asal"), result.getString("tujuan")});
            }
            bookingTicket_travelId.setItems((ObservableList) listB);

            // Set a listener to update asal and tujuan based on selected travel_id
            bookingTicket_travelId.valueProperty().addListener((obs, oldVal, newVal) -> {
                if (newVal != null) {
                    String[] locations = travelIdMap.get(newVal);
                    bookingTicket_asal.setValue(locations[0]); // Set asal
                    bookingTicket_tujuan.setValue(locations[1]); // Set tujuan
                }
            });

            ticketNumList();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     private void fillAsalComboBoxes() {
        ObservableList<String> allLokasi = FXCollections.observableArrayList();
        allLokasi.addAll(lokasiBandung);
        allLokasi.addAll(lokasiJakarta);

        availableB_asal.setItems(allLokasi);
    }

    private void setTujuanBasedOnAsal() {
        availableB_asal.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            if (lokasiBandung.contains(newValue)) {
                availableB_tujuan.setItems(FXCollections.observableArrayList(lokasiJakarta));
            } else if (lokasiJakarta.contains(newValue)) {
                availableB_tujuan.setItems(FXCollections.observableArrayList(lokasiBandung));
            }
        });
    }
    
    
    private String[] listT = {"First Class", "Economy Class"};
    
    public void typeList(){
        
        List<String> tList = new ArrayList<>();
        
        for(String data : listT){
            tList.add(data);
        }
        
        ObservableList listType = FXCollections.observableArrayList(tList);
        bookingTicket_type.setItems(listType);
        
    }


    public void ticketNumList(){
        List<String> listTicket = new ArrayList<>();
        for(int q = 1; q <= 8; q++){
            listTicket.add(String.valueOf(q));
        }

        String removeSeat = "SELECT seatNum FROM customer WHERE travel_id='"
                +bookingTicket_travelId.getSelectionModel().getSelectedItem()+"'";

        connect = Database.connectDb();
        
        try{
            prepare = connect.prepareStatement(removeSeat);
            result = prepare.executeQuery();
            
            while(result.next()){
                listTicket.remove(result.getString("seatNum"));
            }
            
            ObservableList listTi = FXCollections.observableArrayList(listTicket);
            
            bookingTicket_ticketNum.setItems(listTi);

        }catch(Exception e){e.printStackTrace();}
    }
    

    public void bookingTicketSelect() {
        // Ambil data dari input fields dan comboboxes
        String nama = bookingTicket_Nama.getText();
        String gender = bookingTicket_gender.getSelectionModel().getSelectedItem().toString();
        String phoneNumber = bookingTicket_phoneNum.getText();
        LocalDate date = bookingTicket_date.getValue(); // Asumsi tanggal diambil dari DatePicker

        // Data pemesanan
        String travelId = bookingTicket_travelId.getSelectionModel().getSelectedItem().toString();
        String asal = bookingTicket_asal.getSelectionModel().getSelectedItem();
        String tujuan = bookingTicket_tujuan.getSelectionModel().getSelectedItem();
        String type = bookingTicket_type.getSelectionModel().getSelectedItem().toString();
        String seatNum = bookingTicket_ticketNum.getSelectionModel().getSelectedItem().toString();

        // Mengecek jika ada field yang belum diisi
    if (nama.isEmpty() || gender.isEmpty() || phoneNumber.isEmpty() || date == null
            || travelId.isEmpty() || asal.isEmpty() || tujuan.isEmpty()
            || type.isEmpty() || seatNum.isEmpty()) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Please fill all fields.");
        alert.showAndWait();
        return;
    }

    // Menghitung total harga berdasarkan tipe dan harga dasar dari travel
    double totalP = calculateTotalPrice(travelId, type);

    // Set data ke label di UI
    bookingTicket_sci_Nama.setText(nama);
    bookingTicket_sci_gender.setText(gender);
    bookingTicket_sci_phoneNum.setText(phoneNumber);
    bookingTicket_sci_date.setText(date.toString());
    bookingTicket_sci_travelID.setText(travelId);
    bookingTicket_sci_asal.setText(asal);
    bookingTicket_sci_tujuan.setText(tujuan);
    bookingTicket_sci_type.setText(type);
    bookingTicket_sci_ticketNum.setText(seatNum);
    bookingTicket_sci_total.setText(String.format("Rp %.3f", totalP));

    // Tampilkan konfirmasi
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Information Message");
    alert.setHeaderText(null);
    alert.setContentText("Customer berhasil ditambahkan!");
    alert.showAndWait();
    }

    private double calculateTotalPrice(String travelId, String type) {
        double priceData = 0;
        double totalP = 0;

        try {
            String totalPrice = "SELECT price FROM travel WHERE travel_id = ?";
            prepare = connect.prepareStatement(totalPrice);
            prepare.setString(1, travelId);
            result = prepare.executeQuery();

            if (result.next()) {
                priceData = result.getDouble("price");
            }

            if ("First Class".equals(type)) {
                totalP = priceData + 100; // Contoh biaya tambahan untuk first class
            } else if ("Economy Class".equals(type)) {
                totalP = priceData; // Tidak ada biaya tambahan untuk economy class
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return totalP;
    }
    
    public void bookingTicketReset(){
        
        bookingTicket_Nama.setText("");
        bookingTicket_gender.getSelectionModel().clearSelection();
        bookingTicket_phoneNum.setText("");
        bookingTicket_date.setValue(null);
        
    }
    
    private String[] genderL = {"Male","Female"};
    
    public void genderList(){
        
        List<String> listG = new ArrayList<>();
        
        for(String data : genderL){
            listG.add(data);
        }
        
        ObservableList gList = FXCollections.observableArrayList(listG);
        bookingTicket_gender.setItems(gList);
        
    }
    
    public void bookingTicketPay() {
    // Ambil data dari label yang telah diisi oleh metode bookingTicketSelect()
    String nama = bookingTicket_sci_Nama.getText();
    String gender = bookingTicket_sci_gender.getText();
    String phoneNumber = bookingTicket_sci_phoneNum.getText();
    String date = bookingTicket_sci_date.getText(); // Ini seharusnya diambil dari DatePicker sebelumnya
    String travelId = bookingTicket_sci_travelID.getText();
    String asal = bookingTicket_sci_asal.getText();
    String tujuan = bookingTicket_sci_tujuan.getText();
    String type = bookingTicket_sci_type.getText();
    String seatNum = bookingTicket_sci_ticketNum.getText();
    String total = bookingTicket_sci_total.getText();

    
    // Validasi jika ada data yang belum terisi
    if (nama.isEmpty() || gender.isEmpty() || phoneNumber.isEmpty() || date.isEmpty()
            || travelId.isEmpty() || asal.isEmpty() || tujuan.isEmpty()
            || type.isEmpty() || seatNum.isEmpty() || total.isEmpty() || "Rp 0.0".equals(total)) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("All fields must be selected and filled out.");
        alert.showAndWait();
        return;
    }

    // Konfirmasi pembayaran
    Alert confirmationAlert = new Alert(AlertType.CONFIRMATION);
    confirmationAlert.setTitle("Confirmation Dialog");
    confirmationAlert.setHeaderText("Konfirmasi Pembayaran");
    confirmationAlert.setContentText("Apakah Anda yakin ingin melanjutkan pembayaran?");
    Optional<ButtonType> result = confirmationAlert.showAndWait();
    if (result.get() != ButtonType.OK) {
        return;
    }

    // Proses pembayaran
    String insertCustomer = "INSERT INTO customer (customer_id, nama, gender, phoneNumber, travel_id, asal, tujuan, type, seatNum, total, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        // Menyiapkan perintah SQL untuk dieksekusi
        prepare = connect.prepareStatement(insertCustomer);
        prepare.setInt(1, countRow + 1); // asumsikan countRow sudah berisi jumlah customer
        prepare.setString(2, nama);
        prepare.setString(3, gender);
        prepare.setString(4, phoneNumber);
        prepare.setString(5, travelId);
        prepare.setString(6, asal);
        prepare.setString(7, tujuan);
        prepare.setString(8, type);
        prepare.setString(9, seatNum);
        prepare.setDouble(10, Double.parseDouble(total.replace("Rp ", ""))); // Ubah string total menjadi double
        prepare.setDate(11, java.sql.Date.valueOf(date)); // Ubah string date menjadi sql.Date

        // Eksekusi perintah SQL
        int affectedRows = prepare.executeUpdate();
        if (affectedRows > 0) {
            Alert successAlert = new Alert(AlertType.INFORMATION);
            successAlert.setTitle("Payment Successful");
            successAlert.setHeaderText(null);
            successAlert.setContentText("The payment has been successfully processed.");
            successAlert.showAndWait();
        } else {
            // Tampilkan pesan error jika tidak ada baris yang terpengaruh
            Alert failAlert = new Alert(AlertType.ERROR);
            failAlert.setTitle("Payment Failed");
            failAlert.setHeaderText(null);
            failAlert.setContentText("The payment failed to process.");
            failAlert.showAndWait();
        }
    } catch (SQLException e) {
        e.printStackTrace();
        Alert sqlAlert = new Alert(AlertType.ERROR);
        sqlAlert.setTitle("SQL Error");
        sqlAlert.setHeaderText(null);
        sqlAlert.setContentText("There was an error processing the payment: " + e.getMessage());
        sqlAlert.showAndWait();
    }
    
        // Reset UI components
        bookingTicket_sci_Nama.setText("");
        bookingTicket_sci_gender.setText("");
        bookingTicket_sci_phoneNum.setText("");
        bookingTicket_sci_date.setText("");
        bookingTicket_sci_travelID.setText("");
        bookingTicket_sci_asal.setText("");
        bookingTicket_sci_tujuan.setText("");
        bookingTicket_sci_type.setText("");
        bookingTicket_sci_ticketNum.setText("");
        bookingTicket_sci_total.setText("Rp 0.0");
 }

    
//    public void bookingTicketReceipt() {
//     try {
//         // Mengambil data yang dibutuhkan dari UI atau database
//         Map<String, Object> parameters = new HashMap<>();
//         parameters.put("Nama", bookingTicket_sci_Nama.getText());
//         parameters.put("Gender", bookingTicket_sci_gender.getText());
//         // ... tambahkan parameter lain sesuai kebutuhan
//
//         // Load template laporan (format JRXML atau Jasper)
//         JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Lenovo\\OneDrive\\Dokumen\\Semester 5\\PBO\\TUBES\\TravoWayApp\\src\\travowayapp\\report.jrxml");
//         JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
//
//         // Isi laporan dengan data dan parameter
//         JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
//
//         // Tampilkan preview laporan
//         JasperViewer.viewReport(jasperPrint, false);
//
//         // Opsional: simpan laporan sebagai PDF
//         String pdfPath = "path_untuk_simpan_receipt.pdf";
//         JasperExportManager.exportReportToPdfFile(jasperPrint, pdfPath);
//
//     } catch (JRException e) {
//         e.printStackTrace();
//     }
// }


    
    public ObservableList<customerData> customersDataList(){
        
        ObservableList<customerData> customerList = FXCollections.observableArrayList();
        
        String sql = "SELECT * FROM customer";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            customerData custD;
            
            while(result.next()){
                
                custD = new customerData(result.getInt("customer_id")
                        , result.getString("nama")
                        , result.getString("gender")
                        , result.getString("phoneNumber")
                        , result.getInt("travel_id")
                        , result.getString("asal")
                        , result.getString("tujuan")
                        , result.getString("type")
                        , result.getInt("seatNum")
                        , result.getDouble("total")
                        , result.getDate("date"));
                
                customerList.add(custD);
                
            }
            
        }catch(Exception e){e.printStackTrace();}
        return customerList;
    }
    
    private ObservableList<customerData> customersDataL;
    public void customersShowDataList(){
        
        customersDataL = customersDataList();
        
        customers_customerNum.setCellValueFactory(new PropertyValueFactory<>("customerNum"));
        customers_ticketNum.setCellValueFactory(new PropertyValueFactory<>("seatNum"));
        customers_nama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        customers_phoneNum.setCellValueFactory(new PropertyValueFactory<>("phoneNum"));
        customers_gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        customers_travelID.setCellValueFactory(new PropertyValueFactory<>("travelId"));
        customers_asal.setCellValueFactory(new PropertyValueFactory<>("asal"));
        customers_tujuan.setCellValueFactory(new PropertyValueFactory<>("tujuan"));
        customers_type.setCellValueFactory(new PropertyValueFactory<>("type"));
        customers_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        
        customers_tableView.setItems(customersDataL);
        
    }
    
    public void customersSearch(){
        
        FilteredList<customerData> filter = new FilteredList<>(customersDataL, e-> true);
        
        customers_search.textProperty().addListener((Observable, oldValue, newValue) ->{
            
            filter.setPredicate(predicateCustomerData ->{
                
                if(newValue == null || newValue.isEmpty()){
                    return true;
                }
                
                String searchKey = newValue.toLowerCase();
                
                if(predicateCustomerData.getCustomerNum().toString().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getSeatNum().toString().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getNama().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getGender().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getPhoneNum().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getTravelId().toString().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getAsal().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getTujuan().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getTotal().toString().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getType().toLowerCase().contains(searchKey)){
                    return true;
                }else if(predicateCustomerData.getDate().toString().contains(searchKey)){
                    return true;
                }else return false;
                
            });
        });
        
        SortedList<customerData> sortList = new SortedList<>(filter);
        
        sortList.comparatorProperty().bind(customers_tableView.comparatorProperty());
        customers_tableView.setItems(sortList);
    }
    
    private double x = 0;
    private double y = 0;
    public void logout() {

        try {

            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you wsnt to logout?");

            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {

                logout.getScene().getWindow().hide();

                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);

                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });

                root.setOnMouseDragged((MouseEvent event) -> {

                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);

                    stage.setOpacity(.8);
                });
                root.setOnMouseReleased((MouseEvent event) -> {
                    stage.setOpacity(1);
                });

                stage.initStyle(StageStyle.TRANSPARENT);

                stage.setScene(scene);
                stage.show();

            } else {
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

    public void defaultBtn() {
        dashboard_Btn.setStyle("-fx-background-color:#ED8F03");
        availableB_Btn.setStyle("-fx-background-color:transparent");
        bookingTicket_Btn.setStyle("-fx-background-color:transparent");
        customers_btn.setStyle("-fx-background-color:transparent");
    }

    public void switchForm(ActionEvent event) {

        if (event.getSource() == dashboard_Btn) {
            dashboard_form.setVisible(true);
            availableB_form.setVisible(false);
            bookingTicket_form.setVisible(false);
            customer_Form.setVisible(false);

            dashboard_Btn.setStyle("-fx-background-color:#ED8F03");
            availableB_Btn.setStyle("-fx-background-color:transparent");
            bookingTicket_Btn.setStyle("-fx-background-color:transparent");
            customers_btn.setStyle("-fx-background-color:transparent");

            dashboardDisplayAB();
            dashboardDisplayIT();
            dashboardDisplayTI();
            dashboardChart();
            
        } else if (event.getSource() == availableB_Btn) {
            dashboard_form.setVisible(false);
            availableB_form.setVisible(true);
            bookingTicket_form.setVisible(false);
            customer_Form.setVisible(false);

            availableB_Btn.setStyle("-fx-background-color:#ED8F03");
            dashboard_Btn.setStyle("-fx-background-color:transparent");
            bookingTicket_Btn.setStyle("-fx-background-color:transparent");
            customers_btn.setStyle("-fx-background-color:transparent");

            availableBShowTravelData();
            availableSearch();

        } else if (event.getSource() == bookingTicket_Btn) {
            dashboard_form.setVisible(false);
            availableB_form.setVisible(false);
            bookingTicket_form.setVisible(true);
            customer_Form.setVisible(false);

            bookingTicket_Btn.setStyle("-fx-background-color:#ED8F03");
            availableB_Btn.setStyle("-fx-background-color:transparent");
            dashboard_Btn.setStyle("-fx-background-color:transparent");
            customers_btn.setStyle("-fx-background-color:transparent");

            travelIdList();
            typeList();
            ticketNumList();
            genderList();
            
        } else if (event.getSource() == customers_btn) {
            dashboard_form.setVisible(false);
            availableB_form.setVisible(false);
            bookingTicket_form.setVisible(false);
            customer_Form.setVisible(true);

            customers_btn.setStyle("-fx-background-color:#ED8F03");
            availableB_Btn.setStyle("-fx-background-color:transparent");
            bookingTicket_Btn.setStyle("-fx-background-color:transparent");
            dashboard_Btn.setStyle("-fx-background-color:transparent");

            customersShowDataList();
            customersSearch();

        }
    }
    
    private int countAB = 0;
    public void dashboardDisplayAB(){
        
        String sql = "SELECT COUNT(id) FROM travel WHERE status = 'Available'";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                countAB = result.getInt("COUNT(id)");
            }
            
            dashboard_availableB.setText(String.valueOf(countAB));
            
        }catch(Exception e){e.printStackTrace();}
        
    }
    
    private double incomeToday = 0;
    public void dashboardDisplayIT(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql = "SELECT SUM(total) FROM customer WHERE date ='"+sqlDate+"'";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                incomeToday = result.getDouble("SUM(total)");
            }
            
            dashboard_incomeToday.setText(String.format("Rp %.3f", incomeToday));
            
        }catch(Exception e){e.printStackTrace();}
        
    }
    
    private double totalIncome;
    public void dashboardDisplayTI(){
        
        String sql = "SELECT SUM(total) FROM customer";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                totalIncome = result.getDouble("SUM(total)");
            }
            
            dashboard_totalIncome.setText(String.format("Rp %.3f", totalIncome));
            
        }catch(Exception e){e.printStackTrace();}
        
    }
    
    public void dashboardChart(){
        
        dashboard_chart.getData().clear();
        
        String sql = "SELECT date,SUM(total) FROM customer WHERE date != '' GROUP BY date ORDER BY TIMESTAMP(date) ASC LIMIT 9";
        
        connect = Database.connectDb();
        
        XYChart.Series chart = new XYChart.Series();
        
        try{

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            while(result.next()){
                chart.getData().add(new XYChart.Data(result.getString(1), result.getInt(2)));
            }
            
            dashboard_chart.getData().add(chart);
            
        }catch(Exception e){e.printStackTrace();}
        
    }
     

    public void displayUsername(){
        username.setText(getData.username);
    }

    public void close() {
        System.exit(0);
    }

    public void minimize() {
        Stage stage = (Stage) main_form.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        defaultBtn();
        displayUsername();
        
        dashboardDisplayAB();
        dashboardDisplayIT();
        dashboardDisplayTI();
        dashboardChart();

        comboBoxStatus();
        availableBShowTravelData();

        travelIdList();
        typeList();
        ticketNumList();
        genderList();

        fillAsalComboBoxes();
        setTujuanBasedOnAsal();

        customersShowDataList();
        
    }

}

