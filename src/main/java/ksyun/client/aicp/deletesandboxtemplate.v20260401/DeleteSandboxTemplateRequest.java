package ksyun.client.aicp.deletesandboxtemplate.v20260401;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSandboxTemplateRequest
* @Description 请求参数
*/
@Data
public class DeleteSandboxTemplateRequest{
    /**模板ID*/
    @KsYunField(name="TemplateId")
    private String TemplateId;

}
