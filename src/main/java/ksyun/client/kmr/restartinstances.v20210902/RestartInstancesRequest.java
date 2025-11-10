package ksyun.client.kmr.restartinstances.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RestartInstancesRequest
* @Description 请求参数
*/
@Data
public class RestartInstancesRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**主机实例ID*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

    /**滚动重启间隔时间，RollingRestart为true时填写，默认60s*/
    @KsYunField(name="Interval")
    private Integer Interval;

    /**是否滚动重启*/
    @KsYunField(name="RollingRestart")
    private Boolean RollingRestart;

    /**是否强制重启*/
    @KsYunField(name="ForceReboot")
    private Boolean ForceReboot;

}