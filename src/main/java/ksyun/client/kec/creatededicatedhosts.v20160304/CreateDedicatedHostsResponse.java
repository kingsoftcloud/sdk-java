package ksyun.client.kec.creatededicatedhosts.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDedicatedHostsResponse
* @Description CreateDedicatedHosts 返回体
*/
@Data
@ToString
public class CreateDedicatedHostsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DedicatedHostSet")
    private List<DedicatedHostSetDto> DedicatedHostSet;

    @Data
    @ToString
    public static class DedicatedHostSetDto {
        /**专属宿主机ID*/
        @JsonProperty("DedicatedHostId")
        private String DedicatedHostId;

        /**专属宿主机名称*/
        @JsonProperty("DedicatedHostName")
        private String DedicatedHostName;

    }

}
