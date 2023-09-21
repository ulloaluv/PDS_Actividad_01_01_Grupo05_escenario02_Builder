package com.mycompany.pds_actividad_01_01_grupo05_escenario01_builder;

public class ActivoBuilder implements Builder {

  private  Integer codigoActivo;
  private  TipoActivo tipoActivo;
  private  String nombreActivo;
  private  CostoActivo costoActivo;
  private  Boolean inventariarActivo;
  private  Integer cantidadActivos;  
  private  Boolean activoDisponible;
  private  Boolean depreciarActivo;
  
    @Override
  public void setTipoActivo(TipoActivo type) {
    this.tipoActivo = type;
  }

  @Override
  public void setCodigoActivo(int codigoActivo) {
    this.codigoActivo = codigoActivo;
  }

  @Override
  public void setNombreActivo(String nombreActivo) {
    this.nombreActivo = nombreActivo;
  }
  
  @Override
  public void setCostoActivo(CostoActivo costoActivo) {
    this.costoActivo = costoActivo;
  }

  @Override
  public void setActivoDisponible(Boolean activoDisponible) {
    this.activoDisponible = activoDisponible;
  }

  @Override
  public void setCantidadActivos(int cantidadActivos) {
      this.cantidadActivos = cantidadActivos;
  }

  @Override
  public void setInventariarActivo(Boolean inventariarActivo) {
    this.inventariarActivo = inventariarActivo;
  }

  @Override
  public void setDepreciarActivo(Boolean depreciarActivo) {
    this.depreciarActivo = depreciarActivo;
  }

  public Activo getActivo() {

    return new Activo(tipoActivo, codigoActivo, nombreActivo, costoActivo, activoDisponible, cantidadActivos, inventariarActivo, depreciarActivo);
      
  }

}
