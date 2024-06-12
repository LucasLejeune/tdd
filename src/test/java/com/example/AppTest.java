package com.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

class AppTest {
    @Test
    public void whenSearch_HasLessThanTwoCharacters() {
        RechercheVille rechercheVille = new RechercheVille();

        Assert.assertThrows(NotFound.class, () -> {
            rechercheVille.rechercher("a");
        } );
    }
}
