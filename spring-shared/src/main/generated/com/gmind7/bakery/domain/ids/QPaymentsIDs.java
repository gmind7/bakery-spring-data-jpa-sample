package com.gmind7.bakery.domain.ids;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPaymentsIDs is a Querydsl query type for PaymentsIDs
 */
@Generated("com.mysema.query.codegen.EmbeddableSerializer")
public class QPaymentsIDs extends BeanPath<PaymentsIDs> {

    private static final long serialVersionUID = 1750810934;

    public static final QPaymentsIDs paymentsIDs = new QPaymentsIDs("paymentsIDs");

    public final StringPath checkNumber = createString("checkNumber");

    public final NumberPath<Long> customerNumber = createNumber("customerNumber", Long.class);

    public QPaymentsIDs(String variable) {
        super(PaymentsIDs.class, forVariable(variable));
    }

    public QPaymentsIDs(Path<? extends PaymentsIDs> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPaymentsIDs(PathMetadata<?> metadata) {
        super(PaymentsIDs.class, metadata);
    }

}

