/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Admin
 */
public class BanThongKeDTO {
    private int gdHoanThanh;
    private int tongDg;
    private int tongTien;

    public BanThongKeDTO() {
    }

    public BanThongKeDTO(int gdHoanThanh, int tongDg, int tongTien) {
       
        this.gdHoanThanh = gdHoanThanh;
        this.tongDg = tongDg;
        this.tongTien = tongTien;
    }

    public int getGdHoanThanh() {
        return gdHoanThanh;
    }

    public void setGdHoanThanh(int gdHoanThanh) {
        this.gdHoanThanh = gdHoanThanh;
    }

    public int getTongDg() {
        return tongDg;
    }

    public void setTongDg(int tongDg) {
        this.tongDg = tongDg;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return this.gdHoanThanh+"\t"+this.tongDg+"\t"+this.tongTien;
    }
    
}
