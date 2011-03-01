package Metadata;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "HBASSOCIATION")
public class HBAssociation {

	@Id
	@Column(name = "ID", length = 32)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;
	
	@ManyToOne
	private HBAttribute end1 = null;
	
	@ManyToOne
	private HBAttribute end2 = null;
	
	@OneToMany
	private List<HBLink> links = new ArrayList<HBLink>();

	public void setEnd1(HBAttribute end1) {
		this.end1 = end1;
	}

	public HBAttribute getEnd1() {
		return end1;
	}

	public void setEnd2(HBAttribute end2) {
		this.end2 = end2;
	}

	public HBAttribute getEnd2() {
		return end2;
	}

	public void setLinks(List<HBLink> links) {
		this.links = links;
	}

	public List<HBLink> getLinks() {
		return links;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}