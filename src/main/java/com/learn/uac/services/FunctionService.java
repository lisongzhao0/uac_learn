package com.learn.uac.services;

import com.learn.uac.model.Function;

import java.util.Optional;

/**
 * 功能信息接口定义
 */
public interface FunctionService {
    Optional<Iterable<Function>> getFunction(String roleName);
    Optional<Iterable<Function>> getFunction(String roleName, boolean enabled);
    Optional<Iterable<Function>> allFunction();
    Optional<Iterable<Function>> allFunction(boolean enabled);
}
