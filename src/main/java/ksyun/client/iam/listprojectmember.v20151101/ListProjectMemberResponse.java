package ksyun.client.iam.listprojectmember.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListProjectMemberResponse
* @Description ListProjectMember 返回体
*/
@Data
@ToString
public class ListProjectMemberResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListProjectMember")
    private List<ListProjectMemberDto> ListProjectMember;

    @Data
    @ToString
    public static class ListProjectMemberDto {
        /**成员ID*/
        @JsonProperty("MemberId")
        private Integer MemberId;

        /**成员类型：1子用户，2角色*/
        @JsonProperty("IdentityType")
        private Integer IdentityType;

        /**成员名称：子用户的用户名或角色的角色名称*/
        @JsonProperty("IdentityName")
        private String IdentityName;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**成员krn*/
        @JsonProperty("Krn")
        private String Krn;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
