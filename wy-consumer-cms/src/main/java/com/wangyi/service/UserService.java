package com.wangyi.service;

import com.wangyi.controller.UserControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "wy-service-cms")
public interface UserService extends UserControllerApi {
}
