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
public class travelData {
    private Integer travelId;
    private String asal;
    private String tujuan;
    private String status;
    private Double price;
    private Date date;

    public travelData(Integer travelId, String asal, String tujuan, String status, Double price, Date date) {
        this.travelId = travelId;
        this.asal = asal;
        this.tujuan = tujuan;
        this.status = status;
        this.price = price;
        this.date = date;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
