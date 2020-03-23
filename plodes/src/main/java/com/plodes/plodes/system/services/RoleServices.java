package com.plodes.plodes.system.services;

import com.plodes.plodes.baseServices.IServices;
import com.plodes.plodes.system.domian.Role;

import java.util.List;

/**
 * Description: plodes
 * Created by yhsh on 2020/3/21 14:35
 * version 2.0
 * 方法说明
 */
public interface RoleServices extends IServices<Role> {

	/**获取用户的角色信息**/
	List<Role> getUserRoleByUsername(String username);

}
