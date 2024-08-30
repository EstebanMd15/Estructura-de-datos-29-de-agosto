
package Ejercicio1;

import java.util.Scanner;

public class Datos {
    String temperaturas[][] = new String[2][2];
    Scanner in = new Scanner(System.in);
    
    //guardare ciudad/ temperatura
    void registrarDatos(){
        System.out.println("Registro de Datos");
        String city= null, valorTem=null;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Ciudad: ");
            city=in.next();
            temperaturas[i][0]=city;
            System.out.println("Temperatura: ");
            valorTem=in.next();
            temperaturas[i][1]=valorTem;
        }
        System.out.println("Datos Registrados");
    }
    
    void listar(){
        System.out.println("Mostrando Datos");
        System.out.println("CIUDAD/TEMPERATURA");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i][0]+"/"+temperaturas[i][1]);
            
        }
    }
    
    void buscarCiudad(){
        System.out.println("Ciudad a buscar: ");
        String busqueda = in.next();
        boolean bandera = true;
        for (int i = 0; i < temperaturas.length; i++) {
            if( temperaturas[i][0].equals(busqueda)){
                bandera = true;
            System.out.println("La temperatura es: "+temperaturas[i][1]);
            } 
        }
    }
    //temperaturas.length = total de fulas en la matriz
    void verPomedioTemperaturas(){
        double tempeGuardada=0, acumulador=0, promedio=0;
        for (int i = 0; i < temperaturas.length; i++) {
           
           //convertir String a double
        tempeGuardada = Double.parseDouble(temperaturas[i][1]);
           //acumula las temperaturas. uso el acumulador
           acumulador = acumulador + tempeGuardada;
        } 
        
        //obtengo el promedio
        promedio = acumulador / temperaturas.length;
        System.out.println("El promedio de las temperaturas es: "+ promedio);
        
        
        
    }
    void mostrarMenu(){
        int opcion;
        do {
        System.out.println("---MENU DE OPCIONES---");
        System.out.println("1. Registrar Datos");
        System.out.println("2. Listar Datos");
        System.out.println("3. Buscar Ciudad");
        System.out.println("4. Promedio De Las Temperaturas");
        System.out.println("5. Salir");
        
        System.out.println("\nDigite una opcion");
        opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                this.registrarDatos();
                break;
            case 2:
                this.listar();
                break;
            case 3:
                this.buscarCiudad();
                break;
            case 4:
                this.verPomedioTemperaturas();
                break;
        }
        
    } while(opcion > 0 && opcion < 5);
        System.out.println("CHAO!!!");
    }
}

