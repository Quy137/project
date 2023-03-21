package KhoPhuTungXeMay;
import java.util.ArrayList;
import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        PTxe PTxe = new PTxe();
        int a;
        
        System.out.println("Hay nhap vao con so tuong ung trong menu:");
        System.out.println("1: Tim thong tin phu tung cho xe con tay.");      
        System.out.println("2: Tim thong tin phu tung cho xe so.");
        System.out.println("3: Tim thong tin phu tung cho xe tay ga.");
        System.out.println("4: Thoat.");

        do{
            a =input.nextInt();
            if(a<=0 || a>4){
                System.out.println("----------ERROR----------");
                System.out.println("Vui long chon trong khoang 1 toi 4!!!!!");
                System.out.println("Hay nhap vao con so tuong ung trong menu:");
                System.out.println("1: Tim thong tin phu tung cho xe con tay.");      
                System.out.println("2: Tim thong tin phu tung cho xe so.");
                System.out.println("3: Tim thong tin phu tung cho xe tay ga.");
                System.out.println("4: Thoat.");
            }
        }while(a<=0 || a>4);
        switch(a){
            case 1:{
                PTxe contay = new xecontay();
                System.out.println("Ban dang tim SP cho xe con tay!!!");
                System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
                arr.add(input.next);
                arr.add("2.YAMAHA");
                arr.add("3.SUZUKI");
                arr.add("4.DUCATI");
                arr.set(0,"1.LEGEND");
                System.out.println(arr);
//                System.out.println("1.HONDA");
//                System.out.println("2.YAMAHA");
//                System.out.println("3.SUZUKI");
//                System.out.println("4.DUCATI");
                int Brand;
                do{
                    Brand = input.nextInt();
                    if(Brand <= 0 || Brand > 4){
                        System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
                        for(String i: arr){
                            System.out.println(i);
                        }
//                        System.out.println("1.HONDA");
//                        System.out.println("2.YAMAHA");
//                        System.out.println("3.SUZUKI");
//                        System.out.println("4.DUCATI");
                    }else{
                        switch(Brand){
                            case 1:{contay.setBrand(arr.set(0,"LEGEND"));break;}
                            case 2:{contay.setBrand("YAMAHA");break;}
                            case 3:{contay.setBrand("SUZUKI");break;}
                            case 4:{contay.setBrand("DUCATI");break;}
                        }
                    }
                }while(Brand <= 0 || Brand > 4);

                System.out.println("Hay nhap vao SP ban muon tim: ");
                contay.setKind(input.nextLine());
                contay.setKind(input.nextLine());
                System.out.println("Hay nhap vao ma san pham:");
                contay.setCode(input.nextLine());
                System.out.println("Hay nhap vao gia san pham: ");
                contay.setPrice(input.nextDouble());
                System.out.println("-------INFO--------");
                System.out.println(contay.toString());
                contay.RangeOfVehicle();
                contay.inputDay();
                contay.outputDay();
                contay.employee();
                break;
            }
            case 2:{
                PTxe = new xeso();
                System.out.println("Ban dang tim SP cho xe so!!!");
                System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
                arr.add("1.HONDA");
                arr.add("2.YAMAHA");
                arr.add("3.SUZUKI");
                arr.add("4.SYM");
                arr.set(1, "2.KYMCO");
                System.out.println(arr);
//                System.out.println("1.HONDA");
//                System.out.println("2.YAMAHA");
//                System.out.println("3.SUZUKI");
//                System.out.println("4.SYM");
                int Brand;
                do{
                    Brand = input.nextInt();
                    if(Brand <= 0 || Brand > 4){
                        System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
                        System.out.println(arr);
//                        System.out.println("1.HONDA");
//                        System.out.println("2.YAMAHA");
//                        System.out.println("3.SUZUKI");
//                        System.out.println("4.SYM");
                    }else{
                        switch(Brand){
                            case 1:{PTxe.setBrand("HONDA");break;}
                            case 2:{PTxe.setBrand(arr.set(1, "YAMAHA"));break;}
                            case 3:{PTxe.setBrand("SUZUKI");break;}
                            case 4:{PTxe.setBrand("SYM");break;}
                        }
                    }
                }while(Brand <= 0 || Brand > 4);

                System.out.println("Hay nhap vao SP ban muon tim: ");
                PTxe.setKind(input.nextLine());
                PTxe.setKind(input.nextLine());
                System.out.println("Hay nhap vao ma san pham:");
                PTxe.setCode(input.nextLine());
                System.out.println("Hay nhap vao gia san pham: ");
                PTxe.setPrice(input.nextDouble());
                System.out.println("-------INFO--------");
                System.out.println(PTxe.toString());
                PTxe.RangeOfVehicle();
                PTxe.inputDay();
                PTxe.outputDay();
                PTxe.employee();
                break;
            }
            case 3:{
                PTxe = new xetayga();
                System.out.println("Ban dang tim SP cho xe tay ga!!!");
                System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
                arr.add("1.HONDA");
                arr.add("2.YAMAHA");
                arr.add("3.SYM");
                arr.add("4.PIAGGiO");
                arr.set(3,"4.PEUGEOT");
                System.out.println(arr);
//                System.out.println("1.HONDA");
//                System.out.println("2.YAMAHA");
//                System.out.println("3.SYM");
//                System.out.println("4.PIAGGIO");
                int Brand;
                do{
                    Brand = input.nextInt();
                    if(Brand <= 0 || Brand > 4){
                        System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
                        System.out.println(arr);
//                        System.out.println("1.HONDA");
//                        System.out.println("2.YAMAHA");
//                        System.out.println("3.SYM");
//                        System.out.println("4.PIAGO");
                    }else{
                        switch(Brand){
                            case 1:{PTxe.setBrand("HONDA");break;}
                            case 2:{PTxe.setBrand("YAMAHA");break;}
                            case 3:{PTxe.setBrand("SYM");break;}
                            case 4:{PTxe.setBrand(arr.set(3,"PIAGGIO"));break;}
                        }
                    }
                }while(Brand <= 0 || Brand > 4);

                System.out.println("Hay nhap vao SP ban muon tim: ");
                PTxe.setKind(input.nextLine());
                PTxe.setKind(input.nextLine());
                System.out.println("Hay nhap vao ma san pham:");
                PTxe.setCode(input.nextLine());
                System.out.println("Hay nhap vao gia san pham: ");
                PTxe.setPrice(input.nextDouble());
                System.out.println("-------INFO--------");
                System.out.println(PTxe.toString());
                PTxe.RangeOfVehicle();
                PTxe.inputDay();
                PTxe.outputDay();
                PTxe.employee();
                break;
            }
            case 4:{
                break;
            }
        }
        input.close();
    }
}