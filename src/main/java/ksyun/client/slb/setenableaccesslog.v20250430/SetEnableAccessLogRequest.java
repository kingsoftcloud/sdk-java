package ksyun.client.slb.setenableaccesslog.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetEnableAccessLogRequest
* @Description 请求参数
*/
@Data
public class SetEnableAccessLogRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**是否开启日志服务*/
    @KsYunField(name="EnabledLog")
    private Boolean EnabledLog;

}
