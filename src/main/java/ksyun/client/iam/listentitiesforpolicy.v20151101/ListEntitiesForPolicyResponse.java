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
        private ListEntitiesForPolicyResultDtoPolicyUsersDto PolicyUsers;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultDtoPolicyUsersDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultDtoPolicyUsersDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultDtoPolicyUsersDtoMemberDto {
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
        private ListEntitiesForPolicyResultDtoPolicyRolesDto PolicyRoles;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultDtoPolicyRolesDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultDtoPolicyRolesDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultDtoPolicyRolesDtoMemberDto {
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
        private ListEntitiesForPolicyResultDtoPolicyGroupsDto PolicyGroups;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultDtoPolicyGroupsDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultDtoPolicyGroupsDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultDtoPolicyGroupsDtoMemberDto {
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
        private ListEntitiesForPolicyResultDtoPolicyAccountsDto PolicyAccounts;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultDtoPolicyAccountsDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultDtoPolicyAccountsDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultDtoPolicyAccountsDtoMemberDto {
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
        private ListEntitiesForPolicyResultDtoPolicyResourceDirsDto PolicyResourceDirs;

        @Data
        @ToString
        public static class ListEntitiesForPolicyResultDtoPolicyResourceDirsDto {
            /***/
            @JsonProperty("member")
            private List<ListEntitiesForPolicyResultDtoPolicyResourceDirsDtoMemberDto> Member;

            @Data
            @ToString
            public static class ListEntitiesForPolicyResultDtoPolicyResourceDirsDtoMemberDto {
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
