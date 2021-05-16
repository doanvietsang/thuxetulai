package dto;

public class XeDTO implements Comparable<XeDTO>{

    private String maXe;
    private String TenXe;
    private String BienSo;
    private String LoaiXe;
    private String Trangthai;
    private int Giathue;

    public XeDTO() {

    }

    public XeDTO(String TenXe) {
        this.TenXe = TenXe;
    }

    public XeDTO(int Giathue) {
        this.Giathue = Giathue;
    }
    

    public XeDTO(String maXe, String TenXe, String BienSo, String LoaiXe, String Trangthai, int Giathue) {
        this.maXe = maXe;
        this.TenXe = TenXe;
        this.BienSo = BienSo;
        this.LoaiXe = LoaiXe;
        this.Trangthai = Trangthai;
        this.Giathue = Giathue;
    }

    public String getMaXe() {
        return maXe;
    }

    /**
     * @param maXe the maXe to set
     */
    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    /**
     * @return the TenXe
     */
    public String getTenXe() {
        return TenXe;
    }

    /**
     * @param TenXe the TenXe to set
     */
    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    /**
     * @return the BienSo
     */
    public String getBienSo() {
        return BienSo;
    }

    /**
     * @param BienSo the BienSo to set
     */
    public void setBienSo(String BienSo) {
        this.BienSo = BienSo;
    }

    /**
     * @return the Trangthai
     */
    public String getTrangthai() {
        return Trangthai;
    }

    /**
     * @param Trangthai the Trangthai to set
     */
    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    /**
     * @return the LoaiXe
     */
    public String getLoaiXe() {
        return LoaiXe;
    }

    /**
     * @param LoaiXe the LoaiXe to set
     */
    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    /**
     * @return the Giathue
     */
    public int getGiathue() {
        return Giathue;
    }

    /**
     * @param Giathue the Giathue to set
     */
    public void setGiathue(int Giathue) {
        this.Giathue = Giathue;
    }
    public String toString(){
        return this.maXe +"\t" +this.TenXe+"\t"+this.BienSo+"\t"+this.LoaiXe+"\t"+this.Trangthai+"\t"+this.Giathue; 
}

    @Override
    public int compareTo(XeDTO o) {
        String a = String.valueOf(this.getGiathue());
        String b = String.valueOf(o.getGiathue());
        return a.compareTo(b);
    }

}
