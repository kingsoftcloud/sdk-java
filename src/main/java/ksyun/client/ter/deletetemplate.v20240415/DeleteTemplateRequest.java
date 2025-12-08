package ksyun.client.ter.deletetemplate.v20240415;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteTemplateRequest
* @Description 请求参数
*/
@Data
public class DeleteTemplateRequest{
    /***/
    @KsYunField(name="TemplateId")
    private String TemplateId;

}
