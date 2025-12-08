package ksyun.client.slb.setaccesslog.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetAccessLogRequest
* @Description 请求参数
*/
@Data
public class SetAccessLogRequest{
    /**负载均衡的ID*/
    @KsYunField(name="LoadBalancerId")
    private String LoadBalancerId;

    /**访问日志投递的日志库*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**访问日志投递的日志池*/
    @KsYunField(name="LogpoolName")
    private String LogpoolName;

}
