package ksyun.client.epc.modifytemplatedefaultversion.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyTemplateDefaultVersionRequest
* @Description 请求参数
*/
@Data
public class ModifyTemplateDefaultVersionRequest{
    /**实例启动模板ID。
示例值：1eef0353-eb57-4271-8e71-bf334d60567e
说明：必须指定LaunchTemplateId以确定模板。*/
    @KsYunField(name="LaunchTemplateId")
    private String LaunchTemplateId;

    /**设置为默认版本的启动模板版本号
示例值：2*/
    @KsYunField(name="DefaultVersionNumber")
    private Integer DefaultVersionNumber;

}
