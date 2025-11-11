package ksyun.client.klog.createproject.v20200731;

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
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

    /**工程描述*/
    @KsYunField(name="Description")
    private String Description;

    /**项目制ID，缺省时为默认项目*/
    @KsYunField(name="IamProjectId")
    private Integer IamProjectId;

}