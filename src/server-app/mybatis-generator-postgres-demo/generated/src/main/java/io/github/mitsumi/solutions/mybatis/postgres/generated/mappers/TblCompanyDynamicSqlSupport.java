package io.github.mitsumi.solutions.mybatis.postgres.generated.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.time.OffsetDateTime;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class TblCompanyDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final TblCompany tblCompany = new TblCompany();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> companyId = tblCompany.companyId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> companyName = tblCompany.companyName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<OffsetDateTime> createdAt = tblCompany.createdAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<OffsetDateTime> updatedAt = tblCompany.updatedAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class TblCompany extends AliasableSqlTable<TblCompany> {
        public final SqlColumn<Integer> companyId = column("company_id", JDBCType.INTEGER);

        public final SqlColumn<String> companyName = column("company_name", JDBCType.VARCHAR);

        public final SqlColumn<OffsetDateTime> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public final SqlColumn<OffsetDateTime> updatedAt = column("updated_at", JDBCType.TIMESTAMP);

        public TblCompany() {
            super("tbl_company", TblCompany::new);
        }
    }
}