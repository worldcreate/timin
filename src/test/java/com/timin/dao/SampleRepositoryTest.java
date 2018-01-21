package com.timin.dao;


//staticインポート
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.*;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.timin.ReplacementCsvDataSetLoader;
import com.timin.entity.Employee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by naoya on 2018/01/02.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@DbUnitConfiguration(
        dataSetLoader = ReplacementCsvDataSetLoader.class // ここでCSVでデータ読み込むReplacementDataSetLoaderのクラスを指定
)
@Transactional
public class SampleRepositoryTest {

    private static final String DATA_FILE_PATH = "/SampleRepository/";

    @Autowired(required=true)
    private SampleRepository sampleRepository;

    @Test
    @DatabaseSetup(value = DATA_FILE_PATH + "selectAll/")
    public void selectAllテスト() {
        Employee expect1 = Employee.builder().id(1).age(21).name("テストユーザー1").build();
        Employee expect2 = Employee.builder().id(2).age(54).name("テストユーザー2").build();

        List<Employee> actual = sampleRepository.selectAll();

        assertThat(actual, containsInAnyOrder(samePropertyValuesAs(expect1), samePropertyValuesAs(expect2)));



    }
}
