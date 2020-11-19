package uk.ac.qub.test;


import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import uk.ac.qub.agile.dao.UserMapper;
import uk.ac.qub.agile.entry.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@MapperScan(annotationClass = Repository.class, basePackages = "uk.ac.qub.agile.dao")
public class DaoTest {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserInsert(){

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //UserMapper userMapper = (UserMapper) context.getBean("userMapper");

        User user = new User();
        user.setId(1);
        user.setEmail("123@ws.rf");
        user.setForname("mike");
        user.setSurname("dorcan");
        user.setPassword("123456");
        user.setSkills("java");

        userMapper.insert(user);

        System.out.println("insert data success");

    }
}
