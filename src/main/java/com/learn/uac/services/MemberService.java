package com.learn.uac.services;

import com.learn.uac.model.Member;

import java.util.Optional;

/**
 * 用户信息接口定义
 */
public interface MemberService {
    Optional<Member> getMember(String account);
}
