package ksyun.client.kce.describeaddoninstances.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAddonInstancesResponse
* @Description DescribeAddonInstances 返回体
*/
@Data
@ToString
public class DescribeAddonInstancesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Addons")
        private List<DataDtoAddonsDto> Addons;

        @Data
        @ToString
        public static class DataDtoAddonsDto {
            /**集群ID*/
            @JsonProperty("ClusterId")
            private String ClusterId;

            /**插件ID*/
            @JsonProperty("AddonId")
            private String AddonId;

            /**插件实例ID*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**插件类型*/
            @JsonProperty("Type")
            private String Type;

            /**是否删除*/
            @JsonProperty("ToDelete")
            private Boolean ToDelete;

            /**状态阶段*/
            @JsonProperty("Phase")
            private String Phase;

            /**创建时间*/
            @JsonProperty("CreatedTime")
            private String CreatedTime;

            /**更新时间*/
            @JsonProperty("UpdatedTime")
            private String UpdatedTime;

        }

    }

    /**参数*/
    @JsonProperty("Args")
    private ArgsDto Args;

    @Data
    @ToString
    public static class ArgsDto {
    }

}
