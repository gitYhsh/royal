package com.xlcxx.plodes.mapper.system;

import com.xlcxx.plodes.system.domian.Role;
import com.xlcxx.common.config.database.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {

	/**查询人的角色名称**/
	List<Role> selectUserRoleByUsername(String username);

}