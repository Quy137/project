package KhoPhuTungXeMay;

import java.util.ArrayList;

public class danhsachptxeso {
    public ArrayList<xeso> listPTxeso;

    public danhsachptxeso(){
        this.listPTxeso = new ArrayList<xeso>();
    }
    public danhsachptxeso(ArrayList<xeso> listPTxeso){
        this.listPTxeso = listPTxeso;
    }
    public void addPT(xeso xct){
        this.listPTxeso.add(xct);
    }
    // xuat thong tin
    public void xuatthongtin(){
        for(xeso xeso : listPTxeso){
            System.out.println(xeso);
        }
    }
}
