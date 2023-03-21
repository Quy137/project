package KhoPhuTungXeMay;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danhsachptxecontay dsxecontay = new danhsachptxecontay();
        danhsachptxeso dsxeso = new danhsachptxeso();
        danhsachptxetayga dsxetayga = new danhsachptxetayga();
        int a;
// chọn menu
        do{
        System.out.println("--------MENU------");
        System.out.println("Hay nhap vao con so tuong ung trong menu:");
        System.out.println("1: Them vao danh sach PT danh cho xe con tay."); 
        System.out.println("2: Them vao danh sach PT danh cho xe so.");      
        System.out.println("3: Them vao danh sach PT danh cho xe tay ga.");   
        System.out.println("4:Xuat thong tin phu tung xe con tay.");   
        System.out.println("5:Xuat thong tin phu tung xe so.");        
        System.out.println("6:Xuat thong tin phu tung xe tay ga.");             
        System.out.println("7: Thoat.");
// nhập lại menu
        do{
            a =input.nextInt();
            if(a<=0 || a>9){
                System.out.println("----------ERROR----------");
                System.out.println("Vui long chon trong khoang 1 toi 9!!!!!");
                System.out.println("Hay nhap vao con so tuong ung trong menu:");
                System.out.println("Hay nhap vao con so tuong ung trong menu:");
                System.out.println("1: Them vao danh sach PT danh cho xe con tay."); 
                System.out.println("2: Them vao danh sach PT danh cho xe so.");      
                System.out.println("3: Them vao danh sach PT danh cho xe tay ga.");   
                System.out.println("4:Xuat thong tin phu tung xe con tay.");   
                System.out.println("5:Xuat thong tin phu tung xe so.");        
                System.out.println("6:Xuat thong tin phu tung xe tay ga.");             
                System.out.println("7: Thoat.");
            }
        }while(a<=0 || a>9);
// vào menu
        switch(a){
            case 1:{
                xecontay xecontay = new xecontay();
                System.out.println("Hay nhap vao loai phu tung: ");
                input.nextLine();
                String Kind = input.nextLine();
                System.out.println("Hay nhap vao hang san xuat: ");
                String Brand = input.nextLine();
                System.out.println("Hay nhap vao gia san pham: ");
                Double Price = input.nextDouble();
                System.out.println("Hay nhap vao ngay nhap kho: ");
                input.nextLine();
                String InPutDay = input.nextLine();
                System.out.println("Hay nhap vao ngay xuat kho: ");
                String OutPutDay = input.nextLine();
                xecontay = new xecontay(Kind, Brand, Price, InPutDay, OutPutDay);
                dsxecontay.addPT(xecontay);
                break;
                }
                case 2:{
                    System.out.println("Hay nhap vao loai phu tung: ");
                    input.nextLine();
                    String Kind = input.nextLine();
                    System.out.println("Hay nhap vao hang san xuat: ");
                    String Brand = input.nextLine();
                    System.out.println("Hay nhap vao gia san pham: ");
                    Double Price = input.nextDouble();
                    System.out.println("Hay nhap vao ngay nhap kho: ");
                    input.nextLine();
                    String InPutDay = input.nextLine();
                    System.out.println("Hay nhap vao ngay xuat kho: ");
                    String OutPutDay = input.nextLine();
                    xeso xeso = new xeso(Kind, Brand, Price, InPutDay, OutPutDay);
                    dsxeso.addPT(xeso);
                    break;
                }
                
                case 3:{
                    System.out.println("Hay nhap vao loai phu tung: ");
                    input.nextLine();
                    String Kind = input.nextLine();
                    System.out.println("Hay nhap vao hang san xuat: ");
                    String Brand = input.nextLine();
                    System.out.println("Hay nhap vao gia san pham: ");
                    Double Price = input.nextDouble();
                    System.out.println("Hay nhap vao ngay nhap kho: ");
                    input.nextLine();
                    String InPutDay = input.nextLine();
                    System.out.println("Hay nhap vao ngay xuat kho: ");
                    String OutPutDay = input.nextLine();
                    xetayga xetayga = new xetayga(Kind, Brand, Price, InPutDay, OutPutDay);
                    dsxetayga.addPT(xetayga);
                    break;
                }
                case 4:{
                    dsxecontay.xuatthongtin();
                    break;
                }
                case 5:{
                    dsxeso.xuatthongtin();
                    break;
                }
                case 6:{
                    dsxetayga.xuatthongtin();
                    break;
                }
                // case 7:{

                    
                // }
                
                
                
                
                
                
                
                
                
                
            
        }
    }while(a != 7);
                //     case 1:{
                    //         PTxe = new xecontay();
                    //         System.out.println("Ban dang tim SP cho xe con tay!!!");
                    //         System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
                    //         System.out.println("1.HONDA");
                    //         System.out.println("2.YAMAHA");
                    //         System.out.println("3.SUZUKI");
                    //         System.out.println("4.DUCATI");
                    //         int Brand;
                    //         do{
                        //             Brand = input.nextInt();
                        //             if(Brand <= 0 || Brand > 4){
                            //                 System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
                            //                 System.out.println("1.HONDA");
                            //                 System.out.println("2.YAMAHA");
                            //                 System.out.println("3.SUZUKI");
                            //                 System.out.println("4.DUCATI");
                            //             }else{
                                //                 switch(Brand){
                                    //                     case 1:{PTxe.setBrand("HONDA");break;}
                                    //                     case 2:{PTxe.setBrand("YAMAHA");break;}
                                    //                     case 3:{PTxe.setBrand("SUZUKI");break;}
                                    //                     case 4:{PTxe.setBrand("DUCATI");break;}
                                    //                 }
                                    //             }
                                    //         }while(Brand <= 0 || Brand > 4);
                                    
                                    //         System.out.println("Hay nhap vao SP ban muon tim: ");
                                    //         PTxe.setKind(input.nextLine());
                                    //         PTxe.setKind(input.nextLine());
                                    //         System.out.println("Hay nhap vao gia san pham: ");
                                    //         PTxe.setPrice(input.nextDouble());
                                    //         System.out.println("-------INFO--------");
                                    //         System.out.print(PTxe.toString());
                                    //         String b[] = PTxe.getKind().split(" ");
        //             for (String s : b){
        //                  System.out.print(s.charAt(0));
        //             }    
        //         PTxe.RangeOfVehicle();
        //         PTxe.inputDay();
        //         PTxe.outputDay();
        //         PTxe.employee();
        //         break;
        //     }
        //     case 2:{
            //         PTxe = new xeso();
            //         System.out.println("Ban dang tim SP cho xe so!!!");
            //         System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
        //         System.out.println("1.HONDA");
        //         System.out.println("2.YAMAHA");
        //         System.out.println("3.SUZUKI");
        //         System.out.println("4.SYM");
        //         int Brand;
        //         do{
            //             Brand = input.nextInt();
            //             if(Brand <= 0 || Brand > 4){
                //                 System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
                //                 System.out.println("1.HONDA");
                //                 System.out.println("2.YAMAHA");
                //                 System.out.println("3.SUZUKI");
                //                 System.out.println("4.SYM");
                //             }else{
                    //                 switch(Brand){
        //                     case 1:{PTxe.setBrand("HONDA");break;}
        //                     case 2:{PTxe.setBrand("YAMAHA");break;}
        //                     case 3:{PTxe.setBrand("SUZUKI");break;}
        //                     case 4:{PTxe.setBrand("SYM");break;}
        //                 }
        //             }
        //         }while(Brand <= 0 || Brand > 4);
        
        //         System.out.println("Hay nhap vao SP ban muon tim: ");
        //         PTxe.setKind(input.nextLine());
        //         PTxe.setKind(input.nextLine());
        //         System.out.println("Hay nhap vao gia san pham: ");
        //         PTxe.setPrice(input.nextDouble());
        //         System.out.println("-------INFO--------");
        //         System.out.print(PTxe.toString());
        //         String b[] = PTxe.getKind().split(" ");
        //             for (String s : b){
        //                  System.out.print(s.charAt(0));
        //             }    
        //         PTxe.RangeOfVehicle();
        //         PTxe.inputDay();
        //         PTxe.outputDay();
        //         PTxe.employee();
        //         break;
        //     }
        //     case 3:{
            //         PTxe = new xetayga();
            //         System.out.println("Ban dang tim SP cho xe tay ga!!!");
            //         System.out.println("Hay nhap vao 1 trong nhung hang sau: ");
            //         System.out.println("1.HONDA");
            //         System.out.println("2.YAMAHA");
            //         System.out.println("3.SYM");
            //         System.out.println("4.PIAGO");
            //         int Brand;
            //         do{
                //             Brand = input.nextInt();
                //             if(Brand <= 0 || Brand > 4){
        //                 System.out.println("Chung toi khong co SP cua hang san xuat nay!!!\nVui long nhap lai!!!");
        //                 System.out.println("1.HONDA");
        //                 System.out.println("2.YAMAHA");
        //                 System.out.println("3.SYM");
        //                 System.out.println("4.PIAGO");
        //             }else{
            //                 switch(Brand){
                //                     case 1:{PTxe.setBrand("HONDA");break;}
                //                     case 2:{PTxe.setBrand("YAMAHA");break;}
                //                     case 3:{PTxe.setBrand("SYM");break;}
                //                     case 4:{PTxe.setBrand("PIAGO");break;}
                //                 }
                //             }
                //         }while(Brand <= 0 || Brand > 4);

        //         System.out.println("Hay nhap vao SP ban muon tim: ");
        //         PTxe.setKind(input.nextLine());
        //         PTxe.setKind(input.nextLine());
        //         System.out.println("Hay nhap vao gia san pham: ");
        //         PTxe.setPrice(input.nextDouble());
        //         System.out.println("-------INFO--------");
        //         System.out.print(PTxe.toString());
        //         String b[] = PTxe.getKind().split(" ");
        //             for (String s : b){
            //                  System.out.print(s.charAt(0));
            //             }    
            //         PTxe.RangeOfVehicle();
            //         PTxe.inputDay();
            //         PTxe.outputDay();
            //         PTxe.employee();
        //         break;
        //     }
        //     case 4:{
        //         break;
        //     }
    input.close();
}
}
