package com.learn.uac.model.dsl;

import com.learn.uac.model.RoleResourceView;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.BooleanPath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

import javax.annotation.Generated;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QRoleResourceView is a Querydsl query type for RoleResourceView
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoleResourceView extends EntityPathBase<RoleResourceView> {

    private static final long serialVersionUID = 1597467868L;

    public static final QRoleResourceView roleResourceView = new QRoleResourceView("roleResourceView");

    public final StringPath description = createString("description");

    public final StringPath resource = createString("resource");

    public final BooleanPath resourceEnabled = createBoolean("resourceEnabled");

    public final StringPath resourceName = createString("resourceName");

    public final StringPath resourceRemarks = createString("resourceRemarks");

    public final BooleanPath roleEnabled = createBoolean("roleEnabled");

    public final StringPath roleName = createString("roleName");

    public final StringPath roleRemarks = createString("roleRemarks");

    public final NumberPath<Integer> sortIdx = createNumber("sortIdx", Integer.class);

    public final StringPath type = createString("type");

    public QRoleResourceView(String variable) {
        super(RoleResourceView.class, forVariable(variable));
    }

    public QRoleResourceView(Path<? extends RoleResourceView> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleResourceView(PathMetadata metadata) {
        super(RoleResourceView.class, metadata);
    }

}

