package io.github.mitsumi.solutions.mybatis.postgres.generated.mappers;

import static io.github.mitsumi.solutions.mybatis.postgres.generated.mappers.TblUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import io.github.mitsumi.solutions.mybatis.postgres.generated.entities.TblUser;
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
public interface TblUserMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(userId, userKey, companyId, userType, username, password, userProfile, createdAt, updatedAt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="row.userId")
    int insert(InsertStatementProvider<TblUser> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultipleWithGeneratedKeys")
    @Options(useGeneratedKeys=true,keyProperty="records.userId")
    int insertMultiple(@Param("insertStatement") String insertStatement, @Param("records") List<TblUser> records);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TblUserResult", value = {
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_key", property="userKey", jdbcType=JdbcType.OTHER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_profile", property="userProfile", jdbcType=JdbcType.OTHER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TblUser> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TblUserResult")
    Optional<TblUser> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tblUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tblUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long userId_) {
        return delete(c -> 
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(TblUser row) {
        return MyBatis3Utils.insert(this::insert, row, tblUser, c ->
            c.map(userId).toProperty("userId")
            .map(userKey).toProperty("userKey")
            .map(companyId).toProperty("companyId")
            .map(userType).toProperty("userType")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(userProfile).toProperty("userProfile")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<TblUser> records) {
        return MyBatis3Utils.insertMultipleWithGeneratedKeys(this::insertMultiple, records, tblUser, c ->
            c.map(userId).toProperty("userId")
            .map(userKey).toProperty("userKey")
            .map(companyId).toProperty("companyId")
            .map(userType).toProperty("userType")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(userProfile).toProperty("userProfile")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(TblUser row) {
        return MyBatis3Utils.insert(this::insert, row, tblUser, c ->
            c.map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(userKey).toPropertyWhenPresent("userKey", row::getUserKey)
            .map(companyId).toPropertyWhenPresent("companyId", row::getCompanyId)
            .map(userType).toPropertyWhenPresent("userType", row::getUserType)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
            .map(password).toPropertyWhenPresent("password", row::getPassword)
            .map(userProfile).toPropertyWhenPresent("userProfile", row::getUserProfile)
            .map(createdAt).toPropertyWhenPresent("createdAt", row::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", row::getUpdatedAt)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<TblUser> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, tblUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<TblUser> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, tblUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<TblUser> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, tblUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<TblUser> selectByPrimaryKey(Long userId_) {
        return selectOne(c ->
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tblUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(TblUser row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(row::getUserId)
                .set(userKey).equalTo(row::getUserKey)
                .set(companyId).equalTo(row::getCompanyId)
                .set(userType).equalTo(row::getUserType)
                .set(username).equalTo(row::getUsername)
                .set(password).equalTo(row::getPassword)
                .set(userProfile).equalTo(row::getUserProfile)
                .set(createdAt).equalTo(row::getCreatedAt)
                .set(updatedAt).equalTo(row::getUpdatedAt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TblUser row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(row::getUserId)
                .set(userKey).equalToWhenPresent(row::getUserKey)
                .set(companyId).equalToWhenPresent(row::getCompanyId)
                .set(userType).equalToWhenPresent(row::getUserType)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(password).equalToWhenPresent(row::getPassword)
                .set(userProfile).equalToWhenPresent(row::getUserProfile)
                .set(createdAt).equalToWhenPresent(row::getCreatedAt)
                .set(updatedAt).equalToWhenPresent(row::getUpdatedAt);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(TblUser row) {
        return update(c ->
            c.set(userKey).equalTo(row::getUserKey)
            .set(companyId).equalTo(row::getCompanyId)
            .set(userType).equalTo(row::getUserType)
            .set(username).equalTo(row::getUsername)
            .set(password).equalTo(row::getPassword)
            .set(userProfile).equalTo(row::getUserProfile)
            .set(createdAt).equalTo(row::getCreatedAt)
            .set(updatedAt).equalTo(row::getUpdatedAt)
            .where(userId, isEqualTo(row::getUserId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(TblUser row) {
        return update(c ->
            c.set(userKey).equalToWhenPresent(row::getUserKey)
            .set(companyId).equalToWhenPresent(row::getCompanyId)
            .set(userType).equalToWhenPresent(row::getUserType)
            .set(username).equalToWhenPresent(row::getUsername)
            .set(password).equalToWhenPresent(row::getPassword)
            .set(userProfile).equalToWhenPresent(row::getUserProfile)
            .set(createdAt).equalToWhenPresent(row::getCreatedAt)
            .set(updatedAt).equalToWhenPresent(row::getUpdatedAt)
            .where(userId, isEqualTo(row::getUserId))
        );
    }
}