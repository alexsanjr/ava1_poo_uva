package entities;

public class Computador {
    private String motherBoard;
    private String cpu;
    private int ram;
    private int hd;
    private int gpu;

    public  Computador() {
    }

    public Computador(String motherBoard, String cpu, int ram, int hd, int gpu) {
        this.motherBoard = motherBoard;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getGpu() {
        return gpu;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    public String imprimir() {
        return "Placa mãe: "
                + motherBoard + ", Processador(CPU): "
                + cpu + ", Ram: " + ram + "gb, HD: "
                + hd + "gb, Placa de Vídeo(GPU): " + gpu + "gb";
    }
}
