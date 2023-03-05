package org.rlnieto.organizalia.locales.utils;

import org.rlnieto.organizalia.locales.model.Local;

public class LocalesProducer {

    public static Local baritono(){
        Local myLocal = new Local();
        myLocal.setAbierto(true);
        myLocal.setLocalidad("Coruña (A)");
        myLocal.setaDomicilio(false);
        myLocal.setTipoLocal("Restaurante");
        myLocal.setDireccion("Rúa Ángel");
        myLocal.setCodigoPostal(15001);
        myLocal.setId(1);
        myLocal.setNumero("9");
        myLocal.setNombre("Barítono");
        myLocal.setParaLlevar(false);
        myLocal.setTipoCocina("moderna");
        myLocal.setTelefono("881 92 24 12");

        return myLocal;
    }

    public static Local laConquista(){
        Local myLocal = new Local();
        myLocal.setAbierto(true);
        myLocal.setLocalidad("Coruña (A)");
        myLocal.setaDomicilio(false);
        myLocal.setTipoLocal("Restaurante");
        myLocal.setDireccion("Rúa Emilia Pardo Bazán");
        myLocal.setCodigoPostal(15005);
        myLocal.setId(2);
        myLocal.setNumero("23");
        myLocal.setNombre("La conquista");
        myLocal.setParaLlevar(false);
        myLocal.setTipoCocina("peruana");
        myLocal.setTelefono("981 92 87 92");

        return myLocal;
    }


}
