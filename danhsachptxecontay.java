package KhoPhuTungXeMay;

import java.util.ArrayList;

public class danhsachptxecontay {
    public ArrayList<xecontay> listPTxecontay;

    public danhsachptxecontay(){
        this.listPTxecontay = new ArrayList<xecontay>();
    }
    public danhsachptxecontay(ArrayList<xecontay> listPTxecontay){
        this.listPTxecontay = listPTxecontay;
    }
    public void addPT(xecontay xct){
        this.listPTxecontay.add(xct);
    }
    // xuat thong tin
    public void xuatthongtin(){
        for(xecontay xecontay : listPTxecontay){
            System.out.println(xecontay);
        }
    }
}
