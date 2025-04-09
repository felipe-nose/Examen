import java.util.Scanner;

public class examencito {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double CAMISETAS=25000,PANTALONES=45000,CHAQUETAS=65000,ACUMULADO1=0,ACUMULADO2=0,ACUMULADO3=0;
    double Total=0,iva=0,descuento=0,a=0;
    int cantidad=0;
    int venta=0;


    
    do {System.out.println("selecione el producto que desea comprar:");
    System.out.println("1.camisetas 2.pantalones 3.chaquetas 4.Terminar");
    venta=scanner.nextInt();
        
if (venta==1) {
    System.out.println("ingrese la cantidad de camisetas que desea comprar");
    cantidad=scanner.nextInt();
ACUMULADO1=CAMISETAS*cantidad;
iva=ACUMULADO1*0.19;

    if ((cantidad>=3)&&(cantidad<=4)) {
        descuento=ACUMULADO1*0.10;
        
    }
    if (cantidad>4) {
        descuento=ACUMULADO1*0.15;
        
    }
    
ACUMULADO1=ACUMULADO1+iva-descuento;
    System.out.println("Tiene un acumulado de: $"+ACUMULADO1);


    System.out.println("Selecione el producto que desea agregar a la lista: ");
    System.out.println("1.camisetas 2.pantalones 3.chaquetas 4.Terminar");
    venta=scanner.nextInt();
    Total=ACUMULADO1+ACUMULADO2+ACUMULADO3;
    iva=0;
    descuento=0;
} 



if (venta==2) {
        System.out.println("Ingrese la cantidad de patalones que desea comprar");
        cantidad=scanner.nextInt();
        ACUMULADO2=PANTALONES*cantidad;
        iva=ACUMULADO2*0.19;

    if ((cantidad>=3)&&(cantidad<=4)) {
        descuento=ACUMULADO2*0.10;
        
    }
    if (cantidad>4) {
        descuento=ACUMULADO2*0.15;
        
    }
    
        ACUMULADO2=ACUMULADO2+iva-descuento;
    System.out.println("Tiene un acumulado de: $"+ACUMULADO2);

    System.out.println("Selecione el producto que desea agregar a la lista: ");
System.out.println("1.camisetas 2.pantalones 3.chaquetas 4.Terminar");
venta=scanner.nextInt();
Total=ACUMULADO1+ACUMULADO2+ACUMULADO3;
iva=0;
descuento=0;
    } 



if (venta==3) {
            System.out.println("Ingrese la cantidad de cahquetas que desea comprar");
            cantidad=scanner.nextInt();
            ACUMULADO3=CHAQUETAS*cantidad;
            iva=ACUMULADO3*0.19;
        if ((cantidad>=3)&&(cantidad<=4)) {
            descuento=ACUMULADO3*0.10;
        ;
        }
        if (cantidad>4) {
            descuento=ACUMULADO3*0.15;
        ;
        }
        ;
            ACUMULADO3=ACUMULADO3+iva-descuento;
        System.out.println("Tiene un acumulado de: $"+ACUMULADO3);
            
        System.out.println("Selecione el producto que desea agregar a la lista: ");
        System.out.println("1.camisetas 2.pantalones 3.chaquetas 4.Terminar");
        venta=scanner.nextInt();
        Total=ACUMULADO1+ACUMULADO2+ACUMULADO3;
        iva=0;
        descuento=0;
        }
    

Total=ACUMULADO1+ACUMULADO2+ACUMULADO3;

    } while (venta!=4);
    System.out.println("Total a pagar $"+Total);
}

}