package com.bookentity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-23T23:02:08")
@StaticMetamodel(Books.class)
public class Books_ { 

    public static volatile SingularAttribute<Books, Integer> id;
    public static volatile SingularAttribute<Books, String> author;
    public static volatile SingularAttribute<Books, String> title;
    public static volatile SingularAttribute<Books, String> category;

}