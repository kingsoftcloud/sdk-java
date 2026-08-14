package ksyun.client.aicp.createlogpoolconfig.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateLogPoolConfigRequest
* @Description 请求参数
*/
@Data
public class CreateLogPoolConfigRequest{
    /**日志工程名*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**日志池名称*/
    @KsYunField(name="LogPoolName")
    private String LogPoolName;

    /**模型名称,与接入点id二选一传入*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**接入点id,与模型名称二选一传入*/
    @KsYunField(name="EndpointId")
    private String EndpointId;

    /***/
    @KsYunField(name="Region")
    private String Region;

}
