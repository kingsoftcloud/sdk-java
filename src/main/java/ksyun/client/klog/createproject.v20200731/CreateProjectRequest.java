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

    /**所属地域*/
    @KsYunField(name="Region")
    private String Region;

    /**项目id，不填则默认为默认项目id*/
    @KsYunField(name="IamProjectId")
    private Integer IamProjectId;

    /**项目名称，不填则为默认项目名称，以IamProjectId为准*/
    @KsYunField(name="IamProjectName")
    private String IamProjectName;


}