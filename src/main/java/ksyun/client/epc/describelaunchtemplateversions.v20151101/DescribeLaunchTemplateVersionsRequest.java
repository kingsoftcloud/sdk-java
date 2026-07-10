package ksyun.client.epc.describelaunchtemplateversions.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeLaunchTemplateVersionsRequest
* @Description 请求参数
*/
@Data
public class DescribeLaunchTemplateVersionsRequest{
    /**实例启动模板的 ID。
说明：必须指定LaunchTemplateId以确定模板。
示例值：fa3f52fe-b002-4305-9a75-f0d58ee8ce39*/
    @KsYunField(name="LaunchTemplateId")
    private String LaunchTemplateId;

    /**是否查询默认版本不传则查询所有版本取值：
• true：查询默认版本。
• false：不查询默认版本。
示例值：true*/
    @KsYunField(name="DefaultVersion")
    private Boolean DefaultVersion;

    /**实例启动模板版本，最多支持10个。
• 参数 - N：表示实例启动模板版本。
• 多个版本之间用&分隔。
示例值：LaunchTemplateVersions.1=1&LaunchTemplateVersions.2=2*/
    @KsYunField(name="LaunchTemplateVersion",type=1)
    private List<Integer> LaunchTemplateVersionList;

    /**分页查询凭证，用于标记分页的位置，初次调用该接口时无需设置。下次查询时，取值为上一次API调用返回的NextToken参数值。
示例值：--*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**分页查询时设置的每页行数：
• 最大值：100
• 默认值：10
示例值：10*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}
