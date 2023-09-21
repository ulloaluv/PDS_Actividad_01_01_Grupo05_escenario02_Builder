package com.mycompany.pds_actividad_01_01_grupo05_escenario01_builder;

public class Activo {

  private  TipoActivo tipoActivo;
  private  Integer codigoActivo;
  private  String nombreActivo;
  private  CostoActivo costoActivo;
  private  Boolean activoDisponible;
  private  Integer cantidadActivos;
  private  Boolean inventariarActivo;
  private  Boolean depreciarActivo;

  public Activo(TipoActivo tipoActivo, Integer codigoActivo, String nombreActivo, CostoActivo costoActivo, Boolean activoDisponible, Integer cantidadActivos, Boolean inventariarActivo, Boolean depreciarActivo) {
    this.tipoActivo = tipoActivo;
    this.codigoActivo = codigoActivo;
    this.nombreActivo = nombreActivo;
    this.costoActivo = costoActivo;
    this.activoDisponible = activoDisponible;
    this.cantidadActivos = cantidadActivos;
    this.inventariarActivo = inventariarActivo;
    this.depreciarActivo = depreciarActivo;
  }

  public void setNombreActivo(String nombreActivo) {
    this.nombreActivo = nombreActivo;
  }

  public void setCostoActivo(CostoActivo costoActivo) {
    this.costoActivo = costoActivo;
  }

  public void setActivoDisponible(Boolean activoDisponible) {
    this.activoDisponible = activoDisponible;
  }

  public void setCantidadActivos(Integer cantidadActivos) {
    this.cantidadActivos = cantidadActivos;
  }

  public void setInventariarActivo(Boolean inventariarActivo) {
    this.inventariarActivo = inventariarActivo;
  }

  public void setDepreciarActivo(Boolean depreciarActivo) {
    this.depreciarActivo = depreciarActivo;
  }

  public String getNombreActivo() {
    return nombreActivo;
  }

  public CostoActivo getCostoActivo() {
    return costoActivo;
  }

  public Boolean getActivoDisponible() {
    return activoDisponible;
  }

  public Integer getCantidadActivos() {
    return cantidadActivos;
  }

  public Boolean getInventariarActivo() {
    return inventariarActivo;
  }

  public Boolean getDepreciarActivo() {
    return depreciarActivo;
  }

  public TipoActivo getTipoActivo() {
    return tipoActivo;
  }

  public Integer getCodigoActivo() {
    return codigoActivo;
  }
}
