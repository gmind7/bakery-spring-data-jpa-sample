package com.gmind7.bakery.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QProductLines is a Querydsl query type for ProductLines
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProductLines extends EntityPathBase<ProductLines> {

    private static final long serialVersionUID = -1139253265;

    public static final QProductLines productLines = new QProductLines("productLines");

    public final org.springframework.data.jpa.domain.QAbstractPersistable _super = new org.springframework.data.jpa.domain.QAbstractPersistable(this);

    public final StringPath htmlDescription = createString("htmlDescription");

    public final StringPath id = createString("id");

    public final StringPath image = createString("image");

    public final ListPath<Products, QProducts> products = this.<Products, QProducts>createList("products", Products.class, QProducts.class, PathInits.DIRECT2);

    public final StringPath textDescription = createString("textDescription");

    public QProductLines(String variable) {
        super(ProductLines.class, forVariable(variable));
    }

    public QProductLines(Path<? extends ProductLines> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductLines(PathMetadata<?> metadata) {
        super(ProductLines.class, metadata);
    }

}

