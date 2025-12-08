package ksyun.client.iam.getrole.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRoleResponse
* @Description GetRole 返回体
*/
@Data
@ToString
public class GetRoleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("GetRoleResult")
    private GetRoleResultDto GetRoleResult;

    @Data
    @ToString
    public static class GetRoleResultDto {
        /***/
        @JsonProperty("Role")
        private RoleDto Role;

        @Data
        @ToString
        public static class RoleDto {
            /**角色id*/
            @JsonProperty("Id")
            private Integer Id;

            /***/
            @JsonProperty("Path")
            private String Path;

            /**角色krn*/
            @JsonProperty("Krn")
            private String Krn;

            /**角色名称*/
            @JsonProperty("RoleName")
            private String RoleName;

            /**角色描述*/
            @JsonProperty("Description")
            private String Description;

            /**角色授信账号*/
            @JsonProperty("TrustAccounts")
            private String TrustAccounts;

            /**角色的授信服务*/
            @JsonProperty("TrustServices")
            private String TrustServices;

            /***/
            @JsonProperty("TrustProvider")
            private String TrustProvider;

            /***/
            @JsonProperty("ProviderList")
            private List<String> ProviderList;

            /**授信实体类型：1金山云账号，2金山云服务，3身份提供商*/
            @JsonProperty("TrustType")
            private Integer TrustType;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

            /**角色uuid*/
            @JsonProperty("RoleId")
            private String RoleId;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
