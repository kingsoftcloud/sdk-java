package ksyun.client.epc.autodeleteepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AutoDeleteEpcRequest
 * @Description 请求参数
 */
@Data
public class AutoDeleteEpcRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

    /**
     * 预约删除时间
     */
    @KsYunField(name = "AutoDeleteTime")
    private String AutoDeleteTime;

    /**
     * 是否删除EIP信息
     * yes/no 默认no
     */
    @KsYunField(name="AutoDeleteEip")
    private String AutoDeleteEip;

}