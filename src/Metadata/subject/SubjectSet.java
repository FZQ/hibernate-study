package Metadata.subject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Metadata.metamodel.MetaObject;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "MDR_SUBJECT_SUBJECTSET")
public class SubjectSet extends MetaObject {

	@OneToMany
	private List<Subject> subjects = new ArrayList<Subject>();

	@ManyToOne
	@JoinColumn(name = "DOMAINID")
	private SubjectDomain owner = null;

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setOwner(SubjectDomain owner) {
		this.owner = owner;
	}

	public SubjectDomain getOwner() {
		return owner;
	}

}
