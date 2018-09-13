package com.learn.uac.model.dsl;

import com.learn.uac.model.Resource;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.BooleanPath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QResource is a Querydsl query type for Resource
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResource extends EntityPathBase<Resource> {

    private static final long serialVersionUID = -320355199L;

    public static final QResource resource1 = new QResource("resource1");

    public final StringPath description = createString("description");

    public final BooleanPath enabled = createBoolean("enabled");

    public final StringPath remarks = createString("remarks");

    public final StringPath resource = createString("resource");

    public final StringPath resourceName = createString("resourceName");

    public final NumberPath<Integer> sortIdx = createNumber("sortIdx", Integer.class);

    public final StringPath type = createString("type");

    public QResource(String variable) {
        super(Resource.class, forVariable(variable));
    }

    public QResource(Path<? extends Resource> path) {
        super(path.getType(), path.getMetadata());
    }

    public QResource(PathMetadata metadata) {
        super(Resource.class, metadata);
    }

}

