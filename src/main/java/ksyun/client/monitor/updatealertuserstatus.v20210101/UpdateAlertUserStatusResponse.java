package ksyun.client.monitor.updatealertuserstatus.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateAlertUserStatusResponse
* @Description UpdateAlertUserStatus 返回体
*/
@Data
@ToString
public class UpdateAlertUserStatusResponse extends BaseResponseModel {
    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**告警联系人列表。*/
        @JsonProperty("userList")
        private List<UserListDto> UserList;

        @Data
        @ToString
        public static class UserListDto {
            /**告警联系人ID。*/
            @JsonProperty("userId")
            private Integer UserId;

            /**告警联系人名称。*/
            @JsonProperty("userName")
            private String UserName;

            /**告警联系人邮箱。*/
            @JsonProperty("userEmail")
            private String UserEmail;

            /**告警联系人电话。*/
            @JsonProperty("userPhone")
            private String UserPhone;

            /**告警联系人所属联系组名称。*/
            @JsonProperty("groupName")
            private String GroupName;

            /**告警联系组ID*/
            @JsonProperty("userGrpId")
            private Integer UserGrpId;

            /**告警联系人状态。取值范围：
- 1：启用
- 2：禁用*/
            @JsonProperty("userStatus")
            private Integer UserStatus;

        }

    }

    /**总数。*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

    /**请求ID。*/
    @JsonProperty("requestId")
    private String RequestId;

}
