package ksyun.client.iam.creategroup.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateGroupResponse
* @Description CreateGroup 返回体
*/
@Data
@ToString
public class CreateGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CreateGroupResult")
    private CreateGroupResultDto CreateGroupResult;

    @Data
    @ToString
    public static class CreateGroupResultDto {
        /***/
        @JsonProperty("Group")
        private CreateGroupResultGroupDto Group;

        @Data
        @ToString
        public static class CreateGroupResultGroupDto {
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
            @JsonProperty("GroupRealName")
            private String GroupRealName;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("CreateDate")
            private String CreateDate;

            /***/
            @JsonProperty("Krn")
            private String Krn;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
