package ksyun.client.resourcemanager.listaccountsforparent.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAccountsForParentResponse
* @Description ListAccountsForParent 返回体
*/
@Data
@ToString
public class ListAccountsForParentResponse extends BaseResponseModel {

    /**成员列表*/
    @JsonProperty("Members")
    private List<MembersDto> Members;

    @Data
    @ToString
    public static class MembersDto {
        /**成员创建时间*/
        @JsonProperty("CreatedTime")
        private String CreatedTime;

        /**成员显示名称*/
        @JsonProperty("Name")
        private String Name;

        /**管理员权限：0-无，同步数据 1-有 2-变更中*/
        @JsonProperty("AdminPermission")
        private Integer AdminPermission;

        /**成员UID*/
        @JsonProperty("UserId")
        private Integer UserId;

        /**成员用户名*/
        @JsonProperty("UserName")
        private String UserName;

        /**账号类型：1-云账号 2-资源账号*/
        @JsonProperty("UserType")
        private Integer UserType;

        /**成员手机号*/
        @JsonProperty("Phone")
        private String Phone;

        /**成员所在资源夹ID*/
        @JsonProperty("FolderId")
        private String FolderId;

    }

    /**当前资源夹成员总数量*/
    @JsonProperty("Count")
    private Integer Count;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
