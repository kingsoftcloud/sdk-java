package ksyun.client.kcrs.createnamespace.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateNamespaceRequest
* @Description 请求参数
*/
@Data
public class CreateNamespaceRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间名称，校验规则：长度为2-63位，支持填写小写字母和数字，且不能以数字开头*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**命名空间属性，命名空间类型属性决定了该空间下镜像仓库的类型属性有效值：<br/>True：公有<br/>False：私有*/
    @KsYunField(name="Public")
    private String PublicField;

}
