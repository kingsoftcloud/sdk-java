package ksyun.client.aicp.modifyinference.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInferenceRequest
* @Description 请求参数
*/
@Data
public class ModifyInferenceRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

    /**推理服务名称*/
    @KsYunField(name="InferenceName")
    private String InferenceName;

    /**描述（限长200）*/
    @KsYunField(name="Description")
    private String Description;

    /**启动命令*/
    @KsYunField(name="EntryPoint")
    private String EntryPoint;

    /**镜像来源（自定义部署时，镜像来源类型）*/
    @KsYunField(name="ImageSource")
    private String ImageSource;

    /**镜像ID（自定义部署时，官方镜像、自定义镜像参数）*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**镜像仓库ID（自定义部署时，第三方镜像参数）*/
    @KsYunField(name="ImageRegistryId")
    private String ImageRegistryId;

    /**镜像仓库ID（自定义部署时，第三方镜像参数）*/
    @KsYunField(name="ImageRepoId")
    private String ImageRepoId;

    /**镜像标签ID（自定义部署时，第三方镜像参数）*/
    @KsYunField(name="ImageTagId")
    private String ImageTagId;

    /**环境变量列表*/
    @KsYunField(name="Env",type=2)
    private List<EnvDto> EnvList;

    @Data
    @ToString
    public static class EnvDto {
        /**环境变量名*/
        @KsYunField(name="Name")
        private String Name;

        /**环境变量值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**启动参数（模型部署类型参数）*/
    @KsYunField(name="CmdOptions",type=2)
    private List<CmdOptionsDto> CmdOptionsList;

    @Data
    @ToString
    public static class CmdOptionsDto {
        /**环境变量名*/
        @KsYunField(name="Name")
        private String Name;

        /**环境变量值*/
        @KsYunField(name="Value")
        private String Value;

    }

    /**是否启用主机网络*/
    @KsYunField(name="HostNetworkEnabled")
    private Boolean HostNetworkEnabled;

}
