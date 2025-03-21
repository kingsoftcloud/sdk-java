package ksyun.client.klog.updateproject.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateProjectRequest
 * @Description 请求参数
 */
@Data
public class UpdateProjectRequest {
    /**
     * 工程名称
     */
    @KsYunField(name = "ProjectName")
    private String ProjectName;

    /**
     * 工程描述
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * 项目id，不填写则不会改变绑定项目
     */
    @KsYunField(name = "IamProjectId")
    private Integer IamProjectId;

}