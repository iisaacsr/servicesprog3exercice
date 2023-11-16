package org.example.service;

import org.example.exception.MauvaisPost;
import org.example.exception.MauvaiseReponse;
import org.example.modele.ElementContenu;
import org.example.modele.Post;
import org.example.modele.Reponse;
import java.util.List;

public interface Service {

    void creerPost(Post post) throws MauvaisPost;

    void creerReponse(Reponse reponse) throws MauvaiseReponse;

    List<Post> tousLesPosts();

    List<Reponse> reponsesPour(ElementContenu elt);

}
