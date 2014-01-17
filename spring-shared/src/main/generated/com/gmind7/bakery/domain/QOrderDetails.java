package com.gmind7.bakery.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrderDetails is a Querydsl query type for OrderDetails
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrderDetails extends EntityPathBase<OrderDetails> {

    private static final long serialVersionUID = 311812019;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderDetails orderDetails = new QOrderDetails("orderDetails");

    public final com.gmind7.bakery.domain.ids.QOrderDetailsIDs id;

    public final QOrders order;

    public final NumberPath<Integer> orderLineNumber = createNumber("orderLineNumber", Integer.class);

    public final NumberPath<Double> priceEach = createNumber("priceEach", Double.class);

    public final QProducts product;

    public final NumberPath<Integer> quantityOrdered = createNumber("quantityOrdered", Integer.class);

    public QOrderDetails(String variable) {
        this(OrderDetails.class, forVariable(variable), INITS);
    }

    public QOrderDetails(Path<? extends OrderDetails> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderDetails(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrderDetails(PathMetadata<?> metadata, PathInits inits) {
        this(OrderDetails.class, metadata, inits);
    }

    public QOrderDetails(Class<? extends OrderDetails> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new com.gmind7.bakery.domain.ids.QOrderDetailsIDs(forProperty("id")) : null;
        this.order = inits.isInitialized("order") ? new QOrders(forProperty("order"), inits.get("order")) : null;
        this.product = inits.isInitialized("product") ? new QProducts(forProperty("product"), inits.get("product")) : null;
    }

}

