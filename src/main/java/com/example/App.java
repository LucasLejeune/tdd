package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public final class App {
    private App() {
    }

    public static void main(String[] args) throws NotFound, UnsupportedOperationException {
        List<String> villes = new ArrayList<>();
        villes.addAll(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"));
        RechercheVille rechercheVille = new RechercheVille(villes);
        rechercheVille.rechercher("Paris");
    }
}
