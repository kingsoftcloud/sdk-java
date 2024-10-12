package ksyun.client.slb.setprivatelinkdeleteprotection.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetPrivateLinkDeleteProtectionRequest
* @Description 请求参数
*/
@Data
public class SetPrivateLinkDeleteProtectionRequest{
    /**实例的ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**删除保护*/
    @KsYunField(name="DeleteProtection")
    private String DeleteProtection;


}