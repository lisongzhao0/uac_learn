package com.learn.uac.model.dsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.learn.uac.model.RoleFunctionRelation;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleFunctionRelation is a Querydsl query type for RoleFunctionRelation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoleFunctionRelation extends EntityPathBase<RoleFunctionRelation> {

    private static final long serialVersionUID = 1528200829L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoleFunctionRelation roleFunctionRelation = new QRoleFunctionRelation("roleFunctionRelation");

    public final QFunction func;

    public final StringPath module = createString("module");

    public final QRole role;

    public QRoleFunctionRelation(String variable) {
        this(RoleFunctionRelation.class, forVariable(variable), INITS);
    }

    public QRoleFunctionRelation(Path<? extends RoleFunctionRelation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoleFunctionRelation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoleFunctionRelation(PathMetadata metadata, PathInits inits) {
        this(RoleFunctionRelation.class, metadata, inits);
    }

    public QRoleFunctionRelation(Class<? extends RoleFunctionRelation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.func = inits.isInitialized("func") ? new QFunction(forProperty("func")) : null;
        this.role = inits.isInitialized("role") ? new QRole(forProperty("role")) : null;
    }

}

