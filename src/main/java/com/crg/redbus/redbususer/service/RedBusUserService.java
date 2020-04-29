package com.crg.redbus.redbususer.service;

import com.crg.redbus.redbususer.model.RedbusUser;
import com.crg.redbus.redbususer.model.RedbusUserDto;

public interface RedBusUserService {

	RedbusUser save(RedbusUserDto userDetails);

}
