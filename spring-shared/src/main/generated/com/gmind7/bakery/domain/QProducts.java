package com.gmind7.bakery.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProducts is a Querydsl query type for Products
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProducts extends EntityPathBase<Products> {

    private static final long serialVersionUID = -1316812413;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProducts products = new QProducts("products");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final NumberPath<Double> buyPrice = createNumber("buyPrice", Double.class);

    public final StringPath id = createString("id");

    public final NumberPath<Double> MSRP = createNumber("MSRP", Double.class);

    public final ListPath<OrderDetails, QOrderDetails> orderDetails = this.<OrderDetails, QOrderDetails>createList("orderDetails", OrderDetails.class, QOrderDetails.class, PathInits.DIRECT2);

    public final StringPath productDescription = createString("productDescription");

    public final QProductLines productLine;

    public final StringPath productName = createString("productName");

    public final StringPath productScale = createString("productScale");

    public final StringPath productVendor = createString("productVendor");

    public final NumberPath<Integer> quantityInStock = createNumber("quantityInStock", Integer.class);

    public QProducts(String variable) {
        this(Products.class, forVariable(variable), INITS);
    }

    public QProducts(Path<? extends Products> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProducts(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QProducts(PathMetadata<?> metadata, PathInits inits) {
        this(Products.class, metadata, inits);
    }

    public QProducts(Class<? extends Products> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.productLine = inits.isInitialized("productLine") ? new QProductLines(forProperty("productLine")) : null;
    }

}

