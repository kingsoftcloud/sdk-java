package ksyun.client.epc.describelaunchtemplates.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeLaunchTemplatesRequest
* @Description 请求参数
*/
@Data
public class DescribeLaunchTemplatesRequest{
    /**分页查询凭证，用于标记分页的位置，初次调用该接口时无需设置。下次查询时，取值为上一次API调用返回的NextToken参数值。
示例值：--*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**分页查询时设置的每页行数：
最大值：100
默认值：10*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**实例启动模板ID，最多支持10个ID。
• 参数 - N：表示实例启动模板的序号。
• 多个ID之间用&分隔。
示例值：LaunchTemplateIds.1=fa3f52fe-b002-4305-9a75-f0d58ee8ce39&LaunchTemplateIds.2=fa3f52fe-b002-4305-9a75-f0d58ee8ce39*/
    @KsYunField(name="LaunchTemplateId",type=1)
    private List<String> LaunchTemplateIdList;

}
