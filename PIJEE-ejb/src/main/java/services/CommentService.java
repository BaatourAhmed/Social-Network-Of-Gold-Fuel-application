package services;



import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Comment;

import interfaces.CommentServiceLocal;
import interfaces.CommentServiceRemote;

@Stateless
public class CommentService implements CommentServiceLocal,CommentServiceRemote {

	
	@PersistenceContext(unitName = "PIJEE-ejb")
	EntityManager em;
	
	

	@Override
	public int AddComment(Comment c) {
		System.out.println("In addComent : ");
		em.persist(c);
		System.out.println("Out of addComment" + c.getId());
		return c.getId();
		
	}



	@Override
	public List<Comment> FindAllComments(int id) {
		
			List<Comment> comments = em.createQuery("SELECT c FROM Comment c WHERE c.idpost="+String.valueOf(id), Comment.class).getResultList();
		
		return comments;
	}

}
