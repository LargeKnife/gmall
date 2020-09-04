package com.edward.gmall.user.mapper;

import com.edward.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author ChenGuiHong
 * @create 2020-09-04  12:00
 */
public interface UserMapper extends Mapper<UmsMember> {
    public List<UmsMember> selectAllUser();
}
