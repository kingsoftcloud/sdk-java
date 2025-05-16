package ksyun.client.iam.projectsinfobyinstanceids.v20240703;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ProjectsInfoByInstanceIdsRequest
 * @Description 请求参数
 */
@Data
public class ProjectsInfoByInstanceIdsRequest {
    /**
     * 实例ID，多个英文逗号分隔，min:1 max:100
     */
    @KsYunField(name = "InstanceIds")
    private String InstanceIds;

}