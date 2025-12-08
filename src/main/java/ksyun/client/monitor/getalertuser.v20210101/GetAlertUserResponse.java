package ksyun.client.monitor.getalertuser.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetAlertUserResponse
* @Description GetAlertUser 返回体
*/
@Data
@ToString
public class GetAlertUserResponse extends BaseResponseModel {
    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**联系人列表*/
        @JsonProperty("userList")
        private UserListDto UserList;

        @Data
        @ToString
        public static class UserListDto {
            /**联系人ID*/
            @JsonProperty("userId")
            private Integer UserId;

            /**联系人名称*/
            @JsonProperty("userName")
            private String UserName;

            /**联系人邮箱*/
            @JsonProperty("userEmail")
            private String UserEmail;

            /**联系人电话*/
            @JsonProperty("userPhone")
            private String UserPhone;

            /**归属的联系组列表*/
            @JsonProperty("userGroups")
            private List<UserGroupsDto> UserGroups;

            @Data
            @ToString
            public static class UserGroupsDto {
                /**联系组ID*/
                @JsonProperty("userGrpId")
                private Integer UserGrpId;

                /**联系组名称*/
                @JsonProperty("groupName")
                private String GroupName;

            }

            /**联系人状态。取值：
- 1：启用
- 2：禁用*/
            @JsonProperty("userStatus")
            private Integer UserStatus;

        }

    }

    /**总记录数*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

    /**请求ID*/
    @JsonProperty("requestId")
    private String RequestId;

}
