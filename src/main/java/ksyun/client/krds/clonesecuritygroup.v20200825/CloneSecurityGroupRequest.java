package ksyun.client.krds.clonesecuritygroup.v20200825;

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
public class CloneSecurityGroupRequest{
    /**被克隆安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**安全组名称.		不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线*/
    @KsYunField(name="SecurityGroupName")
    private String SecurityGroupName;

    /**安全组描述	不超过256个字节，仅支持中文、大小写字母、数字、减号和下划线*/
    @KsYunField(name="SecurityGroupDescription")
    private String SecurityGroupDescription;

}
