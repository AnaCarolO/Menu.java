package org.bedu.java.jse.basico.sesion3.postwork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public byte leeOpcion(){
        System.out.println("\n Elige tu opcion: ");
        return scanner.nextByte();
    }

    public String leeCadena (){
        System.out.println("Cadena: ");
        return scanner.nextLine();

    }
}
