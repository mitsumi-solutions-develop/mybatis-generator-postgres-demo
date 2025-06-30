package io.github.mitsumi.solutions.mybatis.postgres.generated.entities;

import jakarta.annotation.Generated;
import java.io.Serializable;
import java.time.OffsetDateTime;
import lombok.Data;

@Data
public class TblCompany implements Serializable {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer companyId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String companyName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private OffsetDateTime createdAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private OffsetDateTime updatedAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private static final long serialVersionUID = 1L;
}