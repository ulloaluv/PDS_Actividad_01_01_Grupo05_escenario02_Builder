package com.mycompany.pds_actividad_01_01_grupo05_escenario01_builder;

public interface Builder {

  void setTipoActivo(TipoActivo type);
  void setCodigoActivo(int codigoActivo);
  void setNombreActivo(String nombreActivo);  
  void setCostoActivo(CostoActivo costoActivo);
  void setActivoDisponible(Boolean activoDisponible);
  void setCantidadActivos(int cantidadActivos);
  void setInventariarActivo(Boolean inventariarActivo);
  void setDepreciarActivo(Boolean depreciarActivo);
}
