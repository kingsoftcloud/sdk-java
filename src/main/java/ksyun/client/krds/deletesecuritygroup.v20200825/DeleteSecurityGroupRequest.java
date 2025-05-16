package ksyun.client.krds.deletesecuritygroup.v20200825;

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
     * 删除实例安全组，支持批量删除。
     * <p>
     * 注意：
     * <p>
     * 1.已绑定实例的安全组不支持删除，需要手动解除绑定。
     * <p>
     * 2.若删除失败可使用Version: 2016-07-01尝试，创建/删除需使用相同API版本号。
     * <p>
     * 3.返回值为删除后剩余的安全组列表
     */
    @KsYunField(name = "SecurityGroupIds")
    private String SecurityGroupIds;

}