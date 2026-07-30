package ksyun.client.aicp.getsandboxinstancelist.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetSandboxInstanceListRequest
* @Description 请求参数
*/
@Data
public class GetSandboxInstanceListRequest{
    /**按模板ID筛选*/
    @KsYunField(name="TemplateId")
    private String TemplateId;

    /**按模板名称筛选*/
    @KsYunField(name="TemplateName")
    private String TemplateName;

    /**页码，默认1，最小1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**每页条数，默认10，最小1，最大100
*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
