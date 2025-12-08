package ksyun.client.kce.describenodecomponents.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNodeComponentsResponse
* @Description DescribeNodeComponents 返回体
*/
@Data
@ToString
public class DescribeNodeComponentsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**节点组件列表*/
        @JsonProperty("NodeComponents")
        private List<NodeComponentsDto> NodeComponents;

        @Data
        @ToString
        public static class NodeComponentsDto {
            /**节点ID*/
            @JsonProperty("NodeId")
            private String NodeId;

            /***/
            @JsonProperty("ComponentStatus")
            private List<ComponentStatusDto> ComponentStatus;

            @Data
            @ToString
            public static class ComponentStatusDto {
                /**组件类型*/
                @JsonProperty("Type")
                private String Type;

                /**组件当前参数版本*/
                @JsonProperty("CurVersion")
                private String CurVersion;

                /**组件期望参数版本*/
                @JsonProperty("SpecVersion")
                private String SpecVersion;

            }

        }

    }

}
