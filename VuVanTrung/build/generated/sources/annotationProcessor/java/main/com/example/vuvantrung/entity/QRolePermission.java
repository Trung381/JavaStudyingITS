package com.example.vuvantrung.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRolePermission is a Querydsl query type for RolePermission
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRolePermission extends EntityPathBase<RolePermission> {

    private static final long serialVersionUID = 115753471L;

    public static final QRolePermission rolePermission = new QRolePermission("rolePermission");

    public final BooleanPath canApprove = createBoolean("canApprove");

    public final BooleanPath canDelete = createBoolean("canDelete");

    public final BooleanPath canView = createBoolean("canView");

    public final BooleanPath canWrite = createBoolean("canWrite");

    public final DateTimePath<java.util.Date> createdAt = createDateTime("createdAt", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> permissionId = createNumber("permissionId", Integer.class);

    public final NumberPath<Integer> roleId = createNumber("roleId", Integer.class);

    public final DateTimePath<java.util.Date> updatedAt = createDateTime("updatedAt", java.util.Date.class);

    public QRolePermission(String variable) {
        super(RolePermission.class, forVariable(variable));
    }

    public QRolePermission(Path<? extends RolePermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRolePermission(PathMetadata metadata) {
        super(RolePermission.class, metadata);
    }

}

