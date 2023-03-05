package org.rlnieto.organizalia.locales.api;

import org.rlnieto.organizalia.locales.model.Local;
import org.rlnieto.organizalia.locales.model.SearchLocal;
import org.rlnieto.organizalia.locales.utils.LocalesProducer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

public class LocalesApiImpl implements LocalesApi {

    public void deletelocal(@PathParam("localId") String localId){
        System.out.println("Borrar local...");
    }

    public Local getlocal(@PathParam("localId") String localId){
        System.out.println("Detalle de un local...");
        return LocalesProducer.baritono();
    }

    public void updatelocal(@PathParam("localId") String localId,@Valid @NotNull Local local) {
        System.out.println("Actualizar un local...");
    }

    public List<Local> searchLocal(@QueryParam("city")   Integer city){
        System.out.println("Búsqueda por ciudad...");
        List<Local>locales = new ArrayList<Local>();
        locales.add(LocalesProducer.baritono());
        locales.add(LocalesProducer.laConquista());

        return locales;
    }


}
