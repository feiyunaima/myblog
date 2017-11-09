package com.miku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miku.bean.Result;
import com.miku.model.UserEntity;
import com.miku.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("find")
	@ResponseBody
    public UserEntity find(Long id) {
		UserEntity u = userRepository.findOne(id);
        return u;
    }
	
	@RequestMapping("save")
	@ResponseBody
	public Result save(UserEntity user) {
		userRepository.save(user);
		Result result = new Result();
		result.setMsg("��ӻ��޸ĳɹ�");
		result.setSuccess(true);
		return result;
	}
}
