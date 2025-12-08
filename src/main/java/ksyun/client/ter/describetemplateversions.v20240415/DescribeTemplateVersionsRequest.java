package ksyun.client.ter.describetemplateversions.v20240415;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTemplateVersionsRequest
* @Description 请求参数
*/
@Data
public class DescribeTemplateVersionsRequest{
    /**模板ID
仅支持我的模板ID*/
    @KsYunField(name="TemplateId")
    private String TemplateId;

}
