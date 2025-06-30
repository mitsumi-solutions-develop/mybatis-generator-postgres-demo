package io.github.mitsumi.solutions.mybatis.postgres.generated.mappers;

import static io.github.mitsumi.solutions.mybatis.postgres.generated.mappers.TblCompanyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import io.github.mitsumi.solutions.mybatis.postgres.generated.entities.TblCompany;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TblCompanyMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(companyId, companyName, createdAt, updatedAt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="row.companyId")
    int insert(InsertStatementProvider<TblCompany> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultipleWithGeneratedKeys")
    @Options(useGeneratedKeys=true,keyProperty="records.companyId")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<TblCompany> records);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TblCompanyResult", value = {
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="company_name", property="companyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblCompany> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TblCompanyResult")
    Optional<TblCompany> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tblCompany, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tblCompany, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer companyId_) {
        return delete(c -> 
            c.where(companyId, isEqualTo(companyId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(TblCompany row) {
        return MyBatis3Utils.insert(this::insert, row, tblCompany, c ->
            c.map(companyId).toProperty("companyId")
            .map(companyName).toProperty("companyName")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<TblCompany> records) {
        return MyBatis3Utils.insertMultipleWithGeneratedKeys(this::insertMultiple, records, tblCompany, c ->
            c.map(companyId).toProperty("companyId")
            .map(companyName).toProperty("companyName")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(TblCompany row) {
        return MyBatis3Utils.insert(this::insert, row, tblCompany, c ->
            c.map(companyId).toPropertyWhenPresent("companyId", row::getCompanyId)
            .map(companyName).toPropertyWhenPresent("companyName", row::getCompanyName)
            .map(createdAt).toPropertyWhenPresent("createdAt", row::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", row::getUpdatedAt)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<TblCompany> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tblCompany, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<TblCompany> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tblCompany, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<TblCompany> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tblCompany, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<TblCompany> selectByPrimaryKey(Integer companyId_) {
        return selectOne(c ->
            c.where(companyId, isEqualTo(companyId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tblCompany, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(TblCompany row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(companyId).equalTo(row::getCompanyId)
                .set(companyName).equalTo(row::getCompanyName)
                .set(createdAt).equalTo(row::getCreatedAt)
                .set(updatedAt).equalTo(row::getUpdatedAt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TblCompany row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(companyId).equalToWhenPresent(row::getCompanyId)
                .set(companyName).equalToWhenPresent(row::getCompanyName)
                .set(createdAt).equalToWhenPresent(row::getCreatedAt)
                .set(updatedAt).equalToWhenPresent(row::getUpdatedAt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(TblCompany row) {
        return update(c ->
            c.set(companyName).equalTo(row::getCompanyName)
            .set(createdAt).equalTo(row::getCreatedAt)
            .set(updatedAt).equalTo(row::getUpdatedAt)
            .where(companyId, isEqualTo(row::getCompanyId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(TblCompany row) {
        return update(c ->
            c.set(companyName).equalToWhenPresent(row::getCompanyName)
            .set(createdAt).equalToWhenPresent(row::getCreatedAt)
            .set(updatedAt).equalToWhenPresent(row::getUpdatedAt)
            .where(companyId, isEqualTo(row::getCompanyId))
        );
    }
}