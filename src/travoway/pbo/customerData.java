/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travoway.pbo;
import java.sql.Date;
/**
 *
 * @author ditorifadli_
 */
public class customerData {
    
    private Integer customerNum;
    private String nama;
    private String gender;
    private String phoneNum;
    private Integer travelId;
    private String asal;
    private String tujuan;
    private String type;
    private Integer seatNum;
    private Double total;
    private Date date;

    public customerData(Integer customerNum, String nama, String gender, String phoneNum, Integer busId, String asal, String tujuan, String type, Integer seatNum, Double total, Date date) {
        this.customerNum = customerNum;
        this.nama = nama;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.travelId = busId;
        this.asal = asal;
        this.tujuan = tujuan;
        this.type = type;
        this.seatNum = seatNum;
        this.total = total;
        this.date = date;
    }

    public Integer getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(Integer customerNum) {
        this.customerNum = customerNum;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getTravelId() {
        return travelId;
    }

    public void setTravelId(Integer travelId) {
        this.travelId = travelId;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
