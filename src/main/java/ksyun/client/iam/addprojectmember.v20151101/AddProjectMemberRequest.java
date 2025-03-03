package ksyun.client.iam.addprojectmember.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddProjectMemberRequest
 * @Description 请求参数
 */
@Data
public class AddProjectMemberRequest {
    /**
     * 项目ID
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

    /**
     * 如果成员类型是IAM子用户，传UserId
     * 如果成员类型是IAM角色，传RoleId
     */
    @KsYunField(name = "IdentityId")
    private String IdentityId;

    /**
     * 成员类型：1子用户，2角色
     */
    @KsYunField(name = "IdentityType")
    private Integer IdentityType;


}