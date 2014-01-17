package com.gmind7.bakery.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomers is a Querydsl query type for Customers
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomers extends EntityPathBase<Customers> {

    private static final long serialVersionUID = 496912406;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomers customers = new QCustomers("customers");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final StringPath addressLine1 = createString("addressLine1");

    public final StringPath addressLine2 = createString("addressLine2");

    public final StringPath city = createString("city");

    public final StringPath contactFirstName = createString("contactFirstName");

    public final StringPath contactLastName = createString("contactLastName");

    public final StringPath country = createString("country");

    public final NumberPath<Double> creditLimit = createNumber("creditLimit", Double.class);

    public final StringPath customerName = createString("customerName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<Orders, QOrders> orders = this.<Orders, QOrders>createList("orders", Orders.class, QOrders.class, PathInits.DIRECT2);

    public final ListPath<Payments, QPayments> payments = this.<Payments, QPayments>createList("payments", Payments.class, QPayments.class, PathInits.DIRECT2);

    public final StringPath phone = createString("phone");

    public final StringPath postalCode = createString("postalCode");

    public final QEmployees salesRepEmployee;

    public final NumberPath<Integer> salesRepEmployeeNumber = createNumber("salesRepEmployeeNumber", Integer.class);

    public final StringPath state = createString("state");

    public QCustomers(String variable) {
        this(Customers.class, forVariable(variable), INITS);
    }

    public QCustomers(Path<? extends Customers> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomers(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomers(PathMetadata<?> metadata, PathInits inits) {
        this(Customers.class, metadata, inits);
    }

    public QCustomers(Class<? extends Customers> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.salesRepEmployee = inits.isInitialized("salesRepEmployee") ? new QEmployees(forProperty("salesRepEmployee"), inits.get("salesRepEmployee")) : null;
    }

}

