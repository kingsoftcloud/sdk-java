package ksyun.client.postgresql.deletesecuritygroup.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSecurityGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteSecurityGroupRequest{
    /**安全组ID*/
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

}
