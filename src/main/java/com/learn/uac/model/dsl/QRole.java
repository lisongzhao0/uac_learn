package com.learn.uac.model.dsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.learn.uac.model.Function;
import com.learn.uac.model.Role;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRole is a Querydsl query type for Role
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRole extends EntityPathBase<Role> {

    private static final long serialVersionUID = 1334948457L;

    public static final QRole role = new QRole("role");

    public final BooleanPath enabled = createBoolean("enabled");

    public final SetPath<Function, QFunction> functions = this.<Function, QFunction>createSet("functions", Function.class, QFunction.class, PathInits.DIRECT2);

    public final StringPath remarks = createString("remarks");

    public final StringPath roleName = createString("roleName");

    public QRole(String variable) {
        super(Role.class, forVariable(variable));
    }

    public QRole(Path<? extends Role> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRole(PathMetadata metadata) {
        super(Role.class, metadata);
    }

}

