package ksyun.client.ked.strategylist.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StrategylistResponse
* @Description Strategylist 返回体
*/
@Data
@ToString
public class StrategylistResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("pageNum")
        private Integer PageNum;

        /***/
        @JsonProperty("pageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("totalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("records")
        private List<DataRecordsDto> Records;

        @Data
        @ToString
        public static class DataRecordsDto {
            /***/
            @JsonProperty("id")
            private Integer Id;

            /**策略组唯一 id*/
            @JsonProperty("securityGroupId")
            private String SecurityGroupId;

            /**名称*/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("description")
            private String Description;

            /**已绑定云桌面数量*/
            @JsonProperty("instanceNum")
            private Integer InstanceNum;

            /**创建时间*/
            @JsonProperty("createTime")
            private String CreateTime;

            /**修改时间*/
            @JsonProperty("updateTime")
            private String UpdateTime;

        }

    }

}
