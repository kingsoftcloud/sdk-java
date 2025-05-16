package ksyun.client.iam.listprojectmember.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListProjectMemberRequest
 * @Description 请求参数
 */
@Data
public class ListProjectMemberRequest {
    /**
     * 项目ID
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

}