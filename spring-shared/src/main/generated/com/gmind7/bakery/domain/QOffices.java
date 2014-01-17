package com.gmind7.bakery.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOffices is a Querydsl query type for Offices
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOffices extends EntityPathBase<Offices> {

    private static final long serialVersionUID = -1835900616;

    public static final QOffices offices = new QOffices("offices");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final StringPath addressLine1 = createString("addressLine1");

    public final StringPath addressLine2 = createString("addressLine2");

    public final StringPath city = createString("city");

    public final StringPath country = createString("country");

    public final ListPath<Employees, QEmployees> employees = this.<Employees, QEmployees>createList("employees", Employees.class, QEmployees.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath phone = createString("phone");

    public final StringPath postalCode = createString("postalCode");

    public final StringPath state = createString("state");

    public final StringPath territory = createString("territory");

    public QOffices(String variable) {
        super(Offices.class, forVariable(variable));
    }

    public QOffices(Path<? extends Offices> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOffices(PathMetadata<?> metadata) {
        super(Offices.class, metadata);
    }

}

