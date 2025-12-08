package ksyun.client.iam.deleteprojectmember.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteProjectMemberRequest
* @Description 请求参数
*/
@Data
public class DeleteProjectMemberRequest{
    /**项目id*/
    @KsYunField(name="ProjectId")
    private Integer ProjectId;

    /**要移除的成员id*/
    @KsYunField(name="MemberIds")
    private String MemberIds;

}
