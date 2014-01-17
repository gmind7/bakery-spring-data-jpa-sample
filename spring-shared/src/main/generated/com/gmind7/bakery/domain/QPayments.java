package com.gmind7.bakery.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPayments is a Querydsl query type for Payments
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPayments extends EntityPathBase<Payments> {

    private static final long serialVersionUID = 1069631308;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPayments payments = new QPayments("payments");

    public final NumberPath<Double> amount = createNumber("amount", Double.class);

    public final QCustomers customer;

    public final com.gmind7.bakery.domain.ids.QPaymentsIDs id;

    public final DateTimePath<java.util.Date> paymentDate = createDateTime("paymentDate", java.util.Date.class);

    public QPayments(String variable) {
        this(Payments.class, forVariable(variable), INITS);
    }

    public QPayments(Path<? extends Payments> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPayments(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPayments(PathMetadata<?> metadata, PathInits inits) {
        this(Payments.class, metadata, inits);
    }

    public QPayments(Class<? extends Payments> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QCustomers(forProperty("customer"), inits.get("customer")) : null;
        this.id = inits.isInitialized("id") ? new com.gmind7.bakery.domain.ids.QPaymentsIDs(forProperty("id")) : null;
    }

}

