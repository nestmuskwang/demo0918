package com.jin.mpdemo0918;

import com.jin.mpdemo0918.entity.UserEntity;
import com.jin.mpdemo0918.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Mpdemo0918ApplicationTests {
    //查询表中所有数据
    @Autowired
    private UserMapper userMapper;
    @Test
    public void findAll() {
        List<UserEntity> userEntities = userMapper.selectList(null);
        userEntities.forEach(en ->{
            System.out.println(en);
        });
    }

    @Test
    public void insert() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("张三试试");
        userEntity.setEmail("dsdsf@com");
        userEntity.setAge(13);
        int insert = userMapper.insert(userEntity);
        System.out.println(insert);
    }
    @Test
    public void update() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1439856232427880449L);
        userEntity.setName("ssss");
        int i = userMapper.updateById(userEntity);
        System.out.println(i);
    }

    @Test
    public void delete() {

    }
}
