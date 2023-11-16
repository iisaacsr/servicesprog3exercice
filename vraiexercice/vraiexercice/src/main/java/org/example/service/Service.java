package org.example.service;

import org.example.Exceptions.EtudiantInvalide;
import org.example.Exceptions.MauvaiseEpreuve;
import org.example.modele.ElementNote;
import org.example.modele.Epreuve;
import org.example.modele.Etudiant;

import java.util.List;

public interface Service {

    void creerEtudiant(Etudiant etudiant) throws EtudiantInvalide;

    void creerEpreuve(Epreuve epreuve) throws MauvaiseEpreuve;
    int calculerPonderation (Etudiant etudiant, List<Epreuve> epreuves);
    String detailSituationEtudiant(Etudiant etudiant);
    List<Epreuve> toutesLesEpreuves (ElementNote elt);
    List<Etudiant> tousLesEtudiants();






}
