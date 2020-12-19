
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Bu yapı FileReader için kuruldu TAMAMEN
        //KAYNAK = Mustafa Murat Coskun UDEMY JAVA 
        /*
        FileReadar,BufferedReader Okuma Islemleri ve BufferedWrite ile Yazma Islemleri FARKLAR ==  
        Dosya okuma işlemlerini fileinput stream ile gerçekleştiriyorduk 
        Eğer Dosyamız txt dosyası ise bizim bunları FileReader yada BufferedReader ile okumamız çok daha effektif oluyor.
        
        */
        
      //  try(FileReader reader = new FileReader("ogrenciler.txt")){//Bu yapı ile ogrenci adlı txt dosyamız açılmış oldu  ...
            try(Scanner scn = new Scanner(new FileReader("ogrenciler.txt"))){//burada yaptığımız işlem önceden yapılan Console okuma işlemini dosya okuma olarak güncellemek bu kadar basit
                
            
            //Dosya okuma işlemlerinin gerçekleştirileceği alan == 
             
            //Tek satırı okumamız için bir methodumuz bulunmuyor biz bu sorunu çözmek için scanner objesini oluştururken kullandığımız system.in yerine doyamızı göndererek sorunu çözmüş olacağız == 
             
            //burada nextline-hasnextline() == \n görene kadar devam eden bir yapımız var (okuyacak herhangi bir değer varmı gibi bir sorgusu var )
            
            while(scn.hasNextLine()){//Okuyacak başka satırlarımız bitene kadar devam edecek bir döngü
                
           /*     System.out.println("Okuma işlemi başlatılıyor Lütfen Bekleyiniz...");
                Thread.sleep(1000);
                System.out.println("Okuma işlemi için herhangi bir sorunla Karşılaşılmadı : "+"\n"
                        + "Okunan Satır = "+scn.nextLine());
                System.out.println("************************************");
                Thread.sleep(1000);*/
           
           String ogrenciBilgisi = scn.nextLine();
           
           String [] array = ogrenciBilgisi.split(",");//içerisine Gönderdiğimiz değere göre Yapımız Parçalanmış oluyor.Biz Splitten dönen değeri bir adet String-Array atayabiliriz...
           //Virgül iye ayırma işlemi yapmak isteğimizi belirttik
           
           if(array[1].equals("Bilgisayar Mühendisliği")){
               System.out.println("Öğrenci Bilgisi İşleniyor ....");
               Thread.sleep(1500);
               System.out.println("Öğrenci bilgisi = " +ogrenciBilgisi);
           }
                
            }
            
        }catch(FileNotFoundException ex){
            
            System.out.println("Dosya bulunamadı");
            
            Thread.sleep(2000);
            
            System.out.println("bir FileNotFoundException hatası meydana geldi ");
            
        }catch(IOException ex){
            
            System.out.println("Dosya Açılırken bir hata meydana geldi");
            
            Thread.sleep(1500);
            
            System.out.println("bir IOException hatası meydana geldi ");
            
        }
    }
    
}
