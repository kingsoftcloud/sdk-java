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
        private PolicyUsersDto PolicyUsers;

        @Data
        @ToString
        public static class PolicyUsersDto {
            /***/
            @JsonProperty("member")
            private List<MemberDto> Member;

            @Data
            @ToString
            public static class MemberDto {
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
        private PolicyRolesDto PolicyRoles;

        @Data
        @ToString
        public static class PolicyRolesDto {
            /***/
            @JsonProperty("member")
            private List<MemberDto> Member;

            @Data
            @ToString
            public static class MemberDto {
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
        private PolicyGroupsDto PolicyGroups;

        @Data
        @ToString
        public static class PolicyGroupsDto {
            /***/
            @JsonProperty("member")
            private List<MemberDto> Member;

            @Data
            @ToString
            public static class MemberDto {
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
        private PolicyAccountsDto PolicyAccounts;

        @Data
        @ToString
        public static class PolicyAccountsDto {
            /***/
            @JsonProperty("member")
            private List<MemberDto> Member;

            @Data
            @ToString
            public static class MemberDto {
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
        private PolicyResourceDirsDto PolicyResourceDirs;

        @Data
        @ToString
        public static class PolicyResourceDirsDto {
            /***/
            @JsonProperty("member")
            private List<MemberDto> Member;

            @Data
            @ToString
            public static class MemberDto {
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
