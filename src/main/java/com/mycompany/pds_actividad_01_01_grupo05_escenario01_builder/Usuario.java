package com.mycompany.pds_actividad_01_01_grupo05_escenario01_builder;

public class Usuario {

  public void createMesa(Builder builder) {
    builder.setTipoActivo(TipoActivo.MESA);
    builder.setCodigoActivo(100);
    builder.setNombreActivo("Mesa de Metal");    
    CostoActivo costoActivo = new CostoActivo(1200);   
    builder.setCostoActivo(costoActivo);    
    builder.setDepreciarActivo(Boolean.TRUE);
    builder.setCantidadActivos(7);
    builder.setInventariarActivo(Boolean.TRUE);
    builder.setActivoDisponible(Boolean.TRUE);

  }

   public void createSilla(Builder builder) {
    builder.setTipoActivo(TipoActivo.SILLA);
    builder.setCodigoActivo(200);
    builder.setNombreActivo("Silla de Madera");        
    CostoActivo costoActivo = new CostoActivo(85);
    builder.setCostoActivo(costoActivo);    
    builder.setCantidadActivos(50);
  }

  public void createAuto(Builder builder) {
    builder.setTipoActivo(TipoActivo.AUTO);
    builder.setCodigoActivo(300);
    builder.setNombreActivo("Automovil de la Empresa");            
    CostoActivo costoActivo = new CostoActivo(35000);    
    builder.setCostoActivo(costoActivo);    
    builder.setDepreciarActivo(Boolean.TRUE);
    builder.setCantidadActivos(2);
  }

  public void createComputador(Builder builder) {
    builder.setTipoActivo(TipoActivo.COMPUTADOR);
    CostoActivo costoActivo = new CostoActivo(1450);
    builder.setCostoActivo(costoActivo);    
    builder.setCodigoActivo(400);
    builder.setDepreciarActivo(Boolean.TRUE);
    builder.setCantidadActivos(2);
    builder.setInventariarActivo(Boolean.TRUE);
  }

}