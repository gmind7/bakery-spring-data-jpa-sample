package com.gmind7.bakery.domain.ids;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QOrderDetailsIDs is a Querydsl query type for OrderDetailsIDs
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QOrderDetailsIDs extends BeanPath<OrderDetailsIDs> {

    private static final long serialVersionUID = -1722235281;

    public static final QOrderDetailsIDs orderDetailsIDs = new QOrderDetailsIDs("orderDetailsIDs");

    public final NumberPath<Long> orderNumber = createNumber("orderNumber", Long.class);

    public final StringPath productCode = createString("productCode");

    public QOrderDetailsIDs(String variable) {
        super(OrderDetailsIDs.class, forVariable(variable));
    }

    public QOrderDetailsIDs(Path<? extends OrderDetailsIDs> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrderDetailsIDs(PathMetadata<?> metadata) {
        super(OrderDetailsIDs.class, metadata);
    }

}

