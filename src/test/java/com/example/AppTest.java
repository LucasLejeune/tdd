package com.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppTest {
    private RechercheVille rechercheVilleIni(){
        List<String> villes = new ArrayList<>();
        villes.addAll(Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul"));
        RechercheVille rechercheVille = new RechercheVille(villes);
        return rechercheVille;
    }

    @Test
    public void whenSearch_HasLessThanTwoCharacters() {
        RechercheVille rechercheVille = this.rechercheVilleIni();

        Assert.assertThrows(NotFound.class, () -> {
            rechercheVille.rechercher("a");
        } );
    }

    @Test
    public void whenSeach_HasMoreThanOneCharacter_ReturnListOfCitiesThatStartWithTheResearch() throws NotFound, UnsupportedOperationException{
        RechercheVille rechercheVille = this.rechercheVilleIni();

        List<String> results = rechercheVille.rechercher("Va");
        List<String> expectedList = new ArrayList<String>();
        expectedList.addAll(Arrays.asList("Valence", "Vancouver"));

        Assert.assertArrayEquals(expectedList.toArray(), results.toArray());
    }

    @Test
    public void whenSeach_HasMoreThanOneCharacter_ReturnListOfCitiesThatStartWithTheResearchNotCaseSensitive() throws NotFound, UnsupportedOperationException{
        RechercheVille rechercheVille = this.rechercheVilleIni();

        List<String> results = rechercheVille.rechercher("va");
        List<String> expectedList = new ArrayList<String>();
        expectedList.addAll(Arrays.asList("Valence", "Vancouver"));

        Assert.assertArrayEquals(expectedList.toArray(), results.toArray());
    }
}
