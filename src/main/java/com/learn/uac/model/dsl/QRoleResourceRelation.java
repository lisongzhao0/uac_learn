package com.learn.uac.model.dsl;

import com.learn.uac.model.RoleResourceRelation;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QRoleResourceRelation is a Querydsl query type for RoleResourceRelation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoleResourceRelation extends EntityPathBase<RoleResourceRelation> {

    private static final long serialVersionUID = -2121123661L;

    public static final QRoleResourceRelation roleResourceRelation = new QRoleResourceRelation("roleResourceRelation");

    public final StringPath resourceName = createString("resourceName");

    public final StringPath roleName = createString("roleName");

    public QRoleResourceRelation(String variable) {
        super(RoleResourceRelation.class, forVariable(variable));
    }

    public QRoleResourceRelation(Path<? extends RoleResourceRelation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleResourceRelation(PathMetadata metadata) {
        super(RoleResourceRelation.class, metadata);
    }

}

