package ksyun.client.aicp.deletesandboxinstance.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSandboxInstanceRequest
* @Description 请求参数
*/
@Data
public class DeleteSandboxInstanceRequest{
    /**沙箱实例ID列表
*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

}
