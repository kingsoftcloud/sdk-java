package ksyun.client.krds.deletesecuritygroup.v20160701;

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
public class DeleteSecurityGroupRequest {
    /**
     * 安全组ID列表，支持批量，用英文逗号隔开
     */
    @KsYunField(name = "SecurityGroupIdList")
    private String SecurityGroupIdList;

}