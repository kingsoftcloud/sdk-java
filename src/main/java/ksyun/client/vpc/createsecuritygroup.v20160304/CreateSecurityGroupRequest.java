package ksyun.client.vpc.createsecuritygroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CreateSecurityGroupRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 安全组的名称
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组的描述
     */
    @KsYunField(name = "Description")
    private String Description;

}