package org.example.service;

import org.example.exception.MauvaisPost;
import org.example.exception.MauvaiseReponse;
import org.example.modele.ElementContenu;
import org.example.modele.Post;
import org.example.modele.Reponse;

import java.util.ArrayList;
import java.util.List;

public class ServiceImplementation implements Service{

    private List<Post> posts = new ArrayList<Post>();
    private List<Reponse> reponses = new ArrayList<Reponse>();
    @Override
    public void creerPost(Post post) throws MauvaisPost {
        //validation des données
        if (post.contenu == null)throw new MauvaisPost();
        posts.add(post);
    }

    @Override
    public void creerReponse(Reponse reponse) throws MauvaiseReponse {
        if (reponse.contenu == null)throw new MauvaiseReponse();
        if (posts.contains(reponse.element) || reponses.contains(reponse.element)){
            // good
        }else {

            throw new MauvaiseReponse();

        }
        reponses.add(reponse);
    }

    @Override
    public List<Post> tousLesPosts() {
        return null;
    }

    @Override
    public List<Reponse> reponsesPour(ElementContenu elt) {
        return null;
    }
}
