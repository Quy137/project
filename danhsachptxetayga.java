package KhoPhuTungXeMay;

import java.util.ArrayList;

public class danhsachptxetayga {
    public ArrayList<xetayga> listPTxetayga;

    public danhsachptxetayga(){
        this.listPTxetayga = new ArrayList<xetayga>();
    }
    public danhsachptxetayga(ArrayList<xetayga> listPTxetayga){
        this.listPTxetayga = listPTxetayga;
    }
    public void addPT(xetayga xct){
        this.listPTxetayga.add(xct);
    }
    // xuat thong tin
    public void xuatthongtin(){
        for(xetayga xetayga : listPTxetayga){
            System.out.println(xetayga);
        }
    }
}
