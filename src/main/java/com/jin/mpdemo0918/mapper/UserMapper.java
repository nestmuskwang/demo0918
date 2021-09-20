package com.jin.mpdemo0918.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jin.mpdemo0918.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author wangshuguang
 * @Date 2021/9/20 10:07
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
