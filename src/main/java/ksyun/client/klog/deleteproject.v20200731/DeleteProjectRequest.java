package ksyun.client.klog.deleteproject.v20200731;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteProjectRequest
* @Description 请求参数
*/
@Data
public class DeleteProjectRequest{
    /**工程名称*/
    @KsYunField(name="ProjectName")
    private String ProjectName;

}
