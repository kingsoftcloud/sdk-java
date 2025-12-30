package ksyun.client.iam.getgroup.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetGroupResponse
* @Description GetGroup 返回体
*/
@Data
@ToString
public class GetGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("GetGroupResult")
    private GetGroupResultDto GetGroupResult;

    @Data
    @ToString
    public static class GetGroupResultDto {
        /***/
        @JsonProperty("Group")
        private GetGroupResultGroupDto Group;

        @Data
        @ToString
        public static class GetGroupResultGroupDto {
            /**用户组ID*/
            @JsonProperty("Group")
            private GetGroupResultGroupGroupDto Group;

            @Data
            @ToString
            public static class GetGroupResultGroupGroupDto {
                /***/
                @JsonProperty("GroupId")
                private String GroupId;

                /***/
                @JsonProperty("Path")
                private String Path;

                /**用户组名称*/
                @JsonProperty("GroupName")
                private String GroupName;

                /**用户组描述*/
                @JsonProperty("Description")
                private String Description;

                /**创建时间*/
                @JsonProperty("CreateDate")
                private String CreateDate;

                /**用户组krn标识*/
                @JsonProperty("Krn")
                private String Krn;

                /***/
                @JsonProperty("GroupRealName")
                private String GroupRealName;

            }

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
