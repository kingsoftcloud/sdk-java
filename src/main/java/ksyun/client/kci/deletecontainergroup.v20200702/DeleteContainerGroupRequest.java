package ksyun.client.kci.deletecontainergroup.v20200702;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteContainerGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteContainerGroupRequest {
    /**
     * 容器实例ID，格式UUID
     */
    @KsYunField(name = "ContainerGroupId")
    private String ContainerGroupId;

}