package ksyun.client.kci.execcontainercommand.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ExecContainerCommandRequest
 * @Description 请求参数
 */
@Data
public class ExecContainerCommandRequest {
    /**
     * 容器实例ID
     */
    @KsYunField(name = "ContainerGroupId")
    private String ContainerGroupId;

    /**
     * 容器实例中运行的容器名
     */
    @KsYunField(name = "ContainerName")
    private String ContainerName;

    /**
     * exec执行的命令，如/bin/sh
     */
    @KsYunField(name = "Command")
    private List<String> CommandList;

    /**
     * 是否保持连接，默认false
     */
    @KsYunField(name = "TTY")
    private Boolean TTY;

}