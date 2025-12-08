package ksyun.client.ked.userslist.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UserslistResponse
* @Description Userslist 返回体
*/
@Data
@ToString
public class UserslistResponse extends BaseResponseModel {
    /**成功为 200，其他错误码参考 http 状态码 其他错误码单独给出*/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("pageNum")
        private Integer PageNum;

        /***/
        @JsonProperty("pageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("totalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("records")
        private List<RecordsDto> Records;

        @Data
        @ToString
        public static class RecordsDto {
            /***/
            @JsonProperty("id")
            private Integer Id;

            /**创建时间*/
            @JsonProperty("createTime")
            private String CreateTime;

            /**用户名称*/
            @JsonProperty("userName")
            private String UserName;

            /**昵称*/
            @JsonProperty("nickName")
            private String NickName;

            /**用户状态 on: 启用 off: 禁用*/
            @JsonProperty("status")
            private String Status;

            /**已分配云电脑数量*/
            @JsonProperty("deskNums")
            private Integer DeskNums;

            /**角色 id*/
            @JsonProperty("roleId")
            private Integer RoleId;

            /**角色名称*/
            @JsonProperty("roleName")
            private String RoleName;

            /***/
            @JsonProperty("phoneOrEmail")
            private String PhoneOrEmail;

        }

    }

}
