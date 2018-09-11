package com.learn.uac.model.dsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.learn.uac.model.Function;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFunction is a Querydsl query type for Function
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFunction extends EntityPathBase<Function> {

    private static final long serialVersionUID = 1401648203L;

    public static final QFunction function = new QFunction("function");

    public final BooleanPath enabled = createBoolean("enabled");

    public final StringPath funcName = createString("funcName");

    public final NumberPath<Integer> funcSort = createNumber("funcSort", Integer.class);

    public final StringPath funcTitle = createString("funcTitle");

    public final NumberPath<Integer> funcType = createNumber("funcType", Integer.class);

    public final StringPath remarks = createString("remarks");

    public QFunction(String variable) {
        super(Function.class, forVariable(variable));
    }

    public QFunction(Path<? extends Function> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFunction(PathMetadata metadata) {
        super(Function.class, metadata);
    }

}

