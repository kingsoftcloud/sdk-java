package ksyun.client.kcrs.getretentionpolicylogs.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetRetentionPolicyLogsRequest
* @Description 请求参数
*/
@Data
public class GetRetentionPolicyLogsRequest{
    /**实例Id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**分页参数*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页数据大小*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
