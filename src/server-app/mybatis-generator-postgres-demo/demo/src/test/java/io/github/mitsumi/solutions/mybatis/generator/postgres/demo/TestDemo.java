package io.github.mitsumi.solutions.mybatis.generator.postgres.demo;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import io.github.mitsumi.solutions.mybatis.postgres.generated.entities.TblCompany;
import io.github.mitsumi.solutions.mybatis.postgres.generated.entities.TblUser;
import io.github.mitsumi.solutions.mybatis.postgres.generated.enumerations.UserTypeEnum;
import io.github.mitsumi.solutions.mybatis.postgres.generated.json.models.UserProfile;
import io.github.mitsumi.solutions.mybatis.postgres.generated.mappers.TblCompanyMapper;
import io.github.mitsumi.solutions.mybatis.postgres.generated.mappers.TblUserMapper;
import io.github.mitsumi.solutions.spring.dbunit.postgres.test.DatabaseUnitTestExecutionListener;
import io.github.mitsumi.solutions.spring.dbunit.postgres.test.loaders.ReplacementCsvDataSetLoader;
import io.github.mitsumi.solutions.spring.dbunit.postgres.test.operations.DbOperationLookup;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.bean.override.mockito.MockitoResetTestExecutionListener;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@ActiveProfiles("unit-test")
@SpringBootTest(classes = DemoApplication.class)
@TestExecutionListeners({
    DependencyInjectionTestExecutionListener.class,
    TransactionalTestExecutionListener.class,
    DatabaseUnitTestExecutionListener.class,
    MockitoResetTestExecutionListener.class
})
@DbUnitConfiguration(
    databaseConnection = "dbUnitDatabaseConnection",
    dataSetLoader = ReplacementCsvDataSetLoader.class,
    databaseOperationLookup = DbOperationLookup.class
)
@Import({TestDbUnitConfig.class})
@DatabaseSetup(value = "/test-data/io.github.mitsumi.solutions.mybatis.generator.postgres.demo.TestDemo/")
@Slf4j
public class TestDemo {

    @Autowired
    private TblCompanyMapper tblCompanyMapper;

    @Autowired
    private TblUserMapper tblUserMapper;

    @ParameterizedTest
    @CsvSource("test company")
    public void test_insertCompany(String companyName) {
        var company = new TblCompany();
        company.setCompanyName(companyName);

        var inserted = tblCompanyMapper.insertSelective(company);

        assertThat(inserted, is(1));
        assertThat(company.getCompanyId(), is(2));

        tblCompanyMapper.selectByPrimaryKey(company.getCompanyId()).ifPresentOrElse(
            actual -> {
                assertThat(actual.getCompanyId(), is(2));
                assertThat(actual.getCompanyName(), is(companyName));
                assertThat(actual.getCreatedAt(), is(notNullValue()));
                assertThat(actual.getUpdatedAt(), is(notNullValue()));
            },
            () -> Assertions.fail("Company must be inserted")
        );
    }

    @Test
    public void test_insertUser() {
        var user = user();

        var inserted = tblUserMapper.insertSelective(user);

        assertThat(inserted, is(1));
        assertThat(user.getUserId(), is(2L));

        tblUserMapper.selectByPrimaryKey(user.getUserId()).ifPresentOrElse(
            actual -> {
                assertThat(actual.getUserId(), is(2L));
                assertThat(actual.getUserKey(), is(notNullValue()));
                assertThat(actual.getCompanyId(), is(1));
                assertThat(actual.getUserType(), is(UserTypeEnum.USER));
                assertThat(actual.getUsername(), is("test-user001"));
                assertThat(actual.getPassword(), is("password01"));
                assertThat(actual.getUserProfile(), is(notNullValue()));
                assertThat(actual.getUserProfile().getFamilyName(), is("family001"));
                assertThat(actual.getCreatedAt(), is(notNullValue()));
                assertThat(actual.getUpdatedAt(), is(notNullValue()));
            },
            () -> Assertions.fail("User must be inserted")
        );
    }


    private TblUser user() {
        var user = new TblUser();

        user.setUserKey(UUID.randomUUID());
        user.setCompanyId(1);
        user.setUserType(UserTypeEnum.USER);
        user.setUsername("test-user001");
        user.setPassword("password01");
        user.setUserProfile(userProfile());

        return user;
    }

    private UserProfile userProfile() {
        return new UserProfile().familyName("family001");

    }
}
