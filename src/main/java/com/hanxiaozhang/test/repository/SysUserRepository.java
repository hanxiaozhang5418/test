/**
 * Copyright (C), 2018-2018, hanxiaozhang
 * FileName: SysUserRepository
 * Author:   han
 * Date:     2018/12/3 9:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hanxiaozhang.test.repository;

import com.hanxiaozhang.test.domian.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * 〈功能简述〉<br> 
 * 〈〉
 *
 * @author han
 * @create 2019/5/19
 * @since 1.0.0
 */
@Repository
public interface SysUserRepository extends JpaRepository<SysUser, String>, JpaSpecificationExecutor<SysUser> {

    SysUser findByUsername(String username);
}
