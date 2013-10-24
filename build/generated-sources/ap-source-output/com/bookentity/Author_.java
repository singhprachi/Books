package com.bookentity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-23T23:02:08")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> lastName;
    public static volatile SingularAttribute<Author, String> name;
    public static volatile SingularAttribute<Author, Date> birthdate;
    public static volatile SingularAttribute<Author, Integer> authorId;

}