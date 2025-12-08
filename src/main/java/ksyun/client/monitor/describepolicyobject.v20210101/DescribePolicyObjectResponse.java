package ksyun.client.monitor.describepolicyobject.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribePolicyObjectResponse
* @Description DescribePolicyObject 返回体
*/
@Data
@ToString
public class DescribePolicyObjectResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**云服务类别，详见 [云服务类别](https://docs.ksyun.com/documents/42040)*/
        @JsonProperty("productType")
        private Integer ProductType;

        /***/
        @JsonProperty("instanceInfoList")
        private List<InstanceInfoListDto> InstanceInfoList;

        @Data
        @ToString
        public static class InstanceInfoListDto {
            /**资源ID*/
            @JsonProperty("instanceId")
            private String InstanceId;

            /**资源IP*/
            @JsonProperty("ip")
            private String Ip;

            /**资源名称*/
            @JsonProperty("instanceName")
            private String InstanceName;

        }

    }

    /**总记录数*/
    @JsonProperty("totalCount")
    private Integer TotalCount;

}
