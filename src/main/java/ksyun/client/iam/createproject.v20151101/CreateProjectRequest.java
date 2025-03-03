package ksyun.client.iam.createproject.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateProjectRequest
 * @Description 请求参数
 */
@Data
public class CreateProjectRequest {
    /**
     * 项目名称，64个字符以内
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 项目描述
     */
    @KsYunField(name = "ProjectDesc")
    private String ProjectDesc;


}