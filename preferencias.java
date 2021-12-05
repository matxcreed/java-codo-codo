import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Ingrese su Nombre");
    String user_name = myObj.nextLine(); 
    
    System.out.println("Ingrese su Apellido");
    String user_lastname = myObj.nextLine();
    
    System.out.println("Ingrese su Edad");
    String user_age = myObj.nextLine(); 

    
    System.out.println("Ingrese su Hobbie preferido");
    String user_hobbie = myObj.nextLine(); 

    System.out.println("Ingrese su IDE");
    String user_ide = myObj.nextLine(); 

    System.out.println("Ingrese su OS");
    String user_os = myObj.nextLine(); 
    
    System.out.println("Nombre: " + user_name); 
    System.out.println("Apellido: " + user_lastname);
    System.out.println("Edad: " + user_age);
    System.out.println("Hobbie: " + user_hobbie);
    System.out.println("IDE: " + user_ide);
    System.out.println("Sistema Operativo: " + user_os);
    
}}
  
