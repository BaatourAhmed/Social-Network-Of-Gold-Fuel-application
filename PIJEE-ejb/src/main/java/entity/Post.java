package entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Post
 *
 */
@Entity
@Table(name="post")
public class Post implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Post() {
		super();
	}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@JoinColumn(name="iduser",referencedColumnName="id")
	@ManyToOne
	private User iduser;
	
	public User getIduser() {
		return iduser;
	}

	public void setIduser(User iduser) {
		this.iduser = iduser;
	}

	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image")
	private String image;
	
	@Column(name="category")
	private String category;
	
	@Column(name="date")
	private Date date;
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
   
}
