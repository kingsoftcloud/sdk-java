package ksyun.client.iam.listgroups.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListGroupsResponse
* @Description ListGroups 返回体
*/
@Data
@ToString
public class ListGroupsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ListGroupsResult")
    private ListGroupsResultDto ListGroupsResult;

    @Data
    @ToString
    public static class ListGroupsResultDto {
        /***/
        @JsonProperty("Groups")
        private GroupsDto Groups;

        @Data
        @ToString
        public static class GroupsDto {
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
                @JsonProperty("Path")
                private String Path;

                /***/
                @JsonProperty("GroupName")
                private String GroupName;

                /***/
                @JsonProperty("Description")
                private String Description;

                /***/
                @JsonProperty("CreateDate")
                private String CreateDate;

                /***/
                @JsonProperty("Krn")
                private String Krn;

                /***/
                @JsonProperty("UserCount")
                private Integer UserCount;

                /***/
                @JsonProperty("PolicyCount")
                private Integer PolicyCount;

                /***/
                @JsonProperty("GroupRealName")
                private String GroupRealName;

            }

        }

        /***/
        @JsonProperty("IsTruncated")
        private Boolean IsTruncated;

        /***/
        @JsonProperty("Marker")
        private String Marker;

        /***/
        @JsonProperty("Total")
        private Integer Total;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
