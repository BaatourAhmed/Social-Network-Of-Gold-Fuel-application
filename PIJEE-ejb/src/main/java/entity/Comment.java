package entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity
@Table(name="comment")
public class Comment implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Comment() {
		super();
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JoinColumn(name="idpost",referencedColumnName="id")
	@ManyToOne
	private Post idpost;
	
	@JoinColumn(name="iduser",referencedColumnName="id")
	@ManyToOne
	private User iduser;
	
	
	public User getIduser() {
		return iduser;
	}

	public void setIduser(User iduser) {
		this.iduser = iduser;
	}

	public Post getIdpost() {
		return idpost;
	}

	public void setIdpost(Post idpost) {
		this.idpost = idpost;
	}

	@Column(name="comment")
	private String comment;
	
	@Column(name="date")
	private Date date;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
   
}
