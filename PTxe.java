package KhoPhuTungXeMay;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.lang.reflect.Constructor;

public class PTxe {
    protected String Kind;
    protected String Code;
    protected String Brand;
    protected double Price;
    protected String InPutDay;
    protected String OutPutDay;

    // contructor
    PTxe(){}
    PTxe(String Kind, String Brand, Double Price, String InPutDay, String OutPutDay){
        this.Kind = Kind;
        this.Brand =Brand;
        this.Price = Price;
        this.InPutDay = InPutDay;
        this.OutPutDay = OutPutDay;
    }
    // getMethod
    public String getKind(){
        return this.Kind;
    }
    public String getBrand(){
        return this.Brand;
    }
    public double getPrice(){
        return this.Price;
    }
    // setMethod
    public void setKind(String kind){
        this.Kind = kind;
    }
    public void setBrand(String brand){
        this.Brand = brand;
    }
    public void setPrice(Double price){
        this.Price = price;
    }
    public void RangeOfVehicle(){
        System.out.println("dong xe");
    }

    public void inputDay(String inday){
        this.InPutDay = inday;
    }
    public void outputDay(String outday){
        this.OutPutDay = outday;
    }
    
    public String inputDay(){
        return this.InPutDay;
    }
    public String outputDay(){
        return this.OutPutDay;
    }
    // toString
    public String toString(){
        return Kind+Brand+Price+InPutDay+OutPutDay;
    }
}
