package io.github.mitsumi.solutions.mybatis.postgres.generated.mappers;

import io.github.mitsumi.solutions.mybatis.postgres.generated.enumerations.UserTypeEnum;
import io.github.mitsumi.solutions.mybatis.postgres.generated.json.models.UserProfile;
import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class TblUserDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final TblUser tblUser = new TblUser();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> userId = tblUser.userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<UUID> userKey = tblUser.userKey;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> companyId = tblUser.companyId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<UserTypeEnum> userType = tblUser.userType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> username = tblUser.username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> password = tblUser.password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<UserProfile> userProfile = tblUser.userProfile;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<OffsetDateTime> createdAt = tblUser.createdAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<OffsetDateTime> updatedAt = tblUser.updatedAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class TblUser extends AliasableSqlTable<TblUser> {
        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<UUID> userKey = column("user_key", JDBCType.OTHER);

        public final SqlColumn<Integer> companyId = column("company_id", JDBCType.INTEGER);

        public final SqlColumn<UserTypeEnum> userType = column("user_type", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<UserProfile> userProfile = column("user_profile", JDBCType.OTHER);

        public final SqlColumn<OffsetDateTime> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public final SqlColumn<OffsetDateTime> updatedAt = column("updated_at", JDBCType.TIMESTAMP);

        public TblUser() {
            super("tbl_user", TblUser::new);
        }
    }
}