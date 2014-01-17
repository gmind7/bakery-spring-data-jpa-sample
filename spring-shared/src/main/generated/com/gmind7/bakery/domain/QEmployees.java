package com.gmind7.bakery.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEmployees is a Querydsl query type for Employees
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEmployees extends EntityPathBase<Employees> {

    private static final long serialVersionUID = 1523170118;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEmployees employees = new QEmployees("employees");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final ListPath<Customers, QCustomers> customers = this.<Customers, QCustomers>createList("customers", Customers.class, QCustomers.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final StringPath extension = createString("extension");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jobTitle = createString("jobTitle");

    public final StringPath lastName = createString("lastName");

    public final QOffices office;

    public final NumberPath<Long> officeCode = createNumber("officeCode", Long.class);

    public final NumberPath<Long> reportsTo = createNumber("reportsTo", Long.class);

    public final QEmployees reportsToEmployee;

    public QEmployees(String variable) {
        this(Employees.class, forVariable(variable), INITS);
    }

    public QEmployees(Path<? extends Employees> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEmployees(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEmployees(PathMetadata<?> metadata, PathInits inits) {
        this(Employees.class, metadata, inits);
    }

    public QEmployees(Class<? extends Employees> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.office = inits.isInitialized("office") ? new QOffices(forProperty("office")) : null;
        this.reportsToEmployee = inits.isInitialized("reportsToEmployee") ? new QEmployees(forProperty("reportsToEmployee"), inits.get("reportsToEmployee")) : null;
    }

}

