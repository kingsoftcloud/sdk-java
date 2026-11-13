package ksyun.client.aicp.createsandboxinstancecommit.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateSandboxInstanceCommitRequest
* @Description 请求参数
*/
@Data
public class CreateSandboxInstanceCommitRequest{
    /**沙箱实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**目标镜像完整地址，包含仓库、名称和Tag*/
    @KsYunField(name="Image")
    private String Image;

    /**目标仓库用户名，必须与RegistryPassword同时提供或同时省略*/
    @KsYunField(name="RegistryUsername")
    private String RegistryUsername;

    /**目标仓库密码，仅用于此次请求，不写入数据库或响应*/
    @KsYunField(name="RegistryPassword")
    private String RegistryPassword;

    /**提交期间是否暂停容器，默认true*/
    @KsYunField(name="Pause")
    private Boolean Pause;

    /**KCI提交任务超时秒数，范围60-7200，默认1800*/
    @KsYunField(name="TimeoutSeconds")
    private Integer TimeoutSeconds;

}
