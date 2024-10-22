package ksyun.client.epc.usehotstandbyepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UseHotStandByEpcRequest
* @Description 请求参数
*/
@Data
public class UseHotStandByEpcRequest{
    /**裸金属服务器的ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**热备机的ID*/
    @KsYunField(name="HotStandByHostId")
    private String HotStandByHostId;


}