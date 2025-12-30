package ksyun.client.iam.getaccountallprojectsbyparams.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetAccountAllProjectsByParamsResponse
* @Description GetAccountAllProjectsByParams 返回体
*/
@Data
@ToString
public class GetAccountAllProjectsByParamsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListProjectResult")
    private ListProjectResultDto ListProjectResult;

    @Data
    @ToString
    public static class ListProjectResultDto {
        /***/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("ProjectList")
        private List<ListProjectResultProjectListDto> ProjectList;

        @Data
        @ToString
        public static class ListProjectResultProjectListDto {
            /**项目ID*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**主账号ID*/
            @JsonProperty("AccountId")
            private String AccountId;

            /**项目名称*/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /**项目描述*/
            @JsonProperty("ProjectDesc")
            private String ProjectDesc;

            /**项目状态*/
            @JsonProperty("Status")
            private Integer Status;

            /**项目krn*/
            @JsonProperty("Krn")
            private String Krn;

            /**项目创建时间*/
            @JsonProperty("CreateTime")
            private String CreateTime;

        }

    }

}
