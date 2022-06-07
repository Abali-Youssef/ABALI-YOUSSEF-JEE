package com.abaliyoussef.mapper;

import com.abaliyoussef.dtos.CommentaireDTO;
import com.abaliyoussef.dtos.SessionDTO;
import com.abaliyoussef.entities.Commentaire;
import com.abaliyoussef.entities.Session;
import org.springframework.beans.BeanUtils;

public class MapperImpl {
    public CommentaireDTO fromCommentaire(Commentaire commentaire){
        CommentaireDTO commentaireDTO = new CommentaireDTO();
        BeanUtils.copyProperties(commentaire,commentaireDTO);
        return  commentaireDTO;
    }

    public Commentaire fromCommentaireDTO(CommentaireDTO commentaireDTO){
        Commentaire commentaire = new Commentaire();
        BeanUtils.copyProperties(commentaireDTO,commentaire);
        return  commentaire;
    }
    public SessionDTO fromSession(Session session){
        SessionDTO sessionDTO = new SessionDTO();
        BeanUtils.copyProperties(session,sessionDTO);
        return  sessionDTO;
    }
    public Session fromSessionDTO(SessionDTO sessionDTO){
        Session session = new Session();
        BeanUtils.copyProperties(sessionDTO,session);
        return session;
    }
}
