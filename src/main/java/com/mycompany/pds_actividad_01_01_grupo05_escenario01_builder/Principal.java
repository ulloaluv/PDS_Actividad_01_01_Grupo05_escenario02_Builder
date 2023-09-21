package com.mycompany.pds_actividad_01_01_grupo05_escenario01_builder;

public class Principal {

  public static void main(String[] args) {
    Usuario usuario = new Usuario();          
    // MESA
    ActivoBuilder builder_01 = new ActivoBuilder();    
    usuario.createMesa(builder_01);
    Activo activo_01 = builder_01.getActivo();
    System.out.println("/*** DATOS DEL ACTIVO ***/");    
    System.out.println("TIPO: " + activo_01.getTipoActivo());
    System.out.println("CODIGO: " + activo_01.getCodigoActivo());    
    System.out.println("NOMBRE: " + activo_01.getNombreActivo());                
    System.out.println("COSTO: " + activo_01.getCostoActivo().getValorMonetario());                
    System.out.println("DEPRECIAR: " + activo_01.getDepreciarActivo().toString());                    
    System.out.println("CANTIDAD: " + activo_01.getCantidadActivos());        
    System.out.println("INVENTARIAR: " + activo_01.getInventariarActivo().toString());                    
    System.out.println("ACTIVO DISPONIBLE: " + activo_01.getActivoDisponible().toString());                    
    // AUTO
    ActivoBuilder builder_02 = new ActivoBuilder();        
    usuario.createAuto(builder_02);
    Activo activo_02 = builder_02.getActivo();
    System.out.println("/*** DATOS DEL ACTIVO ***/");    
    System.out.println("TIPO: " + activo_02.getTipoActivo());
    System.out.println("CODIGO: " + activo_02.getCodigoActivo());    
    System.out.println("NOMBRE: " + activo_02.getNombreActivo());                
    System.out.println("COSTO: " + activo_02.getCostoActivo().getValorMonetario());                
    System.out.println("DEPRECIAR: " + activo_02.getDepreciarActivo().toString());                        
    System.out.println("CANTIDAD: " + activo_02.getCantidadActivos());        
  }

}
