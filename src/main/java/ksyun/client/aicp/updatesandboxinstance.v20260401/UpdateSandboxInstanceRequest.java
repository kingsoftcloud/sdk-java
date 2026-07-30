package ksyun.client.aicp.updatesandboxinstance.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateSandboxInstanceRequest
* @Description 请求参数
*/
@Data
public class UpdateSandboxInstanceRequest{
    /**沙箱实例Id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**修改后，实例销毁时间为"当前时刻"加"新设置的生命周期时长"。*/
    @KsYunField(name="Timeout")
    private Integer Timeout;

}
