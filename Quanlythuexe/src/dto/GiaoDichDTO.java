/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

public class GiaoDichDTO {
    private String Magd;
    private String Makh;
    private String Maxe;
    private int Songaymuon;
    private Date Ngaymuon;
    private Date Ngaytra;
    private String Loaipp;
    private int Phuphi;
    private int Tongphi;

    public GiaoDichDTO() {
    }

    public GiaoDichDTO(String Magd, String Makh, String Maxe, int Songaymuon, Date Ngaymuon, Date Ngaytra, String Loaipp, int Phuphi, int Tongphi) {
        this.Magd = Magd;
        this.Makh = Makh;
        this.Maxe = Maxe;
        this.Songaymuon = Songaymuon;
        this.Ngaymuon = Ngaymuon;
        this.Ngaytra = Ngaytra;
        this.Loaipp = Loaipp;
        this.Phuphi = Phuphi;
        this.Tongphi = Tongphi;
    }

    public GiaoDichDTO(String Magd, String Makh, String Maxe, int Songaymuon, Date Ngaymuon) {
        this.Magd = Magd;
        this.Makh = Makh;
        this.Maxe = Maxe;
        this.Songaymuon = Songaymuon;
        this.Ngaymuon = Ngaymuon;
    }

   
    

    /**
     * @return the Magd
     */
    public String getMagd() {
        return Magd;
    }

    /**
     * @param Magd the Magd to set
     */
    public void setMagd(String Magd) {
        this.Magd = Magd;
    }

    /**
     * @return the Makh
     */
    public String getMakh() {
        return Makh;
    }

    /**
     * @param Makh the Makh to set
     */
    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    /**
     * @return the Maxe
     */
    public String getMaxe() {
        return Maxe;
    }

    /**
     * @param Maxe the Maxe to set
     */
    public void setMaxe(String Maxe) {
        this.Maxe = Maxe;
    }

    /**
     * @return the Loaipp
     */
    public String getLoaipp() {
        return Loaipp;
    }

    /**
     * @param Loaipp the Loaipp to set
     */
    public void setLoaipp(String Loaipp) {
        this.Loaipp = Loaipp;
    }

    /**
     * @return the Ngaymuon
     */
    public Date getNgaymuon() {
        return Ngaymuon;
    }

    /**
     * @param Ngaymuon the Ngaymuon to set
     */
    public void setNgaymuon(Date Ngaymuon) {
        this.Ngaymuon = Ngaymuon;
    }

    /**
     * @return the Ngaytra
     */
    public Date getNgaytra() {
        return Ngaytra;
    }

    /**
     * @param Ngaytra the Ngaytra to set
     */
    public void setNgaytra(Date Ngaytra) {
        this.Ngaytra = Ngaytra;
    }

    /**
     * @return the Songaymuon
     */
    public int getSongaymuon() {
        return Songaymuon;
    }

    /**
     * @param Songaymuon the Songaymuon to set
     */
    public void setSongaymuon(int Songaymuon) {
        this.Songaymuon = Songaymuon;
    }

    /**
     * @return the Phuphi
     */
    public int getPhuphi() {
        return Phuphi;
    }

    /**
     * @param Phuphi the Phuphi to set
     */
    public void setPhuphi(int Phuphi) {
        this.Phuphi = Phuphi;
    }

    /**
     * @return the Tongphi
     */
    public int getTongphi() {
        return Tongphi;
    }

    /**
     * @param Tongphi the Tongphi to set
     */
    public void setTongphi(int Tongphi) {
        this.Tongphi = Tongphi;
    }
    public String toString(){
        return this.Magd+"\t"+this.Makh+"\t"+this.Maxe+"\t"+this.Loaipp+"\t"+this.Ngaymuon+"\t"+this.Ngaytra+"\t"+this.Songaymuon+"\t"+this.Phuphi+"\t"+this.Tongphi;
    }
}
