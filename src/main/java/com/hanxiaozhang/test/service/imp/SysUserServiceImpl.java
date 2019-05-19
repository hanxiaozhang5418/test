/**
 * Copyright (C), 2018-2018, hanxiaozhang
 * FileName: SysUserServiceImpl
 * Author:   han
 * Date:     2018/12/3 11:27
 * Description: 系统用户服务实现
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hanxiaozhang.test.service.imp;


import com.hanxiaozhang.test.domian.SysUser;
import com.hanxiaozhang.test.repository.SysUserRepository;
import com.hanxiaozhang.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 〈功能简述〉<br> 
 * 〈系统用户服务实现〉
 *
 * @author han
 * @create 2019/5/19
 * @since 1.0.0
 */
@Service
public class SysUserServiceImpl implements SysUserService {

     @Autowired
     private SysUserRepository sysUserRepository;


    @Override
    public Map<String, Object> add(SysUser sysUser) {
        Map<String, Object> map = new HashMap<String, Object>(4);
                SysUser sysUerStauts = sysUserRepository.saveAndFlush(sysUser);
                map.put("data", sysUerStauts);
                map.put("code","200");
                map.put("msg", "添加成功");
                return map;
    }

    @Override
    public SysUser findById(String id) {
        return sysUserRepository.findOne(id);
    }
}
