/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class KhachHangDTO {
    private String Makh;
    private String Tenkh;
    private String Sdt;
    private String Diachi;
    private String Anhcm;
    private String Anhgp;
    

    public KhachHangDTO() {
    }

    public KhachHangDTO(String Makh, String Tenkh, String Sdt, String Diachi, String Anhcm, String Anhgp) {
        this.Makh = Makh;
        this.Tenkh = Tenkh;
        this.Sdt = Sdt;
        this.Diachi = Diachi;
        this.Anhcm = Anhcm;
        this.Anhgp = Anhgp;
    }
 
    public KhachHangDTO(String Makh, String Tenkh, String Diachi, String Sdt) {
        this.Makh = Makh;
        this.Tenkh = Tenkh;
        this.Diachi = Diachi;
        this.Sdt = Sdt;
    }

    public KhachHangDTO(String Makh) {
        this.Makh = Makh;
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
     * @return the Tenkh
     */
    public String getTenkh() {
        return Tenkh;
    }

    /**
     * @param Tenkh the Tenkh to set
     */
    public void setTenkh(String Tenkh) {
        this.Tenkh = Tenkh;
    }

    /**
     * @return the Diachi
     */
    public String getDiachi() {
        return Diachi;
    }

    /**
     * @param Diachi the Diachi to set
     */
    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    /**
     * @return the Anhcm
     */
    public String getAnhcm() {
        return Anhcm;
    }

    /**
     * @param Anhcm the Anhcm to set
     */
    public void setAnhcm(String Anhcm) {
        this.Anhcm = Anhcm;
    }

    /**
     * @return the Anhgp
     */
    public String getAnhgp() {
        return Anhgp;
    }

    /**
     * @param Anhgp the Anhgp to set
     */
    public void setAnhgp(String Anhgp) {
        this.Anhgp = Anhgp;
    }

    /**
     * @return the Sdt
     */
    public String getSdt() {
        return Sdt;
    }

    /**
     * @param Sdt the Sdt to set
     */
    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
    public String toString(){
        return this.Makh +"\t" +this.Tenkh+"\t"+this.Diachi+"\t"+this.Anhcm+"\t"+this.Anhgp+"\t"+this.Sdt ; 
} 
}
