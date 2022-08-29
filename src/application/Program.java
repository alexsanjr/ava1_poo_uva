package application;

import entities.Computador;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Computador[] vect = new Computador[4];
        System.out.println("MONTE O SEU PC!!!!!");

        for (int i = 0; i < 2; i++) {
            System.out.println("Computador " + (i + 1)  + ":");
            System.out.print("Qual o modelo da placa mãe: ");
            String motherBoard = sc.nextLine();
            System.out.print("Marca do processador(CPU): ");
            String cpu = sc.nextLine();
            System.out.print("Quantidade de Ram(memória): ");
            int ram = sc.nextInt();
            System.out.print("Quantidade de armazenamento em gb: ");
            int hd = sc.nextInt();
            System.out.print("Quantidade de memória da placa de vídeo(GPU): ");
            int gpu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            vect[i] = new Computador(motherBoard, cpu, ram, hd, gpu);

        }

        for (int i = 2; i < 4; i++) {
            System.out.println("Computador " + (i + 1) + ":");
            vect[i] = new Computador();
            System.out.print("Qual o modelo da placa mãe: ");
            vect[i].setMotherBoard(sc.nextLine());
            System.out.print("Marca do processador(CPU): ");
            vect[i].setCpu(sc.nextLine());
            System.out.print("Quantidade de Ram(memória): ");
            vect[i].setRam(sc.nextInt());
            System.out.print("Quantidade de armazenamento em gb: ");
            vect[i].setHd(sc.nextInt());
            System.out.print("Quantidade de memória da placa de vídeo(GPU): ");
            vect[i].setGpu(sc.nextInt());
            sc.nextLine();
            System.out.println();
        }

        System.out.println("COMPUTADORES: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(vect[i].imprimir());
        }

        sc.close();
    }
}
