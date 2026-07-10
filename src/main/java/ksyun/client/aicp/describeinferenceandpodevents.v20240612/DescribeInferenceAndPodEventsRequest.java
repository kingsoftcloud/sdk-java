package ksyun.client.aicp.describeinferenceandpodevents.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInferenceAndPodEventsRequest
* @Description 请求参数
*/
@Data
public class DescribeInferenceAndPodEventsRequest{
    /**推理服务ID*/
    @KsYunField(name="InferenceId")
    private String InferenceId;

    /**Pod名称列表，不传则查询所有Pod事件*/
    @KsYunField(name="PodNames",type=2)
    private List<String> PodNamesList;

    /**排序关键字*/
    @KsYunField(name="SortKey")
    private String SortKey;

    /**排序方式*/
    @KsYunField(name="Sort")
    private String Sort;

}
