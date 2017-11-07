package com.miku.repository;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.miku.model.UserEntity;

@Repository
@Table(name="sys_user")
@Qualifier("userRepository")
public interface UserRepository extends CrudRepository<UserEntity, Long >{
	
	public UserEntity findOne(Long id);

    public UserEntity save(UserEntity u);

    @Query("select t from UserEntity t where t.userName=:userName")
    public UserEntity findUserByName(@Param("userName") String userName);
}
