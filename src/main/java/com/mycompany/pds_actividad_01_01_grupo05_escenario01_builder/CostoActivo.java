package com.mycompany.pds_actividad_01_01_grupo05_escenario01_builder;

public class CostoActivo {

  private Integer valorMonetario;

    public Integer getValorMonetario() {
        return valorMonetario;
    }

    public void setValorMonetario(Integer valorMonetario) {
        this.valorMonetario = valorMonetario;
    }

    public CostoActivo(Integer valorMonetario) {
        this.valorMonetario = valorMonetario;
    }
}
