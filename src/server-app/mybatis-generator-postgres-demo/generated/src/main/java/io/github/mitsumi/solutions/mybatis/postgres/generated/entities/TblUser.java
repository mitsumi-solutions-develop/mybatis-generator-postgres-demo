package io.github.mitsumi.solutions.mybatis.postgres.generated.entities;

import io.github.mitsumi.solutions.mybatis.postgres.generated.enumerations.UserTypeEnum;
import io.github.mitsumi.solutions.mybatis.postgres.generated.json.models.UserProfile;
import jakarta.annotation.Generated;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Data;

@Data
public class TblUser implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private UUID userKey;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer companyId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private UserTypeEnum userType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private UserProfile userProfile;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private OffsetDateTime createdAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private OffsetDateTime updatedAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;
}