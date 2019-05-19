/**
 * Copyright (C), 2018-2018, hanxiaozhang
 * FileName: SysUserService
 * Author:   han
 * Date:     2018/12/3 11:26
 * Description: 系统用户服务接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hanxiaozhang.test.service;


import com.hanxiaozhang.test.domian.SysUser;

import java.util.Map;

/**
 *
 * 〈功能简述〉<br> 
 * 〈系统用户服务接口〉
 *
 * @author han
 * @create 2019/5/19
 * @since 1.0.0
 */
public interface SysUserService {

    public Map<String, Object> add(SysUser sysUser);

    SysUser findById(String id) ;

}
