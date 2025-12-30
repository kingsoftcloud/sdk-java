package ksyun.client.ter.describetemplates.v20240415;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTemplatesRequest
* @Description 请求参数
*/
@Data
public class DescribeTemplatesRequest{
    /**单次调用所返回的最大模板数目，取值范围5-1000
*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**模板Id*/
    @KsYunField(name="TemplateId",type=1)
    private List<String> TemplateIdList;

    /**偏移量*/
    @KsYunField(name="Offset")
    private Integer Offset;

    /**模板名称*/
    @KsYunField(name="TemplateName",type=1)
    private List<String> TemplateNameList;

    /**有效值：sample、custom
default：custom*/
    @KsYunField(name="TemplateType")
    private String TemplateType;

}
