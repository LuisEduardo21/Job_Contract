package Entididades;

import Entidies.Enum.OrderStatus;

import java.util.Date;

public class Departament {
    private String name;

    public Departament(){
    }

    public Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
