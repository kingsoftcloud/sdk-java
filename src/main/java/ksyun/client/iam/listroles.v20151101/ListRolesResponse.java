package ksyun.client.iam.listroles.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListRolesResponse
* @Description ListRoles 返回体
*/
@Data
@ToString
public class ListRolesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListRolesResult")
    private ListRolesResultDto ListRolesResult;

    @Data
    @ToString
    public static class ListRolesResultDto {
        /***/
        @JsonProperty("Roles")
        private ListRolesResultDtoRolesDto Roles;

        @Data
        @ToString
        public static class ListRolesResultDtoRolesDto {
            /***/
            @JsonProperty("member")
            private List<ListRolesResultDtoRolesDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListRolesResultDtoRolesDtoMemberDto {
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
                @JsonProperty("TrustType")
                private Integer TrustType;

                /***/
                @JsonProperty("TrustAccounts")
                private String TrustAccounts;

                /***/
                @JsonProperty("TrustServices")
                private List<String> TrustServices;

                /***/
                @JsonProperty("TrustProvider")
                private String TrustProvider;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

                /***/
                @JsonProperty("RoleId")
                private String RoleId;

                /***/
                @JsonProperty("ServiceRoleType")
                private Integer ServiceRoleType;

            }

        }

        /***/
        @JsonProperty("IsTruncated")
        private Boolean IsTruncated;

        /***/
        @JsonProperty("Marker")
        private String Marker;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
