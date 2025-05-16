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
public class UseHotStandByEpcRequest {
    /**
     * 裸金属服务器的ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

    /**
     * 热备机的ID
     */
    @KsYunField(name = "HotStandByHostId")
    private String HotStandByHostId;

    /**
     * 保留信息，有效值
     * RetainPrivateIP保留内网IP
     * Notretain不保留，默认值
     */
    @KsYunField(name = "RetainInstanceInfo")
    private String RetainInstanceInfo;

}