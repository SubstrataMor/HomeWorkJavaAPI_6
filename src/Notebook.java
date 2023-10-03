import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {

    private String name;
    private int volumeRAM;
    private int volumeHDD;
    private String operatingSystem;
    private String color;

    public Notebook(String name, int volumeRAM, int volumeHDD, String operatingSystem, String color) {
        this.name = name;
        this.volumeRAM = volumeRAM;
        this.volumeHDD = volumeHDD;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("RAM");
        list.add("HDD");
        list.add("OS");
        list.add("Сolor");

        return list;
    }

    @Override
    public String toString() {
        return """
                Название ноутбука: %s
                Объём оперативной памяти: %d Гб
                Объём жёсткого диска: %d Тб
                Операционная система: %s
                Цвет: %s 
                """.formatted(name,volumeRAM, volumeHDD, operatingSystem, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAM() {
        return volumeRAM;
    }

    public void setRAM(int volumeRAM) {
        this.volumeRAM = volumeRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getHDD() {
        return volumeHDD;
    }

    public void setHDD(int volumeHDD) {
        this.volumeHDD = volumeHDD;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
