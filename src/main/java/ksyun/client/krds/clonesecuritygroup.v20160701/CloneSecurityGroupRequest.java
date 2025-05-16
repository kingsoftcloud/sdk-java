package ksyun.client.krds.clonesecuritygroup.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CloneSecurityGroupRequest
 * @Description 请求参数
 */
@Data
public class CloneSecurityGroupRequest {
    /**
     * 源端安全组id
     */
    @KsYunField(name = "SecurityGroupId")
    private String SecurityGroupId;

    /**
     * 安全组名称
     */
    @KsYunField(name = "SecurityGroupName")
    private String SecurityGroupName;

    /**
     * 安全组描述
     */
    @KsYunField(name = "SecurityGroupDescription")
    private String SecurityGroupDescription;

}