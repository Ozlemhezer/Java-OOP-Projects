/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

interface PromotionBehaviour{
    double getPromotion();
}
interface BonusSalaryBehaviour{
    double getBonusSalary();
}
abstract class Devoloper{
    String fullName;
    int id;
    public Devoloper(){
    }
    public Devoloper(int id,String fullName){
        this.id=id;
        this.fullName=fullName;
    }
    abstract double income();
}
class RegularDevoloper extends Devoloper{
    double monthlySalary;
    RegularDevoloper(){
        
    }
    RegularDevoloper(int id,String fullName,double monthlySalary){
        this.id=id;
        this.fullName=fullName;
        this.monthlySalary=monthlySalary;
    }
    double income(){
        return monthlySalary;
    }
}
class SeniorDevoloper extends RegularDevoloper implements PromotionBehaviour{
    SeniorDevoloper(){
        
    }
    SeniorDevoloper(int id, String fullName,double monthlySalary ){
        super(id,fullName,monthlySalary);
    }
    public double getPromotion(){
        return 1.5*monthlySalary;
    }
    double income(){
        return monthlySalary+getPromotion();
    }
}
class FreelanceDevoloper extends Devoloper implements BonusSalaryBehaviour{
    int hours;
    int unitPrice;
    FreelanceDevoloper(){
    }
    FreelanceDevoloper(int id,String fullName,int hours){
        this.id=id;
        this.fullName=fullName;
        this.hours=hours;
    }
    double income(){
        return hours*unitPrice+getBonusSalary();
        
    }
    public double getBonusSalary(){
        return hours*1.5;
    }
    
}

public class JavaApplication27 {

    
    public static void main(String[] args) {
        RegularDevoloper dev1= new RegularDevoloper(1,"Özlem Hezer",20000);
        System.out.println("çalışan id:"+dev1.id+"\nçalışanın adı:"+dev1.fullName+"\nçalışanın aylık maaşı:"+dev1.monthlySalary);
        System.out.println("düzenli çalışan geliştiricinin aylık toplam geliri:"+dev1.income());
        SeniorDevoloper sen1=new SeniorDevoloper(2,"Medine Tıraş",20000);
        System.out.println("Senior geliştiricinin adı:"+sen1.fullName+"\nSenior geliştirici id:"+sen1.id+"\nSenior geliştiricinin aylık maaşı:"+sen1.monthlySalary);
        System.out.println("Senior geliştiricinin aylık promosyonu:"+sen1.getPromotion());
        System.out.println("Senior geliştiricinin aylık toplam geliri:"+sen1.income());
        FreelanceDevoloper free1=new FreelanceDevoloper(3,"Betül Topaloğlu",160);
        System.out.println("Freelance çalışan geliştirici id:"+free1.id+"\nFreelance çalışan geliştiricinin adı:"+free1.fullName+"\nSenior geliştiricinin aylık toplam çalışma saati:"+free1.hours);
        free1.unitPrice=10;
        System.out.println("Freelance çalışan gelişticinin Bonus maaşı:"+free1.getBonusSalary());
        System.out.println("Freelance çalışan geliştiricinin aylık toplam geliri:"+free1.income());
    }
    
}
