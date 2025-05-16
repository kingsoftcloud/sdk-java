package ksyun.client.kcrs.deletenamespace.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteNamespaceRequest
 * @Description 请求参数
 */
@Data
public class DeleteNamespaceRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 命名空间名称
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

}