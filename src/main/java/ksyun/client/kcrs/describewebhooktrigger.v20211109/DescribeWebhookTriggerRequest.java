package ksyun.client.kcrs.describewebhooktrigger.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeWebhookTriggerRequest
* @Description 请求参数
*/
@Data
public class DescribeWebhookTriggerRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**触发器ID*/
    @KsYunField(name="TriggerId")
    private String TriggerId;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private String Marker;

    /**单次调用所返回的最大实例数目，默认10， 最大99*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

}
