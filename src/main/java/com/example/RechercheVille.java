package com.example;

import java.util.ArrayList;
import java.util.List;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public class RechercheVille {
    private List<String> villes;
   
    public RechercheVille(List<String> villes){
        this.villes = villes;
    }

   public List<String> rechercher(String mot) throws NotFound, UnsupportedOperationException  {
    if (mot.length() < 2) {
        throw new NotFound();
    }
    List<String> results = new ArrayList<String>();
    for (String ville : villes) {
        if (ville.startsWith(mot)) {
            results.add(ville);
        }
    }
    return results;
   }
}
