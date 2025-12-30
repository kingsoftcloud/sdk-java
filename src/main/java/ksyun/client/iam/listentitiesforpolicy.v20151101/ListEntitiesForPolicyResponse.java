package ksyun.client.iam.listentitiesforpolicy.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListEntitiesForPolicyResponse
* @Description ListEntitiesForPolicy 返回体
*/
@Data
@ToString
public class ListEntitiesForPolicyResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListEntitiesForPolicyResult")
    private ListEntitiesForPolicyResultDto ListEntitiesForPolicyResult;

    @Data
    @ToString
    public static class ListEntitiesForPolicyResultDto {
        /***/
        @JsonProperty("PolicyUsers")
        private ListEntitiesForPolicyResultPolicyUsersDto PolicyUsers;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultPolicyUsersDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultPolicyUsersMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultPolicyUsersMemberDto {
                /***/
                @JsonProperty("UserId")
                private String UserId;

                /***/
                @JsonProperty("UserName")
                private String UserName;

                /***/
                @JsonProperty("UserRealName")
                private String UserRealName;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

            }

        }

        /***/
        @JsonProperty("PolicyRoles")
        private ListEntitiesForPolicyResultPolicyRolesDto PolicyRoles;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultPolicyRolesDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultPolicyRolesMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultPolicyRolesMemberDto {
                /***/
                @JsonProperty("RoleId")
                private String RoleId;

                /***/
                @JsonProperty("RoleName")
                private String RoleName;

                /***/
                @JsonProperty("RoleDescription")
                private String RoleDescription;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

            }

        }

        /***/
        @JsonProperty("PolicyGroups")
        private ListEntitiesForPolicyResultPolicyGroupsDto PolicyGroups;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultPolicyGroupsDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultPolicyGroupsMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultPolicyGroupsMemberDto {
                /***/
                @JsonProperty("GroupId")
                private String GroupId;

                /***/
                @JsonProperty("GroupName")
                private String GroupName;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

                /***/
                @JsonProperty("GroupDescription")
                private String GroupDescription;

            }

        }

        /***/
        @JsonProperty("PolicyAccounts")
        private ListEntitiesForPolicyResultPolicyAccountsDto PolicyAccounts;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultPolicyAccountsDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultPolicyAccountsMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultPolicyAccountsMemberDto {
                /***/
                @JsonProperty("AccountId")
                private Integer AccountId;

                /***/
                @JsonProperty("AccountName")
                private String AccountName;

                /***/
                @JsonProperty("AccountUsername")
                private String AccountUsername;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

            }

        }

        /***/
        @JsonProperty("PolicyResourceDirs")
        private ListEntitiesForPolicyResultPolicyResourceDirsDto PolicyResourceDirs;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultPolicyResourceDirsDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultPolicyResourceDirsMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultPolicyResourceDirsMemberDto {
                /***/
                @JsonProperty("ResourceDirId")
                private String ResourceDirId;

                /***/
                @JsonProperty("ResourceDirName")
                private String ResourceDirName;

                /***/
                @JsonProperty("ResourceDirDescription")
                private String ResourceDirDescription;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

            }

        }

        /***/
        @JsonProperty("IsTruncated")
        private Boolean IsTruncated;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ListPoliciesResult")
    private ListPoliciesResultDto ListPoliciesResult;

    @Data
    @ToString
    public static class ListPoliciesResultDto {
        /***/
        @JsonProperty("Marker")
        private String Marker;

    }

}
