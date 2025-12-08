package ksyun.client.iam.createrole.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateRoleResponse
* @Description CreateRole 返回体
*/
@Data
@ToString
public class CreateRoleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("CreateRoleResult")
    private CreateRoleResultDto CreateRoleResult;

    @Data
    @ToString
    public static class CreateRoleResultDto {
        /***/
        @JsonProperty("Role")
        private CreateRoleResultDtoRoleDto Role;

        @Data
        @ToString
        public static class CreateRoleResultDtoRoleDto {
            /***/
            @JsonProperty("Path")
            private String Path;

            /***/
            @JsonProperty("Krn")
            private String Krn;

            /***/
            @JsonProperty("RoleName")
            private String RoleName;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("TrustAccounts")
            private String TrustAccounts;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

            /***/
            @JsonProperty("RoleId")
            private String RoleId;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
