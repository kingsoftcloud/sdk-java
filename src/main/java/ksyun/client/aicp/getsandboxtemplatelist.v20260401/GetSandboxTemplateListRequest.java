package ksyun.client.aicp.getsandboxtemplatelist.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetSandboxTemplateListRequest
* @Description 请求参数
*/
@Data
public class GetSandboxTemplateListRequest{
    /**按模板类型筛选*/
    @KsYunField(name="TemplateType")
    private String TemplateType;

    /**按名称筛选*/
    @KsYunField(name="TemplateName")
    private String TemplateName;

    /**页码，默认1，最小1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**每页条数，默认10，最小1，最大100*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
