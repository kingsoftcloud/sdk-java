package ksyun.client.epc.deletelaunchtemplateversion.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteLaunchTemplateVersionRequest
* @Description 请求参数
*/
@Data
public class DeleteLaunchTemplateVersionRequest{
    /**实例启动模板ID。
示例值：1eef0353-eb57-4271-8e71-bf334d60567e
说明：必须指定LaunchTemplateId以确定模板。*/
    @KsYunField(name="LaunchTemplateId")
    private String LaunchTemplateId;

    /**实例启动模板版本号。
• 参数 -N：表示版本的序号，N的取值范围1～29。
• 多个版本号之间用&分隔。
示例值：2*/
    @KsYunField(name="LaunchTemplateVersion",type=1)
    private List<Integer> LaunchTemplateVersionList;

}
