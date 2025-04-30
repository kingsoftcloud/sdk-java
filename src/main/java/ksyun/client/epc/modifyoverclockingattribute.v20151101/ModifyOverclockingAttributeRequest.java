package ksyun.client.epc.modifyoverclockingattribute.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyOverclockingAttributeRequest
 * @Description 请求参数
 */
@Data
public class ModifyOverclockingAttributeRequest {
    /**
     * 裸金属服务器资源ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

    /**
     * 超频属性，Open|Close
     */
    @KsYunField(name = "OverclockingAttribute")
    private String OverclockingAttribute;

}