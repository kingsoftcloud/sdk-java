package ksyun.client.ked.queryusersinfo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryUsersinfoResponse
* @Description QueryUsersinfo 返回体
*/
@Data
@ToString
public class QueryUsersinfoResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("id")
        private Integer Id;

        /***/
        @JsonProperty("accountId")
        private Integer AccountId;

        /**用户名*/
        @JsonProperty("userName")
        private String UserName;

        /***/
        @JsonProperty("nickName")
        private String NickName;

        /***/
        @JsonProperty("phone")
        private String Phone;

        /***/
        @JsonProperty("email")
        private String Email;

        /**手机号或者邮箱*/
        @JsonProperty("phoneOrEmail")
        private String PhoneOrEmail;

        /**绑定云电脑台数*/
        @JsonProperty("deskNums")
        private Integer DeskNums;

        /**角色id*/
        @JsonProperty("roleId")
        private Integer RoleId;

        /**角色名称*/
        @JsonProperty("roleName")
        private String RoleName;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("updateTime")
        private String UpdateTime;

    }

}
