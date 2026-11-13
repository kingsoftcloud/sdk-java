package ksyun.client.aicp.getskillspace.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSkillSpaceResponse
* @Description GetSkillSpace 返回体
*/
@Data
@ToString
public class GetSkillSpaceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Id")
        private String Id;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("Creator")
        private String Creator;

        /***/
        @JsonProperty("CreateTimeStamp")
        private String CreateTimeStamp;

        /***/
        @JsonProperty("UpdateTimeStamp")
        private String UpdateTimeStamp;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
