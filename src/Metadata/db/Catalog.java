package Metadata.db;

import javax.persistence.Entity;
import javax.persistence.Table;

import Metadata.metamodel.MetaObject;

@Entity
@Table(name="MDR_DB_CATALOG")
public class Catalog extends MetaObject{

}
