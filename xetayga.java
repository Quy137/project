package KhoPhuTungXeMay;

public class xetayga extends PTxe{
    xetayga(String Kind, String Brand, Double Price, String InPutDay, String OutPutDay){
        super();
        this.Kind = Kind;
        this.Brand =Brand;
        this.Price = Price;
        this.InPutDay = InPutDay;
        this.OutPutDay = OutPutDay;
    }
    @Override
    public void RangeOfVehicle(){
        System.out.println("\nDanh cho xe tay ga");
    }

    @Override
    public String toString(){
        return "------INFO.PT.XETAYGA-----\nPhu tung "+Kind+" danh cho xe "+Brand+"\nNgay nhap kho:"+InPutDay+"\nNgay xuat kho:"+OutPutDay+"\nGia: "+Price;
    }
}
