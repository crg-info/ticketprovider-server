package com.crg.redbus.redbususer.dao;

import org.springframework.data.repository.CrudRepository;

import com.crg.redbus.redbususer.model.RedbusUser;

public interface RedBusUserDao extends CrudRepository<RedbusUser, Integer> {

}
