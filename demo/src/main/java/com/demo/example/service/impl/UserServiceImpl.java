package com.demo.example.service.impl;

import com.demo.example.entity.User;
import com.demo.example.mapper.UserMapper;
import com.demo.example.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Runtan
 * @since 2025-02-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
