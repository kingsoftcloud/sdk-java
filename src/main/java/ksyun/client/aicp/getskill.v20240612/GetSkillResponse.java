package ksyun.client.aicp.getskill.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSkillResponse
* @Description GetSkill 返回体
*/
@Data
@ToString
public class GetSkillResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**skill id*/
        @JsonProperty("Id")
        private String Id;

        /**skill 名称*/
        @JsonProperty("Name")
        private String Name;

        /**skill 状态*/
        @JsonProperty("Status")
        private String Status;

        /**skill 描述*/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("CreateTimeStamp")
        private String CreateTimeStamp;

        /***/
        @JsonProperty("UpdateTimeStamp")
        private String UpdateTimeStamp;

    }

}
