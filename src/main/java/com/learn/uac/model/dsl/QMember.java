package com.learn.uac.model.dsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.learn.uac.model.Member;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -469284462L;

    public static final QMember member = new QMember("member1");

    public final StringPath _3rdAccount = createString("_3rdAccount");

    public final StringPath account = createString("account");

    public final StringPath address = createString("address");

    public final StringPath city = createString("city");

    public final StringPath companyId = createString("companyId");

    public final StringPath companyName = createString("companyName");

    public final DateTimePath<java.util.Date> createDate = createDateTime("createDate", java.util.Date.class);

    public final StringPath email = createString("email");

    public final BooleanPath enabled = createBoolean("enabled");

    public final StringPath gender = createString("gender");

    public final BooleanPath isCompanyAdmin = createBoolean("isCompanyAdmin");

    public final BooleanPath isEmailValidated = createBoolean("isEmailValidated");

    public final BooleanPath isMobileValidated = createBoolean("isMobileValidated");

    public final DateTimePath<java.util.Date> lastLoginDate = createDateTime("lastLoginDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastUpdateDate = createDateTime("lastUpdateDate", java.util.Date.class);

    public final StringPath memberId = createString("memberId");

    public final StringPath memberType = createString("memberType");

    public final StringPath mobile = createString("mobile");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath platform = createString("platform");

    public final StringPath providerId = createString("providerId");

    public final StringPath province = createString("province");

    public final StringPath status = createString("status");

    public final StringPath type = createString("type");

    public final BooleanPath verified = createBoolean("verified");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

