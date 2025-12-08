package ksyun.client.iam.createproject.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateProjectRequest
* @Description 请求参数
*/
@Data
public class CreateProjectRequest{
    /**项目名称，64个字符以内*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**项目描述*/
    @KsYunField(name="ProjectDesc")
    private String ProjectDesc;

}
