package ksyun.client.iam.listgroupsforuser.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListGroupsForUserResponse
* @Description ListGroupsForUser 返回体
*/
@Data
@ToString
public class ListGroupsForUserResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListGroupsForUserResult")
    private ListGroupsForUserResultDto ListGroupsForUserResult;

    @Data
    @ToString
    public static class ListGroupsForUserResultDto {
        /***/
        @JsonProperty("Groups")
        private ListGroupsForUserResultGroupsDto Groups;

        @Data
        @ToString
        public static class ListGroupsForUserResultGroupsDto {
            /***/
            @JsonProperty("member")
            private List<ListGroupsForUserResultGroupsMemberDto> Member;

            @Data
            @ToString
            public static class ListGroupsForUserResultGroupsMemberDto {
                /***/
                @JsonProperty("Id")
                private Integer Id;

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
                @JsonProperty("PolicyCount")
                private Integer PolicyCount;

                /**别名*/
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
