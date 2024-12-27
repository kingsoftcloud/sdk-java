package ksyun.client.kes.servicecontrol.v20201215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ServiceControlRequest
* @Description 请求参数
*/
@Data
public class ServiceControlRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**操作类型：
restart：重启*/
    @KsYunField(name="ControlType")
    private String ControlType;

    /**重启方式：
True（默认）:滚动重启
False：强制重启*/
    @KsYunField(name="Rolling")
    private String Rolling;


}